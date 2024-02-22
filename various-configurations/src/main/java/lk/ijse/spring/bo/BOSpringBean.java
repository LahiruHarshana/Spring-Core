package lk.ijse.spring.bo;

import org.springframework.stereotype.Component;

@Component
public class BOSpringBean {
    BOSpringBean() {
        System.out.println("BOSpringBean Instantiated via Spring");
    }
}
