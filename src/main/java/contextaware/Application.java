package contextaware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontextaware.xml");
        ApplicationContextAwareExample applicationContextAwareExample
                = applicationContext.getBean("applicationContextAwareExample", ApplicationContextAwareExample.class);
        ApplicationContext app = applicationContextAwareExample.getApplicationContext();
        app.getBean("test", Test.class).print();

    }
}
