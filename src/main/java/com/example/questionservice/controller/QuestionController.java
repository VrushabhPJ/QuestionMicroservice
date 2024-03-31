package com.example.questionservice.controller;

import com.example.questionservice.entity.Question;
import com.example.questionservice.service.QuestionService;
import com.example.questionservice.service.impl.QuestionServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    private QuestionServiceImpl questionService;

    public QuestionController(QuestionServiceImpl questionService) {
        this.questionService = questionService;
    }

    @GetMapping
    private List<Question> findAll() {
        return questionService.getAll();
    }

    @GetMapping("/{id}")
    private Question findById(@PathVariable Long id) {
        return questionService.getById(id);
    }

    @PostMapping
    private Question create(@RequestBody Question question) {
        return questionService.create(question);
    }

    @GetMapping("/quiz/{quizId}")
    private List<Question> findByQuizId(@PathVariable Long quizId) {
        return questionService.getByQuizId(quizId);
    }
}
