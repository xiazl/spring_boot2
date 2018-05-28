package com.fly.caipiao.comment.configuration.aop;

import com.fly.caipiao.comment.web.vo.ApiResultVO;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.HandlerMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
/**
 * @author baidu
 * @date 2018/5/20 下午10:30
 * @description 异常处理
 **/

@ControllerAdvice
public class ExceptionAdvice {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @ExceptionHandler({Throwable.class})
    @ResponseBody
    public Object handlerException(
            HttpServletRequest request,
            HttpServletResponse response,
            HandlerMethod handlerMethod,
            Throwable throwable) throws Throwable {
        // fetch root Exception wraped by HystrixRuntimeException
        logger.error("server exception：", throwable);
        Throwable cause = throwable;

        ApiResultVO result = new ApiResultVO();

        if (cause instanceof MethodArgumentNotValidException) {
            MethodArgumentNotValidException e = (MethodArgumentNotValidException) cause;
            List<String> list = new ArrayList<>();
            for (FieldError fieldError : e.getBindingResult().getFieldErrors()) {
                list.add(fieldError.getDefaultMessage());
            }
            result.setMessage(StringUtils.join(list, ","));
        }else{
            result.setMessage(cause.getMessage());
        }
        return result;
    }
}
