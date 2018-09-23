package propertyread;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("propertyRead.xml");
        PropertyRead propertyRead = applicationContext.getBean("propertyRead", PropertyRead.class);
        propertyRead.print();
    }

}
