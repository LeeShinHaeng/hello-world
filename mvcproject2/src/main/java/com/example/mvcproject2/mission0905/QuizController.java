package com.example.mvcproject2.mission0905;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class QuizController {
    private final ArrayList<QuizQuestion> quizQuestions;
    private final QuizSession quizSession;

    public QuizController(QuizSession quizSession) {
        this.quizSession = quizSession;
        quizQuestions = new ArrayList<>();
        quizQuestions.add(new QuizQuestion(1, "나의 이름", "이신행"));
        quizQuestions.add(new QuizQuestion(2, "나의 나이", "25"));
        quizQuestions.add(new QuizQuestion(3, "나의 생일", "1122"));
    }

    @GetMapping("/quiz")
    public String quizForm(Model model) {
        if (quizSession.getCurrentNumber() == 0) {
            quizSession.setScore(0);
            quizSession.setCurrentNumber(0);
        }
        model.addAttribute("quiz1", quizQuestions.get(0).getQuestionBody());
        model.addAttribute("quiz2", quizQuestions.get(1).getQuestionBody());
        model.addAttribute("quiz3", quizQuestions.get(2).getQuestionBody());

        return "quiz";
    }

    @PostMapping("/quiz")
    public String quiz(@RequestParam String name,
                       @RequestParam String age,
                       @RequestParam String birth) {
        if(name.equals(quizQuestions.get(0).getQuestionAnswer())){
            quizSession.setScore(quizSession.getScore()+1);
            quizSession.setCurrentNumber(1);
        }
        if(age.equals(quizQuestions.get(1).getQuestionAnswer())){
            quizSession.setScore(quizSession.getScore()+1);
            quizSession.setCurrentNumber(2);
        }
        if(birth.equals(quizQuestions.get(2).getQuestionAnswer())){
            quizSession.setScore(quizSession.getScore()+1);
            quizSession.setCurrentNumber(3);
        }

        return "redirect:/quiz-result";
    }

    @GetMapping("/quiz-result")
    public String quizResult(Model model) {
        model.addAttribute("quizSession", quizSession);
        return "quiz-result";
    }

    @GetMapping("/restart")
    public String restart() {
        quizSession.setScore(0);
        return "redirect:/quiz";
    }
}
