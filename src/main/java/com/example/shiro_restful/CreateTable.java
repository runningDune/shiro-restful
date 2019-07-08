package com.example.shiro_restful;

public class CreateTable {
    public static void main( String[] args )
    {
        try {
            GeneratorDisplay generatorSqlmap = new GeneratorDisplay();
            generatorSqlmap.generator();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
