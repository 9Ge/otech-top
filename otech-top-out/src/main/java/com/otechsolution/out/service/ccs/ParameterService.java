package com.otechsolution.out.service.ccs;

import com.otechsolution.common.exception.OtechException;
import com.otechsolution.common.exception.ResultCode;
import com.otechsolution.common.spring.SpringContextHolder;
import com.otechsolution.common.util.ObjectMapperUtil;
import com.otechsolution.parameters.biz.QueryParametersTablesBiz;
import com.otechsolution.parameters.constant.ParametersTablesEnum;
import com.otechsolution.parameters.dto.CCPParameterSearchParamDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;

import java.util.Map;

/**
 * @Date 14:13
 * @ClassName: ParameterService
 * @Author: YANGCHENG.
 * @Version:1.0
 */
@Slf4j
public class ParameterService {

    QueryParametersTablesBiz queryParametersTablesBiz = (QueryParametersTablesBiz)SpringContextHolder.getBean(QueryParametersTablesBiz.class);

    public String getCodeTs(String name) throws OtechException{
        if(name==null||name.trim().equals("")){
            return "0101210010";
        }
        CCPParameterSearchParamDTO dto = getCcpParameterSearchParamDTO(name);
        try {
            return codeByMap(queryParametersTablesBiz.queryBySearchDTO(ParametersTablesEnum.COMPLEX, dto));
        } catch (OtechException e) {
            return name;
        }
    }

    public  String getUnit(String name) throws OtechException{
        if(name==null||name.trim().equals("")){
            return "000";
        }
        CCPParameterSearchParamDTO dto = getCcpParameterSearchParamDTO(name);
        try {
            return codeByMap(queryParametersTablesBiz.queryBySearchDTO(ParametersTablesEnum.UNIT, dto));
        } catch (OtechException e) {
           return "000";
        }
    }

    public String getCountry(String name) throws OtechException{
        if(name==null||name.trim().equals("")){
            return null;
        }
        CCPParameterSearchParamDTO dto = getCcpParameterSearchParamDTO(name);
        try {
            return codeByMap(queryParametersTablesBiz.queryBySearchDTO(ParametersTablesEnum.COUNTRY, dto));
        } catch (OtechException e) {
            return null;
        }
    }

    private CCPParameterSearchParamDTO getCcpParameterSearchParamDTO(String name) {
        CCPParameterSearchParamDTO dto = new CCPParameterSearchParamDTO();
        dto.setName(name);
        return dto;
    }


    private String codeByMap(Object object) throws OtechException{
        try {
            Assert.notNull(object,"the codeTs get Object is null");
        } catch (Exception e) {
            throw new OtechException("当前编码名称没有对应数据",ResultCode.FAILED);
        }

        CCPParameterSearchParamDTO cDto = ObjectMapperUtil.convertTo(ObjectMapperUtil.writeValueAsString(object),CCPParameterSearchParamDTO.class);
        try {
            return String.valueOf(getValue(cDto));
        } catch (OtechException e) {
            throw  e;
        }
    }

    private Object getValue(CCPParameterSearchParamDTO cDto) throws OtechException{
        String value = cDto.getCode();
        if(value ==null){
            throw new OtechException("对应Code Null",ResultCode.FAILED);
        }
        return  value;
    }


}
