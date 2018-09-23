package lifecyclecallback;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("lifecyclecallback.xml", "lifecyclecallback1.xml");
        ExampleInitBean exampleInitBean = applicationContext.getBean("exampleinitbean", ExampleInitBean.class);

        SpringInitExampleBean springInitExampleBean = applicationContext.getBean("springinitexamplebean", SpringInitExampleBean.class);
        DefaultInitMethodExample defaultInitMethodExample = applicationContext.getBean("defaultInitMethodExample", DefaultInitMethodExample.class);

    }
}
