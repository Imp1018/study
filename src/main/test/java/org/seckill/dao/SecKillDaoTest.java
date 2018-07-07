package org.seckill.dao;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.SecKill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class SecKillDaoTest {
        @Autowired
    private SecKillDao secKillDao;

    @Test
    public void reduceNumber() {
        Date killTime=new Date();

        int updateCount = secKillDao.reduceNumber(1000l, killTime);
        System.out.println("updateCount="+updateCount);
    }

    @Test
    public void queryById() {
       long id =1;
        SecKill secKill = secKillDao.queryById(id);
        System.out.println(secKill.getName());
        System.out.println(secKill);
    }

    @Test
    public void queryAll() {
        // java 没有保存形参的记录
        List<SecKill> secKills = secKillDao.queryAll(0, 100);
        for (SecKill secKill : secKills) {
            System.out.println(secKill);
        }
    }
}
