package com.otechsolution.ccp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.otechsolution.ccp.entity.CcpHeaderStorage;
import com.otechsolution.ccp.mapper.CcpHeaderStorageMapper;
import com.otechsolution.ccp.service.CcpHeaderStorageService;
import org.springframework.stereotype.Service;

@Service
public class CcpHeaderStorageServiceImpl extends ServiceImpl<CcpHeaderStorageMapper,CcpHeaderStorage> implements CcpHeaderStorageService {
}
