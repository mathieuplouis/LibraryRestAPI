package com.inoui.libray.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.inoui.libray.model.Book;
//Exposing the Rest API
@RepositoryRestResource(path="books",  collectionResourceRel="books")
public interface BookRepository extends PagingAndSortingRepository<Book, Long> {

}
