package com.gyl.wenxin.entity;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @author guoyunlong
 * Date 2018/12/2
 * Time 14:39
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Area {
    //主键
    private Integer areaId;
    //名称
    private  String areaName;
    //权重
    private Integer priorrity;
    //创建时间
    private Date createTime;
    //更新时间
    private Date updateTime;

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getPriorrity() {
        return priorrity;
    }

    public void setPriorrity(Integer priorrity) {
        this.priorrity = priorrity;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
