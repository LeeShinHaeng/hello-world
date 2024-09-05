package com.example.mvcproject2.mission0905;

public class QuizQuestion {
    private int questionNumber;
    private String questionBody;
    private String questionAnswer;

    public QuizQuestion(int questionNumber, String questionBody, String questionAnswer) {
        this.questionNumber = questionNumber;
        this.questionBody = questionBody;
        this.questionAnswer = questionAnswer;
    }

    public int getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
    }

    public String getQuestionBody() {
        return questionBody;
    }

    public void setQuestionBody(String questionBody) {
        this.questionBody = questionBody;
    }

    public String getQuestionAnswer() {
        return questionAnswer;
    }

    public void setQuestionAnswer(String questionAnswer) {
        this.questionAnswer = questionAnswer;
    }
}
