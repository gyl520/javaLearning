package com.gyl.wenxin.web;

import com.gyl.wenxin.entity.Area;
import com.gyl.wenxin.service.AreaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.management.ValueExp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 *
 * @author guoyunlong
 * Date 2019/4/13
 * Time 13:17
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Slf4j
@RestController
@RequestMapping("/superadmin")
public class AreaController {
    @Autowired
    private AreaService areaService;

    @RequestMapping(value = "/listarea",method = RequestMethod.GET)
    private Map<String,Object> listArea(){

        Map<String,Object>  modeMap = new HashMap();
        List<Area> list = areaService.queryArea();
        log.info("测试listArea:1:{}2:{}",list.get(0),list.get(1));
        modeMap.put("areaList",list);
        return modeMap;
    }


    @RequestMapping(value = "/getareabyid",method = RequestMethod.GET)
    private Map<String,Object> getAreaById(Integer areaId){
        Map<String,Object>  modeMap = new HashMap();
        Area area = areaService.queryAreaById(areaId);
        modeMap.put("area",area);
        return modeMap;
    }

    @RequestMapping(value = "/addarea",method = RequestMethod.POST)
    private Map<String,Object> addArea(@RequestBody Area area){
        Map<String,Object>  modeMap = new HashMap();
        boolean addResult = areaService.insertArea(area);
        modeMap.put("success",addResult);
        return modeMap;
    }

    @RequestMapping(value = "/modifyarea",method = RequestMethod.POST)
    private Map<String,Object> updateArea(@RequestBody Area area){
        Map<String,Object>  modeMap = new HashMap();
        boolean addResult = areaService.updateArea(area);
        modeMap.put("success",addResult);
        return modeMap;
    }

    @RequestMapping(value = "/deletearea",method = RequestMethod.GET)
    private Map<String,Object> deletearea(Integer areaId){
        Map<String,Object>  modeMap = new HashMap();
        boolean addResult = areaService.deleterArea(areaId);
        modeMap.put("success",addResult);
        return modeMap;
    }


}
