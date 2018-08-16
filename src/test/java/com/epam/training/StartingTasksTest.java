package com.epam.training;

import org.junit.jupiter.api.Test;

import static com.epam.training.StartingTasks.sumOfDigits;
import static org.junit.jupiter.api.Assertions.assertEquals;


class StartingTasksTest {

    @Test
    void sumOfDigitsTest() {
        assertEquals(16, sumOfDigits(565));
    }

    @Test
    void convertMinutesToYearsAndDays() {
    }
}