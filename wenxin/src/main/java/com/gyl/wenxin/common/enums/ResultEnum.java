package com.gyl.wenxin.common.enums;

/**
 * Created with IntelliJ IDEA.
 *
 * @author guoyunlong
 * Date 2019/4/13
 * Time 19:00
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public enum  ResultEnum {
    //定义类型
    UNKONW_ERROR(-1,"未知错误"),
    SUCCESS(0,"成功"),
    PRIMARY_SCHOOL(100,"我猜你可能还在上小学"),
    MIDDLE_SCHOOL(101,"你可能在上初中");
    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static ResultEnum getResultEnumByCode(int code) {
        for (ResultEnum c : ResultEnum.values()) {
            if (c.code == code) {
                return c;
            }
        }
        return null;
    }
    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
