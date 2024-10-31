package org.de.jdbc.mapper;

import java.time.LocalDateTime;

public class Product {
    int id;
    String name;
    LocalDateTime updatedAt;
    String contents;
    int price;

    public Product(int int1, String string, LocalDateTime localDateTime, String string2, int int2) {
        //TODO Auto-generated constructor stub
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getContents() {
        return this.contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
