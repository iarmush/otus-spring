package ru.otus.lesson;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.otus.lesson.service.QuestionPrinter;

public class Lesson01 {

    public static final String SPRING_CONTEXT_XML = "spring-context.xml";

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(SPRING_CONTEXT_XML);

        QuestionPrinter questionPrinter = classPathXmlApplicationContext.getBean(QuestionPrinter.class);
        questionPrinter.printQuestions();
    }
}
