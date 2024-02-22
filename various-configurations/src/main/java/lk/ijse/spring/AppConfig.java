package lk.ijse.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan("lk.ijse.spring.bean")
@ImportResource("classpath:context.xml")
public class AppConfig {

}
