import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Enter Name");
        String userName = name.nextLine();
        System.out.println("Enter Family name");
        String familyName = name.nextLine();
        System.out.println("Enter Fathers name");
        String fathersName = name.nextLine();


        System.out.printf("Фамилия: %s \nИмя: %s \nОтчество: %s", userName, familyName, fathersName);


    }
}