package lk.ijse.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class SpringBean {
    SpringBean(String name){
        System.out.println(name);
    }
}
