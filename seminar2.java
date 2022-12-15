
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class seminar2 {
    public static void main(String[] args) {
        Equation();
    }

    // public static int GetNumber() {
    // Scanner numberS = new Scanner(System.in);
    // int number;
    // while (true) {
    // try {
    // System.out.print("Введите число: ");
    // number = numberS.nextInt();
    // break;
    // } catch (Exception e) {
    // System.out.print("Ошибка ввода");
    // }
    // }
    // return number;
    // }

    public static String GetString() {
        Scanner str = new Scanner(System.in);
        String equation;
        System.out.println("Введите формулу: ");
        equation = str.nextLine();
        return equation;
    }

    public static void Equation() {
        Map<String, Integer> states = new HashMap<String, Integer>();
        states.put("0", 0);
        Scanner str = new Scanner(System.in);
        // a + b + c + d =
        String equation = GetString();
        equation = String.format(equation).replace(" ", "");
        String[] st1 = equation.split("\\+");
        int sum = 0;
        for (int i = 0; i < st1.length; i++) {
            for (Map.Entry<String, Integer> item : states.entrySet()) {
                if (item.getKey() != st1[i]) {
                    states.put(st1[i], str.nextInt());
                    break;
                }
            }
        }
        for (Map.Entry<String, Integer> item : states.entrySet()) {
            sum += item.getValue();
        }
        System.out.println(sum);
    }
}
