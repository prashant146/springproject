package lifecyclecallback;

public class ExampleInitBean {


    public void init(){
        System.out.println("came inside init");
    }

    public void cleanup(){
        System.out.println("came inside destroy");
    }
}
