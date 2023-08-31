package ru.geekbrains.Java_Core_HW_1.regular;

/**
 * Декоратор. Он декорирует, то есть, накладывает на результат декорации.
 * Внешний вид важен, по этому этот класс существует.
 */
public class Decorator {

    /**
     * метод декорирования числа для вывода в консоль
     * в виде строки с преамбулой 'Вот ваше число'
     * @param a число, требующее декорации
     * @return отформатированная строка.
     */
    public static String decorator(int a) {
        return String.format("here is your number: %d.", a);
    }

}
