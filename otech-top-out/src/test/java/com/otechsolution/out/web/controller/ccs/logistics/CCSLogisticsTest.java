package com.otechsolution.out.web.controller.ccs.logistics;

import com.otechsolution.common.util.ObjectMapperUtil;
import com.otechsolution.out.entity.ccs.CCSLogistics;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import javax.validation.constraints.NotNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

/**
 * @Date 16:35
 * @ClassName: CSSLogisticsControllerTest
 * @Author: YANGCHENG.
 * @Version:1.0
 */
@SpringBootTest
@Slf4j
public class CCSLogisticsTest {

    @Test
    public void restTest(){
        String str = "{\"ClientId\":0,\"UserId\":0,\"ItemType\":\"E\",\"PartNumber\":\"ccc\",\"CodeTS\":\"0101210010\",\"PartCNName\":\"asdasa\",\"CiqCode\":\"\",\"CiqName\":\"\",\"PartENName\":\"\",\"PartModel\":\"\",\"FirstUnit\":\"035\",\"SecondUnit\":\"035\",\"GUnit\":\"002\",\"BondedFlag\":\"0\",\"UnitPrice\":\"\",\"Currency\":\"\",\"AdjmtrMarkcd\":\"\",\"HBPartModel\":\"\",\"StartDate\":\"2021-01-28\",\"StopDate\":\"\",\"Remark\":\"\",\"LicensedCode\":\"\",\"OriginCountry\":\"\",\"BpId\":\"\",\"CustomerItem\":\"\",\"ChangeReason\":\"asdasda\",\"Remark1\":\"\",\"Remark2\":\"asdasa\",\"InnerPackage\":\"asdasa\",\"PartDescriptionCN\":\"asdasd\",\"PartDescriptionEN\":\"\"}";
        HashMap<String, String> paramMap= ObjectMapperUtil.convertTo(str, HashMap.class);
        Set<String> set = paramMap.keySet();

        MultiValueMap<String, Object> map = new LinkedMultiValueMap<String, Object>();
        for (String key:set) {
            map.put(key, Collections.singletonList(String.valueOf(paramMap.get(key))));
        }
        CCSLogistics json = ObjectMapperUtil.convertTo(str,CCSLogistics.class);
        log.info("{}",json);
        log.info("{}",map);
    }
    @Test
    public void nullTest(){
      this.outTest(null);
    }

    public void outTest(@NotNull String all){
        System.out.println(all);
    }


}