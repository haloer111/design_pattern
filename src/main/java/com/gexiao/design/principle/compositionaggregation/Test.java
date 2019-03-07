package com.gexiao.design.principle.compositionaggregation;

public class Test {
    public static void main(String[] args) {
        ProductDao dao = new ProductDao(new MySQLConnection());
        ProductDao dao1 = new ProductDao(new PostgreSQLConnection());
        dao.addProduct();
        dao1.addProduct();
    }
}
