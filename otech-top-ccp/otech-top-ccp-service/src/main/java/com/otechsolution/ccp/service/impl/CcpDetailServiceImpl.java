package com.otechsolution.ccp.service.impl;


import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.otechsolution.ccp.entity.CcpDetail;
import com.otechsolution.ccp.mapper.CcpDetailMapper;
import com.otechsolution.ccp.service.CcpDetailService;
import org.springframework.stereotype.Service;

@Service
public class CcpDetailServiceImpl extends ServiceImpl<CcpDetailMapper,CcpDetail> implements CcpDetailService {

}