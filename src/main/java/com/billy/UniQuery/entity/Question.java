package com.billy.UniQuery.entity;

import java.util.Date;

public class Question {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_question.questionid
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    private Integer questionid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_question.title
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_question.content
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_question.createDate
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    private Date createdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_question.userid
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    private Integer userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_question.status
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_question.answerCount
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    private Integer answercount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_question.cateid
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    private Integer cateid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_question.questionid
     *
     * @return the value of t_question.questionid
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    public Integer getQuestionid() {
        return questionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_question.questionid
     *
     * @param questionid the value for t_question.questionid
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    public void setQuestionid(Integer questionid) {
        this.questionid = questionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_question.title
     *
     * @return the value of t_question.title
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_question.title
     *
     * @param title the value for t_question.title
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_question.content
     *
     * @return the value of t_question.content
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_question.content
     *
     * @param content the value for t_question.content
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_question.createDate
     *
     * @return the value of t_question.createDate
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_question.createDate
     *
     * @param createdate the value for t_question.createDate
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_question.userid
     *
     * @return the value of t_question.userid
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_question.userid
     *
     * @param userid the value for t_question.userid
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_question.status
     *
     * @return the value of t_question.status
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_question.status
     *
     * @param status the value for t_question.status
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_question.answerCount
     *
     * @return the value of t_question.answerCount
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    public Integer getAnswercount() {
        return answercount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_question.answerCount
     *
     * @param answercount the value for t_question.answerCount
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    public void setAnswercount(Integer answercount) {
        this.answercount = answercount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_question.cateid
     *
     * @return the value of t_question.cateid
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    public Integer getCateid() {
        return cateid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_question.cateid
     *
     * @param cateid the value for t_question.cateid
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    public void setCateid(Integer cateid) {
        this.cateid = cateid;
    }
}