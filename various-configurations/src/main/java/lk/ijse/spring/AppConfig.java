package lk.ijse.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan("lk.ijse.spring.bean")
@ImportResource("classpath:context.xml")
@Import({BOConfig.class, DaoConfig.class})
public class AppConfig {

}
