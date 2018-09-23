package staticclass;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Sample {

    public void print(){
        System.out.println("in annotation configured class");
    }

}
