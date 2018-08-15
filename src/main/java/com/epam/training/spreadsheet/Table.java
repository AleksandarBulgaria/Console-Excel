package com.epam.training.spreadsheet;

import com.epam.training.expression.Expression;

import java.util.ArrayList;

public class Table {
    ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();

    for(int i = 1; i < 64; i++){
        data.add(new ArrayList<String>(" "));
    }

//    public Table(int i, int j) {
//        int rawNum = i;
//        int colNum = j;
//    }

    public Table() {

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
}
