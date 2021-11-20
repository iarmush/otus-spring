package ru.otus.lesson.service;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.when;

import java.util.Optional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import ru.otus.lesson.dao.GenreDao;
import ru.otus.lesson.domain.Genre;

class GenreServiceImplTest {

    private static final String NAME = "name";

    @Mock
    GenreDao genreDao;
    @InjectMocks
    GenreServiceImpl genreServiceImpl;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testAddGenre() {
        when(genreDao.create(any())).thenReturn(0L);

        long result = genreServiceImpl.create(NAME);
        Assertions.assertEquals(0L, result);
    }

    @Test
    void testGetByName() {
        Genre genre = new Genre(0L, NAME);

        when(genreDao.selectByName(anyString())).thenReturn(Optional.of(genre));

        Genre result = genreServiceImpl.selectByName(NAME).orElseThrow();
        Assertions.assertEquals(genre, result);
    }
}
