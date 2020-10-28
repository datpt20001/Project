
import java.util.Scanner;

public class Validation {

    private Scanner sc = new Scanner(System.in);

    public int inputInt(String mess, int min, int max) {
        System.out.print(mess);
        while (true) {
            String input = sc.nextLine();
            try {
                int number = Integer.parseInt(input);
                if (number < min || number > max) {
                    System.out.print("Please enter a number between " + min + ", " + max + ": ");
                    continue;
                }
                return number;
            } catch (Exception e) {
                System.out.print("Please input an integer number: ");
            }
        }
    }
    public  String convertDecTo(String dec, int base) {
        String digitCheck;
        if (base == 2){
            digitCheck = "01";
        } else {
            digitCheck = "0123456789ABCDEF";
        }
        String answer = "";
        int tempDec = Integer.parseInt(dec);
        while (tempDec != 0) {
            int div = tempDec / base;
            int mod = tempDec % base;
            answer = digitCheck.charAt(mod) + answer;
            tempDec = div;
        }
        return answer;
    }
}
