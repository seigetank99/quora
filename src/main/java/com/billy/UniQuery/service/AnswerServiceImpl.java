package com.billy.UniQuery.service;

import com.billy.UniQuery.entity.Answer;

import java.util.List;
import java.util.Map;

/**
 * 〈〉
 *
 * @author Billy Yan
 * @create 4/17/2020
 * @since 1.0.0
 */
public class AnswerServiceImpl implements AnswerServiceI {
    @Override
    public List<Map<String, Object>> listAnswerByQuestion(int qid) {
        return null;
    }

    @Override
    public List<Answer> listBestAnswers() {
        return null;
    }

    @Override
    public int flaggedAnswer(int questionid, int userid) {
        return 0;
    }
}
