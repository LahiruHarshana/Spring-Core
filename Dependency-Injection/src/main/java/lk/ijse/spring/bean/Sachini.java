package lk.ijse.spring.bean;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.stereotype.Component;

@Component
public class Sachini implements GoodGirl, BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean {
    public Sachini() {
        System.out.println("sachini - Constructor");
    }

    @Override
    public void love() {

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

    }

    @Override
    public void setBeanName(String name) {

    }

    @Override
    public void destroy() throws Exception {

    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
