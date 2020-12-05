package com.example.demo.service;

import junit.framework.TestCase;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SongListServiceTest extends TestCase {

    public void testAddSongList() {
    }

    public void testUpdateSongListMsg() {
    }

    public void testUpdateSongListImg() {
    }

    public void testDeleteSongList() {
    }

    public void testAllSongList() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SongListService songListServiceImpl = (SongListService)context.getBean("SongListServiceImpl");
        songListServiceImpl.allSongList();
    }

    public void testLikeTitle() {
    }

    public void testLikeStyle() {
    }

    public void testSongListOfTitle() {
    }
}