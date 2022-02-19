package ru.netology.sqr;

public class SQRService {

    public int getCountOfSquareNumbers(int bottomLine, int topLine) {       // тип возвращаемого значения int
        // в круглых скобках принимает значение int - переменные bottomLine и topLine
        int counter = 0;
        for (int i = 10; i <= 99; i++) {        // int i - число возводимое в квадрат (10 - 99)
            if (i * i >= bottomLine && i * i <= topLine) {       // && - оператор и
                counter++;      // counter = counter + 1
            }
        }
        return counter;
    }
}
