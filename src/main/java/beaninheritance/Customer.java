package beaninheritance;

public class Customer {

    private int serial;

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    private String name;
    private String country;

    public void print(){
        System.out.println("Printing Customer class data");
        System.out.println(this.serial+" "+this.name+" "+this.country);
    }
}
