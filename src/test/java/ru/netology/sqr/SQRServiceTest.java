package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldGetCountOfSquareNumbers() {        // должен получить количество квадратных чисел
        SQRService service = new SQRService();
        int bottomLine = 200;       // нижняя граница диапазон
        int topLine = 300;      //верхняя граница диапазона
        int expected = 3;

        int actual = service.getCountOfSquareNumbers(bottomLine, topLine);

        assertEquals(expected, actual);
    }
}
