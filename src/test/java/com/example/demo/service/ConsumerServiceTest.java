package com.example.demo.service;

import com.example.demo.domain.Consumer;
import junit.framework.TestCase;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

public class ConsumerServiceTest extends TestCase {

    public void testAddUser() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ConsumerService consumerServiceImpl = (ConsumerService)context.getBean("ConsumerServiceImpl");
        Consumer consumer = new Consumer();
        consumer.setUsername("jxq1");
        consumer.setPassword("jxq1");
        consumer.setCreateTime(new Date());
        consumer.setUpdateTime(new Date());
        consumerServiceImpl.addUser(consumer);
    }

    public void testUpdateUserMsg() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ConsumerService consumerServiceImpl = (ConsumerService)context.getBean("ConsumerServiceImpl");
        Consumer consumer = new Consumer();
        consumer.setId(1);
        consumer.setSex((byte) 1);
        consumerServiceImpl.updateUserMsg(consumer);
    }

    public void testUpdateUserAvator() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ConsumerService consumerServiceImpl = (ConsumerService)context.getBean("ConsumerServiceImpl");
    }

    public void testExistUser() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ConsumerService consumerServiceImpl = (ConsumerService)context.getBean("ConsumerServiceImpl");
        System.out.println(consumerServiceImpl.existUser("012"));
    }

    public void testVeritypasswd() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ConsumerService consumerServiceImpl = (ConsumerService)context.getBean("ConsumerServiceImpl");
        System.out.println(consumerServiceImpl.veritypasswd("012", "012"));
    }

    public void testDeleteUser() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ConsumerService consumerServiceImpl = (ConsumerService)context.getBean("ConsumerServiceImpl");
        consumerServiceImpl.deleteUser(28);
    }

    public void testAllUser() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ConsumerService consumerServiceImpl = (ConsumerService)context.getBean("ConsumerServiceImpl");
        List<Consumer> consumers = consumerServiceImpl.allUser();
        for (Consumer c : consumers) {
            System.out.println(c);
        }
    }

    public void testUserOfId() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ConsumerService consumerServiceImpl = (ConsumerService)context.getBean("ConsumerServiceImpl");
        List<Consumer> consumers = consumerServiceImpl.userOfId(22);
        for (Consumer c : consumers) {
            System.out.println(c);
        }
    }

    public void testLoginStatus() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ConsumerService consumerServiceImpl = (ConsumerService)context.getBean("ConsumerServiceImpl");
        List<Consumer> consumers = consumerServiceImpl.loginStatus("012");
        for (Consumer c : consumers) {
            System.out.println(c);
        }
    }
}