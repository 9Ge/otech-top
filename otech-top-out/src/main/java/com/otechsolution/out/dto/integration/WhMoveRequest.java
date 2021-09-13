package com.otechsolution.out.dto.integration;

import com.otechsolution.out.entity.integration.WhMoveDetail;
import com.otechsolution.out.entity.integration.WhMoveHeader;
import lombok.Data;

import java.util.List;

@Data
public class WhMoveRequest {
    private WhMoveHeader header;
    private List<WhMoveDetail> detailList;
}
