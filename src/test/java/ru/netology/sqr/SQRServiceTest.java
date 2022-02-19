package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldGetSomeSquareNumbers() {        // должен получить несколько квадратных чисел
        SQRService service = new SQRService();
        int bottomLine = 200;       // нижняя граница диапазон
        int topLine = 300;      //верхняя граница диапазона
        int expected = 3;

        int actual = service.getCountOfSquareNumbers(bottomLine, topLine);

        assertEquals(expected, actual);
    }

    @Test
    void shouldGetAllSquareNumbers() {        // должен получить все квадратные числа
        SQRService service = new SQRService();
        int bottomLine = 100;       // нижняя граница диапазон
        int topLine = 9801;      //верхняя граница диапазона
        int expected = 90;

        int actual = service.getCountOfSquareNumbers(bottomLine, topLine);

        assertEquals(expected, actual);
    }

    @Test
    void shouldGetOneSquareNumbers() {        // должен получить одно квадратное число
        SQRService service = new SQRService();
        int bottomLine = 120;       // нижняя граница диапазон
        int topLine = 130;      //верхняя граница диапазона
        int expected = 1;

        int actual = service.getCountOfSquareNumbers(bottomLine, topLine);

        assertEquals(expected, actual);
    }

    @Test
    void shouldNotGetSquareNumbersInRange() {        // не должен получить ни одно квадратное число в диапазоне
        SQRService service = new SQRService();
        int bottomLine = 122;       // нижняя граница диапазон
        int topLine = 140;      //верхняя граница диапазона
        int expected = 0;

        int actual = service.getCountOfSquareNumbers(bottomLine, topLine);

        assertEquals(expected, actual);
    }

    @Test
    void shouldNotGetSquareNumbersLess10() {        // не должен получить ни одно квадратное число за диапазоном (меньше 10)
        SQRService service = new SQRService();
        int bottomLine = 1;       // нижняя граница диапазон
        int topLine = 9;      //верхняя граница диапазона
        int expected = 0;

        int actual = service.getCountOfSquareNumbers(bottomLine, topLine);

        assertEquals(expected, actual);
    }

    @Test
    void shouldNotGetSquareNumberGreater99() {        // не должен получить ни одно квадратное число за диапазоном (больше 99)
        SQRService service = new SQRService();
        int bottomLine = 9802;       // нижняя граница диапазон
        int topLine = 10000;      //верхняя граница диапазона
        int expected = 0;

        int actual = service.getCountOfSquareNumbers(bottomLine, topLine);

        assertEquals(expected, actual);
    }
}
