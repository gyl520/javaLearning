package com.gyl.wenxin.service.impl;

import com.gyl.wenxin.dao.AreaDao;
import com.gyl.wenxin.entity.Area;
import com.gyl.wenxin.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author guoyunlong
 * Date 2019/2/24
 * Time 12:05
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaDao areaDao;
    @Override
    public List<Area> queryArea() {
        return areaDao.queryArea();
    }

    @Override
    public Area queryAreaById(int areId) {
        return areaDao.queryAreaById(areId);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean insertArea(Area area) {
        if (!StringUtils.isEmpty(area.getAreaName())){
            area.setCreateTime(new Date());
            area.setUpdateTime(new Date());
            try{
                int effectNum = areaDao.insertArea(area);
                if(effectNum > 0){
                    return true ;
                }else {
                    throw new RuntimeException("插入区域信息失败");
                }
            }catch (Exception e){
                throw new RuntimeException("插入区域信息失败"+e.getMessage());
            }

        }else {
            throw new RuntimeException("区域信息不能为空");
        }
    }

    @Override
    public boolean updateArea(Area area) {
        if (!StringUtils.isEmpty(area.getAreaId())){
            area.setUpdateTime(new Date());
            try{
                int effectNum = areaDao.updateArea(area);
                if(effectNum > 0){
                    return true ;
                }else {
                    throw new RuntimeException("更新区域信息失败");
                }
            }catch (Exception e){
                throw new RuntimeException("更新区域信息失败"+e.getMessage());
            }

        }else {
            throw new RuntimeException("区域信息不能为空");
        }
    }

    @Override
    public boolean deleterArea(int areaId) {
        if(areaId > 0) {
            try {
                //删除区域信息
                int effectedNum = areaDao.deleterArea(areaId);
                if(effectedNum > 0 ){
                    return  true;
                } else  {
                    throw new RuntimeException("删除区域信息失败");
                }
            }catch (Exception e){
                throw new RuntimeException("删除区域信息失败"+e.getMessage());
            }
        } else {
            throw new RuntimeException("区域id不能为空");
        }

    }
}
