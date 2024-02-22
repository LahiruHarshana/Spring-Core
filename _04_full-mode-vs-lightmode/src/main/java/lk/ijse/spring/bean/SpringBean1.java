package lk.ijse.spring.bean;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/*springBean1 is in full mode*/
@Component
public class SpringBean1 {
    public SpringBean1() {
        System.out.println("Spring Bean Instantiated...");

    }

    @Bean
    public SpringBean3 springBean3(){
        return new SpringBean3();
    }


}
