package lk.ijse.spring.config;

import com.edu.ijse.JavaBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = {"lk.ijse.spring","com.edu.ijse"})
//@ComponentScan(basePackageClasses = {PojoOne.class, Bean.class})
@ComponentScan
public class AppConfig {


    @Bean
    public JavaBean getJavaBean() {

        JavaBean javaBean = new JavaBean();
        return javaBean;
    }

}
