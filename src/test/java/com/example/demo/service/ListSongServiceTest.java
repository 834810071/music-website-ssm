package com.example.demo.service;

import junit.framework.TestCase;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListSongServiceTest extends TestCase {

    public void testAddListSong() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ListSongService listSongServiceImpl = (ListSongService)context.getBean("ListSongServiceImpl");
    }

    public void testUpdateListSongMsg() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ListSongService listSongServiceImpl = (ListSongService)context.getBean("ListSongServiceImpl");
    }

    public void testDeleteListSong() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ListSongService listSongServiceImpl = (ListSongService)context.getBean("ListSongServiceImpl");
    }

    public void testAllListSong() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ListSongService listSongServiceImpl = (ListSongService)context.getBean("ListSongServiceImpl");
        listSongServiceImpl.allListSong();
    }

    public void testListSongOfSongId() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ListSongService listSongServiceImpl = (ListSongService)context.getBean("ListSongServiceImpl");
    }
}