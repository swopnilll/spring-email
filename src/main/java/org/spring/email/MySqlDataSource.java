package org.spring.email;

import org.spring.email.constants.Constant;
import org.springframework.stereotype.Component;

@Component
public class MySqlDataSource implements DataSource {
    @Override
    public String[] getEmails() {
        return Constant.developmentEmails;
    }
}
