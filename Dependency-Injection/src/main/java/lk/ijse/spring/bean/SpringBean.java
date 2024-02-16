package lk.ijse.spring.bean;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class SpringBean {
    SpringBean(String []name){
        System.out.println(Arrays.toString(name));
    }
}
