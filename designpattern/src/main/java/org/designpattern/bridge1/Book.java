package org.designpattern.bridge1;

public class Book extends Manuscript {

	public Book(Formatter formatter) {
		super(formatter);
	}

	private String title;
	private String author;
	private String text;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public void Print() {
		System.out.println(formatter.format("Title", title));
		System.out.println(formatter.format("Author", author));
		System.out.println(formatter.format("Text", text));
		System.out.println();

	}

}
