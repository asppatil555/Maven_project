package MavenProject;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import MavenProject.Entity.Student;
import MavenProject.Utility.HibernateUtility;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Student s=new Student();
    	Student s1=new Student();
    	Student s2=new Student();
    	
    	s.setId(8);
    	s.setFname("shankar");
    	s.setLname("shirsath");
    	s.setCity("hinjewadi");
    	s.setGender("male");
    	s.setMobileNumber(12344445);
    	
    	s1.setId(4);
    	s1.setFname("Akshay");
    	s1.setLname("Patil");
    	s1.setCity("jalgaon");
    	s1.setGender("male");
    	s1.setMobileNumber(123456);
    	
    	s2.setId(6);
    	s2.setFname("sanket");
    	s2.setCity("jadhab");
    	s2.setCity("akola");
         s2.setCity("male");
         s2.setMobileNumber(5487);
         List<Student> stdlist=Arrays.asList(s,s1,s2);
       // System.out.println( "Hello World!" );
        //session factory
        SessionFactory factory =new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();     //This will Connect to Hibernate
        //2 session from session factory
      Session session=  factory.openSession();
      //3 transaction from session
      
      //part 1
      //to save single obj
//      Transaction transaction=session.beginTransaction();
//      // 4 save session
//      session.persist(s);
//      //5 pass to database
//      transaction.commit();
      
      //PART 2
      //to save list of students
      for(Student std:stdlist) {
    	  Transaction transaction=session.beginTransaction();
    	  session.persist(std);
    	  transaction.commit();
      }
      //6 session closed
      session.close();
    }
}