import java.sql.SQLOutput;

public class Lesson20 {
    public static void  main(String[] args){
        Humany h1 = new Humany ("bob", 44);
        Humany h2 = new Humany ("tom", 74);
        h1.printNumberOFPeople();
        h2.printNumberOFPeople();
        Humany h3 = new Humany("rob",35);
        h1.printNumberOFPeople();
        h2.printNumberOFPeople();
        h3.printNumberOFPeople();
    }
}
class Humany {

    private String name;
    private int age;
    public static int countPeople;
    public  Humany (String name, int age){
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName (String name) {
        this.name = name; }
    public void setAge (int age) {
        this.age = age; }
    public void printNumberOFPeople() {
        System.out.println("Number of people is "+countPeople);
    }
}