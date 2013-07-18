package org.designpattern.bridge1;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Manuscript> documents = new ArrayList<Manuscript>();

		Formatter formatter = new BackwardFormatter();
		// Formatter formatter = new StandardFormatter();
		FAQ faq = new FAQ(formatter);
		Book book = new Book(formatter);
		book.setAuthor("Author");
		book.setText("C++");
		book.setTitle("Programming C++");
		TermPaper termPaper = new TermPaper(formatter);

		documents.add(faq);
		documents.add(book);
		documents.add(termPaper);

		for (Manuscript doc : documents) {
			doc.Print();
		}
	}

}
