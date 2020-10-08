package ru.netology.stats;


public class StatsService {

    public long findSum(long[] values) {
        long proseeds = 0;
        for (int i = 0; i < values.length; i++) {
            proseeds = proseeds + values[i];
        }
        return proseeds;
    }

    public double findAvgSales(long[] values) {
        long proseeds = findSum(values);
        double avgsales = proseeds / values.length;

        return avgsales;
    }

    public long findMaxMonth(long[] values) {
        long maxMonth = 0;
        long currentValue = values[0];
        for (int i = 0; i < values.length; i++) {
            if (currentValue <= values[i]) {
                maxMonth = i + 1;
                currentValue = values[i];
            }
        }
        return maxMonth;
    }


    public long findMinMonth(long[] values) {
        long minMonth = 0;
        long currentValue = values[0];
        for (int i = 0; i < values.length; i++) {
            if (currentValue >= values[i]) {
                minMonth = i + 1;
                currentValue = values[i];
            }
        }
        return minMonth;
    }

    public long findUnderAvgSales(long[] values) {
        long listUASales = 0;
        double avgSales = findAvgSales(values);
        for (long currentValue : values) {
            if (currentValue < avgSales) listUASales++;
        }
        return listUASales;
    }

    public long findUpAvgSum(long[] values) {
        long listUpASales = 0;
        double avgSales = findAvgSales(values);
        for (long currentValue : values) {
            if (currentValue > avgSales) listUpASales++;
        }
        return listUpASales;
    }


}
