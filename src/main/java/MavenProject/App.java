package MavenProject;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import MavenProject.Utility.HibernateUtility;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        SessionFactory factory =new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();     //This will Connect to Hibernate
        HibernateUtility.getSessionFactory();
    }
}