package com.OOP.Rest.RestAPI.Service;

import java.util.List;
import java.util.Optional;

import com.OOP.Rest.RestAPI.Controller.BookRepository;
import com.OOP.Rest.RestAPI.Models.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class BookService
{
    //
    @Autowired
    private BookRepository bookRepository;

    Book item = new Book("Java","200.00","Learn Java Programming");
    
    public void generate()
    {
        bookRepository.save(item);
    }


    //save
    public Book addItem(Book book)
    {
        Book b = new Book();
        b = book;
        bookRepository.save(b);
        return b;
    }

    //update
    public Book updateItem(Book book)
    {
        Book b = new Book();
        b = book;
        bookRepository.save(b);
        return b;
    }

    // remove item
    public void removeItem(Long id)
    {
        bookRepository.deleteById(id);
    }

    // find by id
    public Optional<Book> findItemId(Long id)
    {
       return  bookRepository.findById(id);
    }

    // find all item in book tables
    public List<Book> findAllBook()
    {
        return (List<Book>) bookRepository.findAll();
    }
}