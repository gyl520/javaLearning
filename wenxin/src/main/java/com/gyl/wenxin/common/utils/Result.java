package com.gyl.wenxin.common.utils;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @author guoyunlong
 * Date 2019/4/13
 * Time 19:02
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
public class Result<T> {
    /**
     * 错误码.
     */
    private Integer code;
    /**
     * 提示信息.
     */
    private String msg;
    /**
     * 具体的内容.
     */
    private T data;


}
