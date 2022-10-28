package cn.itcast.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mail.SimpleMailMessage;

@MapperScan("cn.itcast.user.mapper")
@SpringBootApplication
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom(StaticGetPrivate.getEmailFrom());
        mailMessage.setTo("371555822@qq.com");
        mailMessage.setSubject("每日心灵鸡汤语录");
        mailMessage.setText("你好 hello world");
        StaticGetPrivate.getMailSender().send(mailMessage);
        System.out.println("====完成发送！====");
    }
}
