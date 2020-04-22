package com.billy.UniQuery.service;

import com.billy.UniQuery.entity.Answer;

import java.util.List;
import java.util.Map;

public interface AnswerServiceI {

    List<Map<String, Object>> listAnswerByQuestion(int qid);

    List<Answer> listBestAnswers();

    int flaggedAnswer(int questionid, int userid);

}
