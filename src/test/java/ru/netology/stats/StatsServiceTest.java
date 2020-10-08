package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    long[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void shoudFindProseeds() {

        StatsService service = new StatsService();

        long proseeds = service.findSum(values);
        long expected = 180;

        assertEquals(expected, proseeds);
        System.out.println("Сумма всех продаж =" + proseeds);
    }

    @Test
    void shoudFindAverageSales() {

        StatsService service = new StatsService();

        double avgsales = service.findAvgSales(values);
        long expected = 15;

        assertEquals(expected, avgsales);
        System.out.println("Средняя сумма продаж =" + avgsales);
    }

    @Test
    void shoudFindMaxMonth() {

        StatsService service = new StatsService();

        long maxMonth = service.findMaxMonth(values);
        long expected = 8;

        assertEquals(expected, maxMonth);
        System.out.println("Месяц с пиком продаж =" + maxMonth);
    }

    @Test
    void shouldFindMinMonth() {
        StatsService service = new StatsService();
        long minMonth = service.findMinMonth(values);
        long expected = 9;

        assertEquals(expected, minMonth);
        System.out.println("Месяц минимальных продаж =" + minMonth);
    }

    @Test
    void shouldFindUnderAvgSum() {
        StatsService service = new StatsService();
        long listUASales = service.findUnderAvgSales(values);
        long expected = 5;

        assertEquals(expected, listUASales);
        System.out.println("Месяцев с продажами ниже среднего =" + listUASales);
    }

    @Test
    void shouldFindUpAvgSum() {
        StatsService service = new StatsService();
        long listUpASales = service.findUpAvgSum(values);
        long expected = 5;

        assertEquals(expected, listUpASales);
        System.out.println("Месяцев с продажами выше среднего =" + listUpASales);
    }


}
