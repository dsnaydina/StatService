package ru.netology.stats;

public class StatsService {

    int[] sales = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


    public long calculateSum() {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long calculateAverageSum() {
        long sum = calculateSum();
        long average = sum / sales.length;
        return average;
    }

    public long findMax() {
        long currentMax = sales[0];
        long currentMaxNum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (currentMax < sales[i]) {
                currentMax = sales[i];
                currentMaxNum = i;
            }
        }

        return currentMaxNum;
    }

    public long findMin() {
        long currentMin = sales[0];
        long currentMinNum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (currentMin > sales[i]) {
                currentMin = sales[i];
                currentMinNum = i;
            }
        }

        return currentMinNum;
    }

    public long findBelowAverage() {
        long belowAve = 0;
        long average = calculateAverageSum();
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                belowAve = belowAve + 1;
            }
        }
        return belowAve;
    }

    public long findAboveAverage() {
        long aboveAve = 0;
        long average = calculateAverageSum();
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                aboveAve = aboveAve + 1;
            }
        }
        return aboveAve;
    }

}

