package example;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanA {

    public BeanA(){
        System.out.println("Inside Bean A constructor");
    }

    private BeanB beanB;
    private BeanC beanC;

    public BeanB getBeanB() {
        return beanB;
    }

    @Autowired
    public void setBeanB(BeanB beanB) {
        System.out.println("Inside setter Bean B");
        this.beanB = beanB;
    }

    public BeanC getBeanC() {
        return beanC;
    }

    @Autowired
    public void setBeanC(BeanC beanC) {
        System.out.println("Inside setter Bean C");
        this.beanC = beanC;
    }


}
