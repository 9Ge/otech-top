package com.otechsolution.out.web.controller.ccs;

import com.otechsolution.common.spring.SpringContextHolder;
import com.otechsolution.parameters.biz.QueryParametersTablesBiz;
import com.otechsolution.parameters.constant.ParametersTablesEnum;
import com.otechsolution.parameters.dto.CCPParameterSearchParamDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Date 11:12
 * @ClassName: QueryParametersTablesBizTest
 * @Author: YANGCHENG.
 * @Version:1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class QueryParametersTablesBizTest {

    @Autowired
    QueryParametersTablesBiz queryParametersTablesBiz ;//= SpringContextHolder.getBean(QueryParametersTablesBiz.class)

    @Test
    public void queryTest(){
        CCPParameterSearchParamDTO dto  = new CCPParameterSearchParamDTO();
        dto.setName("盒");
        log.info("{}", (Object) queryParametersTablesBiz.queryBySearchDTO(ParametersTablesEnum.UNIT,dto));
    }
}