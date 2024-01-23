package org.spring.email;

import org.spring.email.constants.Constant;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PosGresDataSource implements DataSource {

    public String[] getEmails(){
        return Constant.productionEmails;
    }

}
