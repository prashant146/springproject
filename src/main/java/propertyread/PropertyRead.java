package propertyread;

public class PropertyRead {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public void print(){
        System.out.println("INSIDE PROPERTYREAD CLASS AND NAME ="+this.name);
    }



}
