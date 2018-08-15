package com.epam.training.spreadsheet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableTest {

    @Test
    void printTable() {
        Table t = new Table(3, 4);
        t.setValue("A1", 8);
        t.setValue("B2", 7);
        assertEquals("8,,\n,7,\n,,,\n,,,", t.display());
    }


}