package com.otechsolution.inventory.dto;

import lombok.Data;

/**
 * @author yuandongfei
 */
@Data
public class InventoryDetailDTO extends InvDetailDTO {
    private InvDetailCalculateDTO calculate;
    private InvDetailOtherDTO other;
}
