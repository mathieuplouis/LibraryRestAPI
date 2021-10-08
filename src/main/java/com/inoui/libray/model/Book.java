package com.inoui.libray.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;




@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity
public class Book {
	@Id
	@GeneratedValue
	@Column(name="BOOK_ID")
	private long id;
	
	@NotNull
    @Column(name="BOOK_TITLE")
	private String title;
	
	@NotNull
	 @Column(name="BOOK_ISBN")
	private String isbn;
	@NotNull
	 @Column(name="NUMBER_OF_PAGES")
	private int numberOfPages;

}
