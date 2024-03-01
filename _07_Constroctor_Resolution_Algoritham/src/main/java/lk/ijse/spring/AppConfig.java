package lk.ijse.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig Instantiated via Spring");
    }
    @Bean
    public String name(){
        return "SpringBean1";
    }
    @Bean
    public Integer age(){
        return 10;
    }
    @Bean
    public boolean isMale(){
        return true;
    }
}
