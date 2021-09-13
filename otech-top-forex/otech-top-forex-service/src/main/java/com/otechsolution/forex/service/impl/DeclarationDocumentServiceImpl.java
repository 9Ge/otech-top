package com.otechsolution.forex.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.otechsolution.forex.dto.DeclarationDocumentDTO;
import com.otechsolution.forex.entity.DeclarationDocument;
import com.otechsolution.forex.mapper.DeclarationDocumentMapper;
import com.otechsolution.forex.service.DeclarationDocumentService;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * @author yuandongfei
 */
@Service
public class DeclarationDocumentServiceImpl extends ServiceImpl<DeclarationDocumentMapper, DeclarationDocument> implements DeclarationDocumentService {

    @Override
    public void insertList(Long forexId, List<DeclarationDocumentDTO> list) {
        if (Objects.nonNull(forexId) && CollectionUtils.isNotEmpty(list)) {
            for (DeclarationDocumentDTO item : list) {
                DeclarationDocument record = item.toEntity();
                record.setForexId(forexId);
                getBaseMapper().insert(record);
            }
        }
    }
}