package lk.ijse.spring.bean;


import org.springframework.context.annotation.ComponentScan;

public class XMLConfigBean {
    public XMLConfigBean() {
        System.out.println("XML Config Bean Instantiated...");
    }

    public void setName(String name) {
        System.out.println("Name : " + name);
    }
}
