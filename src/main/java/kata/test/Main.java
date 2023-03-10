package kata.test;

import java.util.Scanner;

public class Main {
    private static String userString;


    public static void main(String[] args) throws MyException, Exception {

        Scanner scanner = new Scanner(System.in);
        String userString = scanner.nextLine();
        userLinenIsEmpty(userString);
        calc(userString);

    }

    public static String calc(String input) throws MyException, Exception {
        String[] matemOperation = input3Ellement(input);
        String output = "";
        int result = 0;

            int first_number = Integer.parseInt(matemOperation[0]);
            int last_number = Integer.parseInt(matemOperation[2]);

        if ((first_number < 1 || first_number > 10) || (last_number < 1 || last_number > 10)) {
            throw new Exception("введены неверные числа ");

        }
        switch (matemOperation[1]) {
            case "+":
                result = first_number + last_number;
                break;
            case "-":
                result = first_number - last_number;
                break;
            case "*":
                result = first_number * last_number;
                break;
            case "/":

                result = first_number / last_number;
                break;

            default:
                throw new MyException("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");

        }

        System.out.println("Input:");
        System.out.println(input);
        output = String.valueOf(result);
        System.out.println("Output:\n " + output);

        return output;

    }


    private static String[] input3Ellement(String line2 ) {
        String[] matemOperation = line2.split(" ");
        while (matemOperation.length != 3) {
            System.out.println("Введите операцию с пробелами a + b, a - b, a * b, a / b");
            Scanner scanner = new Scanner(System.in);
            String userLine =scanner.nextLine();
           userLinenIsEmpty(userLine);
            matemOperation = userLinenIsEmpty(userLine).split(" ");
        }
        return matemOperation;
    }
    private static String userLinenIsEmpty(String userLine){
        while (userLine.isEmpty()){
            System.out.println("Вы ничего не ввели . Попробуем еще раз ");
            Scanner scanner = new Scanner(System.in);
             userLine = scanner.nextLine();
        }
        return userLine;

    }



}
