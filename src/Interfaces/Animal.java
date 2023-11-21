package Interfaces;

public class Animal implements Ihfo {
    public  int id;
    public Animal(int id) {
        this.id = id;
    }
    public void  sleep() {
        System.out.println("I am sleeping");
    }
    public void showIhfo(){
        System.out.println("id is "+this.id);
    }
}
