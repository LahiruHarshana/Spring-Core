package lk.ijse.spring.bean;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SpringBean1 {

    @Value("Lahiru2")
    String name2;
    public SpringBean1(@Value("Lahiru") String name,
                       @Value("10") int age,
                       @Value("10.0") double salary,
                       @Value("true") boolean isEmployed,
                       @Value("10") long contactNumber,
                       @Value("10") short age2, @Value("10") byte age3, @Value("10") float salary2, @Value("1,2,3,4,5,6,7,8,9") int[] numbers, @Value("1,2,3,4,5,6,7,8") List<String> list){
        System.out.println("SpringBean1 Instantiated via Spring");
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
        System.out.println(isEmployed);
        System.out.println(contactNumber);
        System.out.println(age2);
        System.out.println(age3);
        System.out.println(salary2);

        for (int number : numbers) {
            System.out.println(number);
        }
    }
    @PostConstruct
    public void init(){
        System.out.println("SpringBean1 Initialized....");
    }

}
