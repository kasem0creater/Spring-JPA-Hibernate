package com.OOP.Rest.RestAPI.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Book")
public class Book {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long ID;

    private String BookName;
    private String Price;
    private String Description;

    public Book(){}

    public Book( String bookName , String price , String descrip)
    {
        this.BookName = bookName;
        this.Price = price;
        this.Description = descrip;
    }

    public Book(Long id , String bookName , String price , String descrip)
    {
        this.ID = id;
        this.BookName = bookName;
        this.Price = price;
        this.Description = descrip;
    }

    public Long getID() {
        return ID;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        this.Price = price;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        this.BookName = bookName;
    }

    public void setID(Long iD) {
        this.ID = iD;
    }
     
}