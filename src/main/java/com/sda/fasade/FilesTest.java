package com.sda.fasade;

import java.io.FileNotFoundException;
import java.util.List;

public class FilesTest {
    public static void main(String[] args) throws FileNotFoundException {
        QuizFileRepository quizFileFasade = new QuizFileRepository("\"D:\\\\Programy\\\\SDA java projects\\\\javapoz7_designpatterns\\\\test.txt\"");
        List<QuizQuestion> questions = quizFileFasade.readAll();
        questions.forEach(e -> System.out.println(e));
    }
}
