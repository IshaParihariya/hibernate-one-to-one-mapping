package com.isha.app;


import com.isha.model.Answer;
import com.isha.model.Question;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class LaunchStandardApp
{
    public static void main(String[] args)
    {
        Boolean flag=false;
        Configuration config=new Configuration();
        SessionFactory sessionFactory=null;
        Session session=null;
        Transaction transaction=null;

        config.configure();
        sessionFactory=config.buildSessionFactory();
        session=sessionFactory.openSession();

        // creating and updating the table
        //question
        // question1
        Question q1=new Question();
        q1.setQId(1);
        q1.setQuestion("What is Hibernate??");
        // question2
        Question q2=new Question();
        q2.setQId(2);
        q2.setQuestion("What is JAVA??");
        // answers
        // answer1
        Answer answer1=new Answer();
        answer1.setId(1);
        answer1.setAnswer("Hibernate is an ORM Framework!!");
        //answer2
        Answer answer2=new Answer();
        answer2.setId(2);
        answer2.setAnswer("Java is an Object Oriented Language!!");

        // both are directed towards each other 
        q1.setAnswer(answer1);
        q2.setAnswer(answer2);
        answer1.setQuestion(q1);
        answer2.setQuestion(q2);

        /*retrieving the data
       Question qa=session.get(Question.class,1);
       System.out.println(qa);
       */


        // try catch
        try
        {
            transaction=session.beginTransaction();
            session.persist(q1);
            session.persist(q2);
            flag=true;
        }
        catch (HibernateException e)
        {
            e.printStackTrace();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        //finally block
        finally
        {
           if(flag==true)
           {
               transaction.commit();
           }
          else
           {
               transaction.rollback();
           }
           session.close();
           sessionFactory.close();
        }
    }
}
