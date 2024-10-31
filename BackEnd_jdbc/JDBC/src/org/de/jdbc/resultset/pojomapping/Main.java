package org.de.jdbc.resultset.pojomapping;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.de.jdbc.mapper.Product;
import org.de.jdbc.mapper.ResultSetMapper;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Main {
    public static void main(String[] args) {
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/de-jdbc", "root", "root!1234");
            DatabaseMetaData databaseMetaData  = con.getMetaData();
            System.out.println(databaseMetaData.getDriverName() + ", " + databaseMetaData.getDriverVersion());

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from product");
            // List<Product> 선언
            List<Product> products = new ArrayList<>();
            // ResultSet에서 Product 객체 생성 후 List에 추가
            while (rs.next()) {
                Product product = ResultSetMapper.create(rs);
                products.add(product);
            }

            // 기존 코드
            products.forEach(it -> it.setPrice(it.getPrice() - 1000));

            // 결과를 출력
            products.forEach(it -> System.out.println(
                "ID: " + it.getId() + ", Name: " + it.getName() + ", Updated At: " + it.getUpdatedAt() +
                ", Contents: " + it.getContents() + ", Price: " + it.getPrice()
            ));

            // 리소스 해제
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
