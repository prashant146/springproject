package beaninheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beaninheritance.xml");
        Customer customer = applicationContext.getBean("childCustomer", Customer.class);
        Customer customer1 = applicationContext.getBean("baseCustomer", Customer.class);
        customer.print();
        customer1.print();
    }
}
