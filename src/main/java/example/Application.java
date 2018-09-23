package example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("example.xml");
        BeanA beanA = applicationContext.getBean("beanA", BeanA.class);
        System.out.println(beanA.getBeanB());
    }

}
