package ru.netology.stats;

public class StatsService {
    public int totalSum(int[] sum) {
        int total = 0;
        for (int i = 0; i < sum.length; i++) {
            total = total + sum[i];
        }
        return total;

    }

    public int averageSums(int[] sums) {
        int average = totalSum(sums) / sums.length;
        return average;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;

    }

    public int lowerMiddle(int[] sums) {
        int Month = 0;
        for (int sum : sums) {
            if (sum < averageSums(sums))
                Month = Month + 1;
        }
        return Month;
    }

    public int aboveMidlle(int[] sums) {
        int Month = 0;
        for (int sum : sums) {
            if (sum > averageSums(sums))
                Month = Month + 1;

        }
        return Month;
    }
}