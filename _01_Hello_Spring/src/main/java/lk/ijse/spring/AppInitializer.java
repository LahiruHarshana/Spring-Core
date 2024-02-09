package lk.ijse.spring;
import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.PojoOne;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        Object getJavaBean1 = ctx.getBean("getJavaBean");
        Object getJavaBean2 = ctx.getBean("getJavaBean");
        Object getJavaBean3 = ctx.getBean("getJavaBean");

        System.out.println(getJavaBean1);
        System.out.println(getJavaBean2);
        System.out.println(getJavaBean3);

        ctx.close();
    }
}
 