package com.example.demo.service;

import junit.framework.TestCase;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingerServiceTest extends TestCase {

    public void testAddSinger() {
    }

    public void testUpdateSingerMsg() {
    }

    public void testUpdateSingerPic() {
    }

    public void testDeleteSinger() {
    }

    public void testAllSinger() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SingerService singerServiceImpl = (SingerService)context.getBean("SingerServiceImpl");
        singerServiceImpl.allSinger();
    }

    public void testSingerOfName() {
    }

    public void testSingerOfSex() {
    }
}