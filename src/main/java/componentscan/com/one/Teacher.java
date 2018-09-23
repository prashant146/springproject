package componentscan.com.one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Teacher {

    @Autowired
    private Student student;

    @Value("${username}")
    private String userName;

    public void print(){
        this.student.print();
        System.out.println(this.userName);
    }

}
