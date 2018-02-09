package com.tanwuapp.tanwudemo.exception;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tanwuapp.tanwudemo.util.LogUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    public static final String DEFAULT_ERROR_VIEW = "error";

    /**
     * 统一异常处理
     * @param request
     * @param e
     * @return
     * @throws Exception
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ErrorInfo<String> defaultErrorHandler(HttpServletRequest request, Exception e) throws Exception {
        ErrorInfo<String> r = new ErrorInfo<>();
        r.setMessage("网络错误");
        r.setCode(ErrorInfo.ERROR);
        r.setUrl(request.getRequestURL().toString());
        // 处理错误参数
        Map<String, String[]> params = request.getParameterMap();
        ObjectMapper mapper = new ObjectMapper();
        String data = mapper.writeValueAsString(params);
        r.setData(data);
        String reqStr = mapper.writeValueAsString(r);
        LogUtils.error(reqStr,e);
        return r;
    }

}
