package com.utest.testing.project.questions;

import com.utest.testing.project.userinterface.CreateAccountPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String questions;

    public Answer(String question){

        this.questions = question;
    }
    public static Answer toThe(String question) {

        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String message = Text.of(CreateAccountPage.WELCOME_MESSAGE).viewedBy(actor).asString();
        return questions.equals(message);
    }

}
