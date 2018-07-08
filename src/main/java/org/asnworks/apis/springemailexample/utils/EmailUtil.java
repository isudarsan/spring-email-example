/**
 * 
 */
package org.asnworks.apis.springemailexample.utils;

import org.asnworks.apis.springemailexample.model.XUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

/**
 * @author sudarsan
 */
@Component
public class EmailUtil {

    @Autowired
    private Environment env;

    public SimpleMailMessage composeEmail(final String subject, final String messageText, final XUser user) {

        final SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject(subject);
        message.setText(messageText);
        message.setTo(user.getEmail());
        message.setFrom(env.getProperty("customer.care.email"));
        return message;
    }

}
