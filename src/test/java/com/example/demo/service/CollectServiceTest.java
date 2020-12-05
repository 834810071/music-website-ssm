package com.example.demo.service;

import com.example.demo.domain.Collect;
import junit.framework.TestCase;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Collection;
import java.util.Date;

public class CollectServiceTest extends TestCase {

    public void testAddCollection() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CollectService collectService = (CollectService)context.getBean("CollectServiceImpl");
        Collect collect = new Collect();
        collect.setUserId(Integer.parseInt("1111"));
        byte type = 0;
        collect.setType(new Byte(type));
        if (new Byte(type) == 0) {
            collect.setSongId(Integer.parseInt("1111"));
        } else if (new Byte(type) == 1) {
            collect.setSongListId(Integer.parseInt("2222"));
        }
        collect.setCreateTime(new Date());
        boolean res = collectService.addCollection(collect);
    }

    public void testExistSongId() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CollectService collectServiceImpl = (CollectService)context.getBean("CollectServiceImpl");
        collectServiceImpl.existSongId(1, 21);
    }

    public void testUpdateCollectMsg() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CollectService collectServiceImpl = (CollectService)context.getBean("CollectServiceImpl");
        Collect collect = new Collect();
        collect.setId(Integer.parseInt("53"));
        collect.setUserId(Integer.parseInt("11111"));
        collect.setType(new Byte((byte)0));
        collect.setSongId(Integer.parseInt("22222"));
        collectServiceImpl.updateCollectMsg(collect);
    }

    public void testDeleteCollect() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CollectService collectServiceImpl = (CollectService)context.getBean("CollectServiceImpl");
        collectServiceImpl.deleteCollect(11111, 22222);
    }

    public void testAllCollect() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CollectService collectServiceImpl = (CollectService)context.getBean("CollectServiceImpl");
        collectServiceImpl.allCollect();
    }

    public void testCollectionOfUser() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CollectService collectServiceImpl = (CollectService)context.getBean("CollectServiceImpl");
        collectServiceImpl.collectionOfUser(1);
    }
}