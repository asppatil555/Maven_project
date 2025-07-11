package MavenProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import MavenProject.Entity.Student;
import MavenProject.Utility.HibernateUtility;

public class GetDatabyId {
	public static void main(String[] args) {
	SessionFactory factory=	HibernateUtility.getSessionFactory();
	 Session session= factory.openSession();
	 
	  Transaction transaction= session.beginTransaction();
	  
	  //deprecate method
	  //Student st=session.get(Student.class, 3);
	  
	  Student st=session.find(Student.class, 3);
	  System.out.println(st.toString());
	  
	  transaction.commit();
	  session.close();
	}

}
