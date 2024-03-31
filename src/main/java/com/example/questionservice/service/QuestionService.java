package com.example.questionservice.service;

import com.example.questionservice.entity.Question;
import org.springframework.stereotype.Service;

import java.util.List;


public interface QuestionService {
    Question create(Question question);

    List<Question> getAll();

    Question getById(Long id);

    List<Question> getByQuizId(Long id);
}
