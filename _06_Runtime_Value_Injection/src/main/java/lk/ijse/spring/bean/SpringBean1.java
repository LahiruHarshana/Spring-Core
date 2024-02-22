package lk.ijse.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean1 {

    @Value("Lahiru")
    String name2;
    public SpringBean1(@Value("Lahiru") String name) {
        System.out.println("SpringBean1 Instantiated....");
        System.out.println("Name: " + name);
    }
}
