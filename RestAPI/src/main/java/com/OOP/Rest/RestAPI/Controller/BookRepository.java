package com.OOP.Rest.RestAPI.Controller;
import com.OOP.Rest.RestAPI.Models.*;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book,Long>
{}