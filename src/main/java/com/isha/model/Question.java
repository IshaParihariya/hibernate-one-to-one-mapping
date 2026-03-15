package com.isha.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
// table
public class Question
{
    // columns
    @Id
    private Integer qid;

    private String question;

    // one to one relationship between Question and Answer
    @OneToOne(cascade = CascadeType.ALL) // whatever we are doing to Question it will be done to Answer as well
    // aslo it can be from both sides bidirectional i.e., both can have one to one mapping towards each other**
    private Answer answer;

    // zero param constructor
    public Question()
    {
        System.out.println("zero param constructor");
    }

    //getter and setter
    public Integer getQId()
    {
        return qid;
    }
    public void setQId(Integer qid)
    {
        this.qid=qid;
    }

    public String getQuestion()
    {
        return question;
    }
    public void setQuestion(String question)
    {
        this.question=question;
    }
    // for answer
    public Answer getAnswer()
    {
        return answer;
    }

    public void setAnswer(Answer answer)
    {
        this.answer = answer;
    }

    @Override
    public String toString()
    {
        return "Question = [ qid= "+qid+ ", question= "+question +" , answer= "+answer;
    }
}
