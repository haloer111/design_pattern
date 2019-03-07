package com.gexiao.design.principle.compositionaggregation;

public class ProductDao  {
    private DBConnection dbConnection;

    public ProductDao(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct()
    {
        System.out.println("使用"+dbConnection.getConnection()+"增加产品");
    }}
