package ru.netology.stats;

public class StatsService {

    public int minSales(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public long summarySales(int[] sales) {
        long sum = 0;
        for (long s : sales) {
            sum = sum + s;
        }
        return sum;
    }

    public long averageSummarySales(int[] sales) {
        long sum = 0;
        for (long s : sales) {
            sum = sum + s;
        }
        return sum / 12;
    }

    public long belowTheAverage(int[] sales) {
        long sum = 0;
        for (long s : sales) {
            sum = sum + s;
        }
        long averageSum = sum / 12;
        int count = 0;
        for (long num : sales) {
            if (num < averageSum) {
                count++;
            }
        }
        return count;
    }

    public long aboveTheAverage(int[] sales) {
        long sum = 0;
        for (long s : sales) {
            sum = sum + s;
        }
        long averageSum = sum / 12;
        int count = 0;
        for (long num : sales) {
            if (num > averageSum) {
                count++;
            }
        }
        return count;
    }

}
