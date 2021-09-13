package com.otechsolution.out.service.ccs.handler;

import com.otechsolution.common.exception.ResultCode;
import com.otechsolution.web.result.ApiResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by yangcheng on 2021/1/29.
 * 参数校验异常处理，捕获所有Controller中抛出的异常。
 */
@ControllerAdvice(basePackages = "com.otechsolution.out.web.controller.ccs")
@Slf4j
public class ConstraintViolationExceptionHandler {

   @ExceptionHandler(ConstraintViolationException.class)
   @ResponseBody
   public ApiResult customHandler(ConstraintViolationException e){
      return new ApiResult(ResultCode.FAILED,getResultMap(e));
   }

   @ExceptionHandler(Exception.class)
   @ResponseBody
   public ApiResult exceptionHandler(Exception e){
      e.printStackTrace();
      return new ApiResult(ResultCode.ERROR,e.getMessage());
   }

   private Map<String, String> getResultMap(ConstraintViolationException e) {
      Set<ConstraintViolation<?>> constraintViolations = e.getConstraintViolations();
      Map<String , String > resultMap = new HashMap<>();
      for (ConstraintViolation<?> constraintViolation:constraintViolations) {
         pushVal2Map(resultMap, constraintViolation);
      }
      return resultMap;
   }

   private void pushVal2Map(Map<String, String> resultMap, ConstraintViolation<?> constraintViolation) {
      String property = constraintViolation.getPropertyPath().toString();
      property = this.getProperty(property);
      String message = constraintViolation.getMessage();
      resultMap.put(property,message);
   }

   private String getProperty(String property) {
      int start = property.lastIndexOf(".");
      int end = property.length();
      return property.substring(start+1, end);
   }

}