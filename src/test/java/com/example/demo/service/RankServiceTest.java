package com.example.demo.service;

import junit.framework.TestCase;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RankServiceTest extends TestCase {

    public void testRankOfSongListId() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        RankService rankServiceImpl = (RankService)context.getBean("RankServiceImpl");
        rankServiceImpl.rankOfSongListId(Long.parseLong("2"));
    }

    public void testAddRank() {
    }
}