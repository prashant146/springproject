package componentscan;

import componentscan.com.one.Student;
import componentscan.com.one.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Student student = (componentscan.com.one.Student)applicationContext.getBean(Student.class);
        student.print();
        Teacher teacher = (Teacher)applicationContext.getBean(Teacher.class);
        teacher.print();
    }
}
