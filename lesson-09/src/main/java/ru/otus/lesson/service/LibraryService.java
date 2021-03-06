package ru.otus.lesson.service;

public interface LibraryService {

    void addBook(String title, String fullName, String name);

    void readAllBooks();

    void readBookByTitle(String title);

    void updateBook(String title, String fullName, String name);

    void deleteBookByTitle(String title);

    void createComment(String text, String title);

    void readAllComments();

    void readComment(String text);

    void readCommentByBookTitle(String title);

    void updateComment(String text, String newText);

    void deleteCommentByText(String text);
}
