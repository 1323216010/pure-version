package cn.itcast.user.web;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.javamail.JavaMailSenderImpl;

/**
 * @author sxwh
 **/
@SpringBootTest
public class Test1ApplicationTests {
    @Autowired
    private JavaMailSenderImpl mailSender;

    @Test
    public void contextLoads() {

    }
}
