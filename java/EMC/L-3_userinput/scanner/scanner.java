import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner aki = new Scanner (System.in);

        System.out.println("Enter your name: ");
        String name = aki.nextLine();

        System.out.println("Hello " + name);
        
        aki.close();
    }
}
