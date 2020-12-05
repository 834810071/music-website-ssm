package com.example.demo.service;

import junit.framework.TestCase;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdminServiceTest extends TestCase {

    public void testVeritypasswd() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AdminService adminServiceImpl = (AdminService) context.getBean("AdminServiceImpl");
        adminServiceImpl.veritypasswd("admin", "123");
    }
}