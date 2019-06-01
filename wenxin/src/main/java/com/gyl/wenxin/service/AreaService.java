package com.gyl.wenxin.service;

import com.gyl.wenxin.entity.Area;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author guoyunlong
 * Date 2019/2/24
 * Time 12:04
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public interface AreaService {
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
    boolean insertArea(Area area);

    /**
     *更新区域
     * @param area
     * @return
     */
    boolean updateArea(Area area);

    /**
     * 删除区域
     * @param areaId
     * @return
     */
    boolean deleterArea(int areaId);
}
