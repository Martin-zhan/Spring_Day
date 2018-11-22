package com.martin.pojo.test;

import com.martin.pojo.User;
import com.martin.pojo.User2;
import com.martin.pojo.User3;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/config/ApplicationContext.xml")
public class TestUser {
    @Autowired
    ApplicationContext context;
    @Test
    public void testSayHello() {
        /*ClassPathResource resource = new ClassPathResource("ApplicationContext.xml");
        XmlBeanFactory factory = new XmlBeanFactory(resource);
        User user = (User) factory.getBean("user");
        user.sayHello();*/

        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        User user = (User) context.getBean("users");
        user.sayHello();
        User user5 = (User) context.getBean("users");
        user5.sayHello();
        System.out.println(user == user5);

      //  System.out.println(user.toString());
        User2 user2 = (User2) context.getBean("users2");
        user2.sayHello();
        System.out.println(user2.toString());

       /* User3 user3 = (User3) context.getBean("users3");
        user3.sayHello();
        System.out.println(user3.toString());*/
    }
}
