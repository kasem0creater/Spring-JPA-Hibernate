
package com.OOP.Rest.RestAPI.Controller;

import java.util.List;
import java.util.Optional;

import com.OOP.Rest.RestAPI.Models.Book;
import com.OOP.Rest.RestAPI.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
class BookController
{

    @Autowired
    private BookService bookService;


    @GetMapping("/")
    public String hello()
    {
        return "Hello Java Spring";
    }

    //
    @GetMapping("/ge")
    public void genarate()
    {
        bookService.generate();
    }

    @PostMapping(params = "/save")
    public Book addItem(@RequestBody Book book)
    {
      return  bookService.addItem(book);
    }

    //
    @PutMapping(params = "update")
    public Book updateItem(@RequestBody Book book)
    {
        return bookService.updateItem(book);
    }

    //
    @DeleteMapping(path = "/remove/{id}")
    public void removeItem(@PathVariable Long id)
    {
        bookService.removeItem(id);
    }

    //
    @GetMapping("/findId/{id}")
    public Optional<Book> findItemId(@PathVariable Long id)
    {
        return bookService.findItemId(id);
    }

    //
    @GetMapping("/findAll")
    public List<Book> findAllItem()
    {
        return bookService.findAllBook();
    }
}