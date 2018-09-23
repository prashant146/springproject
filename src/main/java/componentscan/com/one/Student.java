package componentscan.com.one;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {

    public void print(){
        System.out.println("I am in Student class");
    }
}
