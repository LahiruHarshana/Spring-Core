package lk.ijse.spring.bean;


import lk.ijse.spring.bean.util.WhiteFace;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("long hair")
@WhiteFace
public class Sachini implements GoodGirl, BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean {
    public Sachini() {
        System.out.println("sachini - Constructor");
    }

    @Override
    public void love() {

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
}
