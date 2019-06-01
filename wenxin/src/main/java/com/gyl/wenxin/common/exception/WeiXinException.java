package com.gyl.wenxin.common.exception;

import com.gyl.wenxin.common.enums.ResultEnum;

/**
 * Created with IntelliJ IDEA.
 *
 * @author guoyunlong
 * Date 2019/4/13
 * Time 19:10
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class WeiXinException extends RuntimeException {
    private Integer code;

    public WeiXinException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

}
