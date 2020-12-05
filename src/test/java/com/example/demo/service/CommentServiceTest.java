package com.example.demo.service;

import com.example.demo.domain.Comment;
import junit.framework.TestCase;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class CommentServiceTest extends TestCase {

    public void testAddComment() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CommentService commentServiceImpl = (CommentService)context.getBean("CommentServiceImpl");
        Comment comment = new Comment();
        comment.setUserId(Integer.parseInt("123"));
        comment.setType(new Byte((byte)1));
        byte type = 1;
        if (new Byte(type) == 0) {
            comment.setSongId(Integer.parseInt("111"));
        } else if (new Byte(type) == 1) {
            comment.setSongListId(Integer.parseInt("12313"));
        }
        comment.setContent("hello");
        comment.setCreateTime(new Date());
        commentServiceImpl.addComment(comment);
    }

    public void testUpdateCommentMsg() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CommentService commentServiceImpl = (CommentService)context.getBean("CommentServiceImpl");
        Comment comment = new Comment();
        comment.setId(Integer.parseInt("58"));
        comment.setUserId(Integer.parseInt("12313"));
        if ("1231" == "") {
            comment.setSongId(null);
        } else {
            comment.setSongId(Integer.parseInt("1231"));
        }

        if ("123131" == "") {
            comment.setSongListId(null);
        } else {
            comment.setSongListId(Integer.parseInt("123131" ));
        }
        comment.setContent("bye");
        comment.setType((byte)1);
        comment.setUp(Integer.parseInt("0"));
        commentServiceImpl.updateCommentMsg(comment);
    }

    public void testDeleteComment() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CommentService commentServiceImpl = (CommentService)context.getBean("CommentServiceImpl");
        commentServiceImpl.deleteComment(58);
    }

    public void testAllComment() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CommentService commentServiceImpl = (CommentService)context.getBean("CommentServiceImpl");
        commentServiceImpl.allComment();
    }

    public void testCommentOfSongId() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CommentService commentServiceImpl = (CommentService)context.getBean("CommentServiceImpl");
        commentServiceImpl.commentOfSongId(21);
    }

    public void testCommentOfSongListId() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CommentService commentServiceImpl = (CommentService)context.getBean("CommentServiceImpl");
        commentServiceImpl.commentOfSongListId(80);
    }
}