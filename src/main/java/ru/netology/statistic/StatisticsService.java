package ru.netology.statistic;

import java.util.Arrays;

public class StatisticsService {

    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {

            sum += sale;
        }
        return sum;
    }

    public long calculateAverage(long[] sales) {

        long averageSum = calculateSum(sales) / sales.length;
        return averageSum;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public long calculateCountBelowAverage(long[] sales) {
        long averageSum = calculateAverage(sales);
        long countBelowAverage = 0;
        for (long sale : sales) {

            if (sale < averageSum) {
                countBelowAverage = countBelowAverage + 1;
            }

        }
        return countBelowAverage;
    }

    public long calculateCountHighAverage(long[] sales) {
        long averageSum = calculateAverage(sales);
        long countHighAverage = 0;
        for (long sale : sales) {

            if (sale > averageSum) {
                countHighAverage = countHighAverage + 1;
            }

        }
        return countHighAverage;
    }


}