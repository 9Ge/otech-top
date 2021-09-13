package com.otechsolution.out.service.integration;

import com.otechsolution.out.dto.integration.WhMoveRequest;
import com.otechsolution.out.entity.OpenAppInfo;
import com.otechsolution.sqlserver.DataServerUrlEnum;
import com.otechsolution.sqlserver.OtechDataServer;
import com.otechsolution.web.signer.filter.SignatureRequestBody;
import com.otechsolution.web.signer.filter.SignatureRequestHolder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yuandongfei
 */
@Service
public class WhMoveService {
    private final OtechDataServer otechDataServer;

    public WhMoveService(OtechDataServer otechDataServer) {
        this.otechDataServer = otechDataServer;
    }

    public void save(WhMoveRequest request) {
        SignatureRequestBody<OpenAppInfo> requestBody = SignatureRequestHolder.get();
        Map<String, Object> param = new HashMap<>(2);
        param.put("db", requestBody.getOpenInfo().getDbName());
        param.put("data", request);
        otechDataServer.postData(param, DataServerUrlEnum.MOVE);
    }
}
