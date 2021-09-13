package com.otechsolution.ccp.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.otechsolution.ccp.entity.CcpHeader;
import com.otechsolution.ccp.mapper.CcpHeaderMapper;
import com.otechsolution.ccp.service.CcpHeaderService;
import org.springframework.stereotype.Service;

@Service
public class CcpHeaderServiceImpl extends ServiceImpl<CcpHeaderMapper,CcpHeader> implements CcpHeaderService {

}