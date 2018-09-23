package staticclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("staticclass.xml");
        SpringClassCallingStaticMethod springClassCallingStaticMethod =
                applicationContext.getBean("springClassCallingStaticMethod", SpringClassCallingStaticMethod.class);
        springClassCallingStaticMethod.print();

    }

}
