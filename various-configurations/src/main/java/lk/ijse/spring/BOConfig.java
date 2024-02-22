package lk.ijse.spring;

import lk.ijse.spring.bo.BOSpringBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BOConfig {

    @Bean
    public BOSpringBean boSpringBean() {
        return new BOSpringBean();
    }
}
