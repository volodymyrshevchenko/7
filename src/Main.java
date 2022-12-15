import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Угадай число");

        Random random = new Random();
        int randomNumber = random.nextInt();

        while (true) {
            System.out.println("угадай число от 0 до 10");
            int intput_number = scanner.nextInt();
            if(intput_number == randomNumber) {
                System.out.println("Good");
                break;
            } else if (intput_number > randomNumber) {
                System.out.println("Not Good");
            }else {
                System.out.println("загаданное число меньше");

            }
        }




    }
}