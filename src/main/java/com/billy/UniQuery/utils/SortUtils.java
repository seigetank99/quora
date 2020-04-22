package com.billy.UniQuery.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortUtils {
    public static List<Map<String, Object>> sortAnswersByLikes(List<Map<String, Object>> answerList){
        for (int i=1;i<answerList.size();i++){
            for (int j=0;j<answerList.size()-i;j++){
                Map<String, Object> answer1=answerList.get(j);
                Map<String, Object> answer2=answerList.get(j+1);
                int count1= (int) answer1.get("agreecount");
                int count2= (int) answer2.get("agreecount");
                if (count1<count2){
                    Map<String, Object> answer=new HashMap<String, Object>();
                    answer=answer1;
                    answer1=answer2;
                    answer2=answer;
                    answerList.set(j,answer1);
                    answerList.set(j+1,answer2);
                }
            }
        }
        return answerList;
    }
    public static List<Map<String, Object>> sortQuestionsByAnswercount(List<Map<String, Object>> questionList){
        for (int i=1;i<questionList.size();i++){
            for (int j=0;j<questionList.size()-i;j++){
                Map<String, Object> question1=questionList.get(j);
                Map<String, Object> question2=questionList.get(j+1);
                int count1= (int) question1.get("answercount");
                int count2= (int) question2.get("answercount");
                if (count1<count2){
                    Map<String, Object> question=new HashMap<String, Object>();
                    question=question1;
                    question1=question2;
                    question2=question;
                    questionList.set(j,question1);
                    questionList.set(j+1,question2);
                }
            }
        }
        return questionList;
    }
}
