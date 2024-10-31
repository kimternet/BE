package org.de.jdbc.crudexample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/de-jdbc";  // 백틱(`) 제거
        String user = "root";
        String password = "root!1234";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            // product 테이블에서 데이터를 선택하는 SQL 쿼리
            ResultSet rs = stmt.executeQuery("SELECT * FROM product");

            // 예시: name 컬럼 출력
            while (rs.next()) {
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Updated At: " + rs.getString("updated_at"));
                System.out.println("Contents: " + rs.getString("contents"));
                System.out.println("Price: " + rs.getInt("price"));
                System.out.println("----------------------");
            }

            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
