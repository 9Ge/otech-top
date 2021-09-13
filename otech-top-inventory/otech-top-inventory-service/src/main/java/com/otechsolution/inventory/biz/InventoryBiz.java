package com.otechsolution.inventory.biz;

import com.otechsolution.inventory.dto.InventoryDetailDTO;
import com.otechsolution.inventory.dto.InventoryRequest;
import com.otechsolution.inventory.entity.InvDetail;
import com.otechsolution.inventory.entity.InvHeader;
import com.otechsolution.inventory.service.*;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

/**
 * 核注清单业务层服务类
 *
 * @author yuandongfei
 */
@Service
public class InventoryBiz {
    private final InvHeaderService headerService;
    private final InvHeaderDeclarationInfoService headerDeclarationInfoService;
    private final InvHeaderExtendService headerExtendService;
    private final InvHeaderCompanyService headerCompanyService;
    private final InvHeaderConsigneeConsignorService headerConsigneeConsignorService;
    private final InvDetailService detailService;
    private final InvDetailCalculateService detailCalculateService;
    private final InvDetailOtherService detailOtherService;

    public InventoryBiz(InvHeaderService headerService,
                        InvHeaderDeclarationInfoService headerDeclarationInfoService,
                        InvHeaderExtendService headerExtendService,
                        InvHeaderCompanyService headerCompanyService,
                        InvHeaderConsigneeConsignorService headerConsigneeConsignorService,
                        InvDetailService detailService,
                        InvDetailCalculateService detailCalculateService,
                        InvDetailOtherService detailOtherService) {
        this.headerService = headerService;
        this.headerDeclarationInfoService = headerDeclarationInfoService;
        this.headerExtendService = headerExtendService;
        this.headerCompanyService = headerCompanyService;
        this.headerConsigneeConsignorService = headerConsigneeConsignorService;
        this.detailService = detailService;
        this.detailCalculateService = detailCalculateService;
        this.detailOtherService = detailOtherService;
    }


    /**
     * 新增核注清单
     *
     * @param request
     */
    @Transactional(rollbackFor = Exception.class)
    public void insertInventory(InventoryRequest request) {
        InvHeader header = headerService.insert(request);
        if (Objects.nonNull(header)) {
            headerDeclarationInfoService.insert(header.getId(), header.getClientId(), request.getDeclaration());
            headerExtendService.insert(header.getId(), header.getClientId(), request.getExtend());
            headerCompanyService.insert(header.getId(), header.getClientId(), request.getCompany());
            headerConsigneeConsignorService.insert(header.getId(), header.getClientId(), request.getConsigneeConsignor());
            insertDetail(header.getId(), header.getClientId(), request.getDetailList());
        }
    }

    /**
     * 插入detail
     *
     * @param clientId
     * @param headerId
     * @param list
     */
    private void insertDetail(Long headerId, Long clientId, List<InventoryDetailDTO> list) {
        if (CollectionUtils.isNotEmpty(list)) {
            for (InventoryDetailDTO item : list) {
                InvDetail detail = detailService.insert(headerId, clientId, item);
                if (Objects.nonNull(detail)) {
                    detailCalculateService.insert(detail.getId(), clientId, item.getCalculate());
                    detailOtherService.insert(detail.getId(), clientId, item.getOther());
                }
            }
        }
    }
}
