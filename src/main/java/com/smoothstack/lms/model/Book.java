package com.smoothstack.lms.model;

import java.io.Serializable;
import java.util.List;

public class Book implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String title;
	private List<Genre> genres;
	private List<Author> authors;
	private Publisher publisher;
	private List<LibraryBranch> branches;
	private List<Borrower> borrowers;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Genre> getGenres() {
		return genres;
	}

	public void setGenres(List<Genre> genres) {
		this.genres = genres;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public List<LibraryBranch> getLibraryBranches() {
		return branches;
	}

	public void setLibraryBranches(List<LibraryBranch> branches) {
		this.branches = branches;
	}

	public List<Borrower> getBorrowers() {
		return borrowers;
	}

	public void setBorrowers(List<Borrower> borrowers) {
		this.borrowers = borrowers;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", genres=" + genres + ", authors=" + authors + ", publisher="
				+ publisher + ", branches=" + branches + ", borrowers=" + borrowers + "]";
	}
	
}
