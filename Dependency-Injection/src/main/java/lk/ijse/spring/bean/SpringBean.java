package lk.ijse.spring.bean;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Component
public class SpringBean {
    SpringBean(Collection<String> mySet){
        System.out.println("Spring Bean Instantiated");
        System.out.println(mySet);
    }
}

