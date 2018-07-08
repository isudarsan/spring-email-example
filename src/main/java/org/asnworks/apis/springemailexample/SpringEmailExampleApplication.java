package org.asnworks.apis.springemailexample;

import org.asnworks.apis.springemailexample.model.XUser;
import org.asnworks.apis.springemailexample.utils.EmailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@SpringBootApplication
public class SpringEmailExampleApplication implements CommandLineRunner {

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private EmailUtil emailUtil;

    public static void main(String[] args) {
        SpringApplication.run(SpringEmailExampleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        SimpleMailMessage message = emailUtil.composeEmail("Hello From Spring Boot", "Hello From Spring Boot",
            new XUser("zarvis.a@gmail.com"));

        mailSender.send(message);
    }

}
