package ru.java.courses;

import java.sql.SQLOutput;

public class Lesson4_FlowControl {

    /**
     * В рамках задания необходимо найти в полученном массиве строк самую длинную
     * и вернуть ее в результате выполнени метода.
     * Если таких строк окажется несколько - возвращаем первую найденную.
     * <p>
     * Например, для массива {"Тихий дон", "Вишневый сад", "Война и мир", "Мертвые души"}
     * ответом будет "Вишнеый сад".
     * <p>
     * Подсказка: массив может быть пустой
     *
     * @param strings массив строк случайной длины
     * @return самую длинную строку из полученного массива
     */
    public static String task1(String[] strings) {
        if (strings.length != 0) {
            String max = strings[0];
            for (int i = 1; i < strings.length; i++) {
                if (strings[i].length() > max.length()) {
                    max = strings[i];
                }
            }
            return max;
        }
        return "";
    }

    /**
     * В рамках задания необходимо реализовать микро-калькулятор.
     *  В качестве входных параметров будут два числа i и k, а так же символ указывающий на операцию:
     * + - сложение i и k
     * - - вычитание k из i
     * * - умножение i на k
     * / - деление i на k
     * % - остаток от деления i на k
     * <p>
     * Как мы помним, на 0 делить нельзя. В этом случае просто возвращаем 0.
     * <p>
     * Подсказка: переданный символ операции может быть не из списка выше
     *
     * @param i         первый числовой параметр
     * @param k         второй числовой параметр
     * @param operation символ, указывающий на операцию
     * @return целочисленный результат выполнения операции
     */
    public static int task2(int i, int k, char operation) {
        if (k == 0 && (operation == '/' || operation == '%'))
            return 0;
        switch (operation) {
            case '+':
                return i + k;
            case '-':
                return i - k;
            case '*':
                return i * k;
            case '/':
                return i / k;
            case '%':
                return i % k;
            default:
                return 0;

        }
    }
}
