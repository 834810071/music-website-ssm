package com.example.demo.service;

import junit.framework.TestCase;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SongServiceTest extends TestCase {

    public void testAddSong() {
    }

    public void testUpdateSongMsg() {
    }

    public void testUpdateSongUrl() {
    }

    public void testUpdateSongPic() {
    }

    public void testDeleteSong() {
    }

    public void testAllSong() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SongService songServiceImpl = (SongService)context.getBean("SongServiceImpl");
        songServiceImpl.allSong();
    }

    public void testSongOfSingerId() {
    }

    public void testSongOfId() {
    }

    public void testSongOfSingerName() {
    }

    public void testSongOfName() {
    }
}