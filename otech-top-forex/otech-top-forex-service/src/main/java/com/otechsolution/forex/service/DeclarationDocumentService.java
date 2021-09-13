package com.otechsolution.forex.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.otechsolution.forex.dto.DeclarationDocumentDTO;
import com.otechsolution.forex.entity.DeclarationDocument;

import java.util.List;

/**
 * @author yuandongfei
 */
public interface DeclarationDocumentService extends IService<DeclarationDocument> {

    void insertList(Long forexId, List<DeclarationDocumentDTO> list);
}