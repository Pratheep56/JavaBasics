import java.util.Scanner;

public class UserInputExp {
    public static void main(String[] args) {
        Scanner myObj=new Scanner(System.in);
        String Username;
        System.out.println("Enter Username: ");
        Username=myObj.nextLine();
        System.out.println("Your username is ".concat(Username));
        myObj.close();
    }
}
