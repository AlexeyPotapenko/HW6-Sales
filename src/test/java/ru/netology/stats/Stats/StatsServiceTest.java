package ru.netology.stats.Stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class StatsServiceTest {


    @Test
    void shouldSum(){
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int actual = service.sum(sales);
        int expected = 180;
        assertEquals(expected, actual);


    }
    @Test
    void shouldAvg(){
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int actual = service.sum(sales);
        int expected = 15;
        assertEquals(expected, actual);


    }
    @Test
    void shouldReturnMonthNumberWithMax(){
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int actual = service.monthWithMax(sales);
        int expected = 8;
        assertEquals(expected, actual);


    }
    @Test
    void shouldReturnMonthNumberWithMin(){
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int actual = service.monthWithMin(sales);
        int expected = 9;
        assertEquals(expected, actual);


    }
    @Test
    void shouldReturnCountOfMonthWithMoreThanAvg(){
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int actual = service.monthsWithMoreThanAvg(sales);
        int expected = 8;
        assertEquals(expected, actual);


    }

    @Test
    void shouldReturnCountOfMonthWithLessThanAvg(){
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int actual = service.monthsWithLessThanAvg(sales);
        int expected = 5;
        assertEquals(expected, actual);


    }

}