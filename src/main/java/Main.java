import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println(calc(new Scanner(System.in).nextLine()));

    }
    public static String calc(String input) throws Exception {

            String[] arrayValue = input.split(" ");
            int operation = 0;
            if (arrayValue.length == 3) {

                int a = Integer.parseInt(arrayValue[0]);
                int b = Integer.parseInt(arrayValue[2]);

                String operator = arrayValue[1];

                if (a >= 1 && a <= 10 && b >= 1 && b <= 10) {

                    switch (operator) {

                        case "-":
                            operation = a - b;
                            break;
                        case "+":
                            operation = a + b;
                            break;
                        case "*":
                            operation = a * b;
                            break;
                        case "/":
                            operation = a / b;
                            break;
                        default:
                            throw new IllegalStateException("нихуя не понятно что за знак: " + arrayValue[1]);
                    }
                } else {
                    throw new Exception("возможно допустимые значения для операндов от 1 до 10 включительно");
                }
        } else if (arrayValue.length < 3) {
            throw new Exception("строка не является математической операцией");
        } else {
            throw new Exception("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
        return String.valueOf(operation);
    }
}
