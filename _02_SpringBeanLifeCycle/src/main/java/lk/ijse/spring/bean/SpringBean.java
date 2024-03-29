package lk.ijse.spring.bean;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SpringBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    public SpringBean() {
        System.out.println("SpringBean Instantiated");


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
        System.out.println("DisposableBean.destroy()"+this);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean.afterPropertiesSet()");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContextAware.setApplicationContext() : " + applicationContext);
    }
    @PostConstruct
    public void initialize(){
        System.out.println("@PostConstruct");
    }

    @PreDestroy
    public void disposable(){
        System.out.println("DisposableBean.destroy()");
    }
}
