import java.util.Scanner;

public class Input {
    public static void main(String [] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Vvedite chislo");
        int x = s.nextInt();
        String string =s.nextLine();
        System.out.println("Vy vveli  "+x);
    }
}
