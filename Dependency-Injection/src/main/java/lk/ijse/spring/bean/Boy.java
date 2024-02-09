package lk.ijse.spring.bean;

import org.springframework.stereotype.Component;

@Component("Lahiru")
public class Boy {

    private GoodGirl goodGirl;
    public Boy() {
        System.out.println("Boy - Constructor");
        System.out.println("Have I got a girl friend? " + goodGirl);
    }
}
