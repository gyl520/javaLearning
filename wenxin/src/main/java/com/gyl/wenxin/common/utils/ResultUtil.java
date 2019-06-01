package com.gyl.wenxin.common.utils;

/**
 * Created with IntelliJ IDEA.
 *
 * @author guoyunlong
 * Date 2019/4/13
 * Time 18:55
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class ResultUtil {

    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

}
