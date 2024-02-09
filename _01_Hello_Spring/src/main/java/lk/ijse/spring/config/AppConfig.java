package lk.ijse.spring.config;

import com.edu.ijse.JavaBean;
import lk.ijse.spring.pojo.PojoOne;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
//@ComponentScan(basePackages = {"lk.ijse.spring","com.edu.ijse"})
//@ComponentScan(basePackageClasses = {PojoOne.class, Bean.class})
@ComponentScan(basePackageClasses = {PojoOne.class})
@ComponentScan
public class AppConfig {


    @Scope("singleton")
    @Bean
    JavaBean getJavaBean() {

        JavaBean javaBean = new JavaBean();
        return javaBean;
    }

}
