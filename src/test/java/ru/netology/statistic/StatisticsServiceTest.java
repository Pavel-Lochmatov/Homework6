package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {
    @Test
    void calculateSum() {
        StatisticsService service = new StatisticsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        //сумму всех продаж
        long expected = 180;

        long actual = service.calculateSum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void calculateAverage() {
        StatisticsService service = new StatisticsService();

        long[] sales = {8, 15, 13, 0, 17, 20, 0, 20, 7, 14, 14, 18};
        //среднюю сумму продаж в месяц
        long expected = 12;

        long actual = service.calculateAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    void minSales() {
        StatisticsService service = new StatisticsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 7};
        //номер последнего месяца где были минимальные продажи
        long expected = 12;

        long actual = service.minSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void maxSales() {
        StatisticsService service = new StatisticsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        //номер последнего месяца где были максимальные продажи
        long expected = 8;

        long actual = service.maxSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void calculateCountBelowAverage() {
        StatisticsService service = new StatisticsService();

        long[] sales = {8, 15, 13, 0, 17, 20, 19, 1, 7, 14, 14, 18};
        //Кол-во месяцев, в которых продажи были ниже среднего
        long expected = 4;

        long actual = service.calculateCountBelowAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    void calculateCountHighAverage() {
        StatisticsService service = new StatisticsService();

        long[] sales = {8, 15, 13, 0, 17, 20, 19, 1, 7, 14, 14, 18};
        //Кол-во месяцев, в которых продажи были выше среднего
        long expected = 8;

        long actual = service.calculateCountHighAverage(sales);

        assertEquals(expected, actual);
    }
}