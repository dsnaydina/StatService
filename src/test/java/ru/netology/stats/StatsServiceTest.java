package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {

    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        long expected = 180;
        long actual = service.calculateSum();

        assertEquals(expected, actual);
    }


    @Test
    void shouldCalculateAverageSum() {
        StatsService service = new StatsService();
        long expected = 15;
        long actual = service.calculateAverageSum();
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMax() {
        StatsService service = new StatsService();
        long expected = 5;
        long actual = service.findMax();
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMin() {
        StatsService service = new StatsService();
        long expected = 8;
        long actual = service.findMin();
        assertEquals(expected, actual);
    }


    @Test
    void shouldFindBelowAve() {
        StatsService service = new StatsService();
        long expected = 5;
        long actual = service.findBelowAverage();
        assertEquals(expected, actual);

    }
    @Test
    void shouldFindAboveAve() {
        StatsService service = new StatsService();
        long expected = 5;
        long actual = service.findAboveAverage();
        assertEquals(expected, actual);

    }


}