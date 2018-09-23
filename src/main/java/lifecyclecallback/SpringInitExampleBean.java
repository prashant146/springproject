package lifecyclecallback;

import org.springframework.beans.factory.InitializingBean;

public class SpringInitExampleBean implements InitializingBean {

    public void afterPropertiesSet() throws Exception {
        System.out.println("Came in afterPropertiesSet");
    }
}
