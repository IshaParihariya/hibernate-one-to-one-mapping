package com.isha.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Answer
{
    @Id
    private Integer id;
    private String answer;

    //bidirectional one to one mapping
    @OneToOne(cascade = CascadeType.ALL)
    private Question question;

    // zero param constructor
    public Answer()
    {
        System.out.println("zero param constructor");
    }

    //getter and setter
    public Integer getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id=id;
    }

    public String getAnswer()
    {
        return answer;
    }
    public void setAnswer(String answer)
    {
        this.answer=answer;
    }
    // for question
    public Question getQuestion()
    {
        return question;
    }
    public void setQuestion(Question question)
    {
        this.question=question;
    }

    @Override
    public String toString()
    {
        return "Answer = [ id= "+id+" , question= "+question+ " , answer= "+answer +" ]";
    }
}
