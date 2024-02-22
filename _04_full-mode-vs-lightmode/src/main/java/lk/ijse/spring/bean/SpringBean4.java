package lk.ijse.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/*springBean4 is in full mode*/
public class SpringBean4 implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean{
    public SpringBean4() {
        System.out.println("Spring Bean4 Instantiated...");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("  SpringBean 4 :BeanFactoryAware.setBeanFactory()"+this);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println(" SpringBean 4 : BeanNameAware.setBeanName()"+this);
    }
    @Override
    public void destroy() throws Exception {
        System.out.println(" SpringBean 4 : DisposableBean.destroy()"+this);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(" SpringBean 4 : InitializingBean.afterPropertiesSet()"+this);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(" SpringBean 4 : ApplicationContextAware.setApplicationContext()"+this);
    }
}
