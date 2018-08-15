package com.epam.training.spreadsheet;

import com.epam.training.expression.Expression;

import java.util.ArrayList;

public class Table {

    private ArrayList<ArrayList<String>> data = new ArrayList<>();

    private int rowSize;
    private int colSize;

    private Table(int i, int j) {
        rowSize = i;
        colSize = j;
        for (int br1 = 0; br1 < i; br1++) {
            data.add(new ArrayList<>());
            for (int br2 = 0; br2 < j; br2++) {
                data.get(i).add(null);
            }
        }
    }

    public Table() {
        this(8, 8);
    }

    void split(){
        String string = "A2=5";
        String[] split =  string.split("=");
        for (String s : split) {

        }
    }

    void setValue(String cell, Expression val) {
//        for(n : data){
//            for(m : data) {
//                if ((n)(m) == (i)(j)) {
//                    data.add(val);
//                } else {
//                    data.add(,);
//                }
//            }
//        }
    }

    String display() {
        return null;
    }

    public int getColSize() {
        return colSize;
    }

    public void setColSize(int colSize) {
        this.colSize = colSize;
    }

    public int getRowSize() {
        return rowSize;
    }

    public void setRowSize(int rowSize) {
        this.rowSize = rowSize;
    }
}
