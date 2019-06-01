package com.gyl.wenxin.dao;

import com.gyl.wenxin.entity.Area;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author guoyunlong
 * Date 2019/1/3
 * Time 11:05
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public interface AreaDao {
    /**
     * 列出区域列表
     * @return
     */
    List<Area> queryArea();

    /**
     * 根据Id列出具体区域
     * @param areId
     * @return
     */
    Area queryAreaById(int areId);

    /**
     * 插入区域信息
     * @param area
     * @return
     */
    int insertArea(Area area);

    /**
     *更新区域
     * @param area
     * @return
     */
    int updateArea(Area area);

    /**
     * 删除区域
     * @param areaId
     * @return
     */
    int deleterArea(int areaId);
}
