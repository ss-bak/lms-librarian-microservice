package com.smoothstack.lms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smoothstack.lms.common.model.Book;
import com.smoothstack.lms.common.model.Branch;
import com.smoothstack.lms.common.model.Copies;
import com.smoothstack.lms.common.repository.BookCommonRepository;
import com.smoothstack.lms.common.repository.BranchCommonRepository;
import com.smoothstack.lms.common.repository.CopiesCommonRepository;

@Service
public class LibrarianService {

	@Autowired
	private BranchCommonRepository branchCommonRepository;

	@Autowired
	private BookCommonRepository bookCommonRepository;

	@Autowired
	private CopiesCommonRepository copiesCommonRepository;

	public List<Branch> getBranches() {
		return branchCommonRepository.findAll();
	}

	public Optional<Branch> getBranchById(long id) {
		return branchCommonRepository.findById(id);
	}

	@Transactional
	public boolean updateBranch(Branch libraryBranch) {
		if (!branchCommonRepository.existsById(libraryBranch.getBranchId())) {
			return false;
		}
		branchCommonRepository.save(libraryBranch);
		return true;
	}

	public List<Book> getBooks() {
		return bookCommonRepository.findAll();
	}

	public Optional<Copies> getCopiesById(long bookId, long branchId) {
		Book book = new Book();
		book.setBookId(bookId);
		Branch branch = new Branch();
		branch.setBranchId(branchId);
		return copiesCommonRepository.findAllByBookAndBranchAndCopiesAmountGreaterThanEqual(book, branch, 0);
	}

	@Transactional
	public void addCopies(Copies copies) {
		copiesCommonRepository.save(copies);
	}

	@Transactional
	public boolean updateCopies(Copies copies) {
		if (!copiesCommonRepository
				.findAllByBookAndBranchAndCopiesAmountGreaterThanEqual(copies.getBook(), copies.getBranch(), 0)
				.isPresent()) {
			return false;
		}
		copiesCommonRepository.save(copies);
		return true;
	}

}