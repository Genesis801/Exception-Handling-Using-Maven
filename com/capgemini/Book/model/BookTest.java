package com.capgemini.Book.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookTest {

	static Book book;
	Book book1;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before all the test ");
		book = new Book(123, "genesis", 200);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After all cases this is happening");
		book = null;
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before each test case this is happening");
		book1 = new Book(0, null, 0.0);
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After each test case this is happening");
		book1 = null;
	}

	@Test
	void testBook() {
		assertEquals(new Book(0, null, 0.0), book1);
	}

	@Test
	void testBookId() {
		assertEquals(123, book.getBid());
	}

	@Test
	void testBookName() {
		assertEquals("genesis", book.getBname());
	}

	@Test
	void testBookPrice() {
		assertEquals(200, book.getBprice());
	}

}
