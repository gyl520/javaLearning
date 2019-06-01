package com.gyl.wenxin.handler;

import com.gyl.wenxin.common.exception.WeiXinException;
import com.gyl.wenxin.common.utils.Result;
import com.gyl.wenxin.common.utils.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @author guoyunlong
 * Date 2019/4/13
 * Time 16:46
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public  Result exceptionHandler(HttpServletRequest request, Exception e) {
        Map<String, Object> modeMap = new HashMap<>();
        if (e instanceof WeiXinException) {
            WeiXinException weiXinException = (WeiXinException) e;
            return ResultUtil.error(weiXinException.getCode(), weiXinException.getMessage());
        } else {
            log.error("【系统异常】{}", e);
            return ResultUtil.error(-1, "未知错误");
        }
       /* modeMap.put("success", false);
        modeMap.put("errMsg", e.getMessage());
        return modeMap;*/
    }
}
