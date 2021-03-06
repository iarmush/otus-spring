package ru.otus.lesson.service;

import org.springframework.transaction.annotation.Transactional;

public interface LibraryService {

    void addBook(String title, String fullName, String name);

    void readAllBooks();

    void readBookByTitle(String title);

    void updateBook(String title, String fullName, String name);

    void deleteBook(String title);

    void createComment(String text, String title);

    void readCommentByBookTitle(String title);

    void updateCommentByBookTitle(String title, String text, String newText);

    void deleteCommentByBookTitle(String title, String text);

    @Transactional
    void deleteAllCommentsByBookTitle(String title);
}
