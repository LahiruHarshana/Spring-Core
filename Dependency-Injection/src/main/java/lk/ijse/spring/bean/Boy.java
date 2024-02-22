package lk.ijse.spring.bean;

import jakarta.annotation.PostConstruct;
import lk.ijse.spring.bean.util.WhiteFace;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component("Lahiru")
public class Boy implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    private GoodGirl goodGirl;

    @Autowired
    public Boy(@Qualifier("long hair") @WhiteFace GoodGirl goodGirl) {
        this.goodGirl = goodGirl;
        System.out.println("Boy - Constructor");
        System.out.println("Have I got a girl friend? " + goodGirl);
    }

    @PostConstruct
    public void initialize() {
        System.out.println("Have I got a girl friend? " + goodGirl);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryAware.setBeanFactory() : " + beanFactory);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("BeanNameAware.setBeanName(): " + name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean.destroy()" + this);
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean.afterPropertiesSet()");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContextAware.setApplicationContext() : " + applicationContext);
    }
}