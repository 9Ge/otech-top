package com.otechsolution.inventory.dto;

import lombok.Data;

import java.util.List;

/**
 * Biz业务处理请求对象
 *
 * @author yuandongfei
 */
@Data
public class InventoryRequest extends InvHeaderDTO {
    private InvHeaderCompanyDTO company;
    private InvHeaderConsigneeConsignorDTO consigneeConsignor;
    private InvHeaderDeclarationInfoDTO declaration;
    private InvHeaderExtendDTO extend;
    private List<InventoryDetailDTO> detailList;
}
