package Interfaces;

public class Person implements Ihfo {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    @Override
    public void showIhfo() {
        System.out.println("Name is "+this.name);
    }
}
