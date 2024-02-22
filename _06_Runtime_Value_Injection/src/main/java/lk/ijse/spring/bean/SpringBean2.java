package lk.ijse.spring.bean;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean2 {
    public SpringBean2(@Value("${USER}") String name) {
        System.out.println("SpringBean2 Instantiated via Spring");
        System.out.println(name);
    }
}
