package com.gyl.wenxin.dao;

import com.gyl.wenxin.entity.Area;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {
    @Autowired
    private AreaDao areaDao;
    @Test
    public void queryArea() throws Exception {
        List<Area> areaDaoList = areaDao.queryArea();
        assertEquals(2,areaDaoList.size());

    }

    @Test
    public void queryAreaById() throws Exception {
    }

    @Test
    public void insertArea() throws Exception {
    }

    @Test
    public void updateArea() throws Exception {
    }

    @Test
    public void deleterArea() throws Exception {
    }

}