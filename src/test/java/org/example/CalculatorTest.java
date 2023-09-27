package org.example;

public class CalculatorTest {
    public static void main(String[] args) {

        // Проверка базового функционала калькулятора с целыми числами:
        if (10 != Calculator.calculation(5, 5, '+')) {
            throw new AssertionError("Ошибка в методе");
        }

        if (0 != Calculator.calculation(2, 2, '-')) {
            throw new AssertionError("Ошибка в методе");
        }
        if (14 != Calculator.calculation(2, 7, '*')) {
            throw new AssertionError("Ошибка в методе");
        }

        if (2 != Calculator.calculation(100, 50, '/')) {
            throw new AssertionError("Ошибка в методе");
        }

/*
В классе Calculator создайте метод calculateDiscount, который принимает сумму покупки и процент скидки и возвращает сумму с учетом скидки.
Ваша задача - проверить этот метод с использованием библиотеки AssertJ.
Если метод calculateDiscount получает недопустимые аргументы, он должен выбрасывать исключение ArithmeticException.
Не забудьте написать тесты для проверки этого поведения.
 */

        assert 9500.00 == Calculator.calculateDiscount(10000.00, 5);
        assert 18000.00 == Calculator.calculateDiscount(20000.00, 10);
        assert 18000.00 == Calculator.calculateDiscount(-1, 15);
        assert 5 == Calculator.squareRootExtraction(25);


    }
}