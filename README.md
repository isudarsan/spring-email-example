[![Codacy Badge](https://api.codacy.com/project/badge/Grade/b4ea41bb0425462eb1465455a0033ce7)](https://app.codacy.com/app/sudarsan.a/spring-email-example?utm_source=github.com&utm_medium=referral&utm_content=isudarsan/spring-email-example&utm_campaign=badger)
[![Build Status](https://travis-ci.org/isudarsan/spring-email-example.svg?branch=master)](https://travis-ci.org/isudarsan/spring-email-example)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/d6aa398e2b88477f9d09b8ee2b3708c0)](https://www.codacy.com/app/sudarsan.a/spring-email-example?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=isudarsan/spring-email-example&amp;utm_campaign=Badge_Grade)

# spring-email-example
Sending Email with Spring JavaMailSender

Nowadays almost every application be it desktop or webapp, needs to send some kind of notification via mail. The usecases may differ based on the requirement for example registration mail, order confirmation or any batch job completion. In this repository I coded simple but powerful Java Mail sending framework using Spring Boot.

As far as the SMTP configuration partis concerened, we don’t have to do any thing except specifying the correct server details in application properties and use the JavaMailSender in your application. We have below details in our file.

```
#Customer care email
customer.care.email=

spring.mail.host=smtpout.asia.secureserver.net
spring.mail.port=465
spring.mail.protocol=smtps

#Mail server Username & Password
spring.mail.username=
spring.mail.password=

spring.mail.properties.mail.transport.protocol=smtps
spring.mail.properties.mail.smtps.auth=true
spring.mail.properties.mail.smtps.starttls.enable=true
spring.mail.properties.mail.smtps.timeout=8000

```
@mentions (https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-email.html)
