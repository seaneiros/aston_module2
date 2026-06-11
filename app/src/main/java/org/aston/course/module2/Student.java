package org.aston.course.module2;

import java.util.ArrayList;
import java.util.List;

public class Student {
  private final String name;
  private final List<Book> books;

  public Student(String name, List<Book> books) {
    this.name = name;
    this.books = books;
  }

  public Student(String name) {
    this.name = name;
    this.books = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public List<Book> getBooks() {
    return List.copyOf(books);
  }

  public void addBook(Book book) {
    books.add(book);
  }

  @Override
  public String toString() {
    return name;
  }
}
