package hibernate.hibernate.manytomany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;

import hibernate.hibernate.manytomany.dbconnection.DBConnection;
import hibernate.hibernate.manytomany.entity.Subject;
import hibernate.hibernate.manytomany.entity.Teacher;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        EntityManager eManager=DBConnection.dbCon().createEntityManager();
        eManager.getTransaction().begin();
        
        Subject s1=new Subject();
        s1.setSubid(1);
        s1.setName("JAVA");
        s1.setAuthor("ABC");
        
        
        Subject s2=new Subject();
        s2.setSubid(2);
        s2.setName("AI");
        s2.setAuthor("DEF");
        
        Subject s3=new Subject();
        s3.setSubid(3);
        s3.setName("DS");
        s3.setAuthor("GHI");
        
        Subject s4=new Subject();
        s4.setSubid(4);
        s4.setName("BDA");
        s4.setAuthor("JKL");
        
        Subject s5=new Subject();
        s5.setSubid(5);
        s5.setName("CSS");
        s5.setAuthor("MNO");
        
        Subject s6=new Subject();
        s6.setSubid(6);
        s6.setName("DLDA");
        s6.setAuthor("PQR");
        
        Subject s7=new Subject();
        s7.setSubid(7);
        s7.setName("OS");
        s7.setAuthor("STU");
        
        eManager.persist(s1);
        eManager.persist(s2);
        eManager.persist(s3);
        eManager.persist(s4);
        eManager.persist(s5);
        eManager.persist(s6);
        eManager.persist(s7);
        
        Set<Subject> ssSet1=new HashSet<Subject>();
        ssSet1.add(s1);
        ssSet1.add(s2);
        
        
        Set<Subject> ssSet2=new HashSet<Subject>();
        ssSet2.add(s3);
        ssSet2.add(s4);
     
        
        Set<Subject> ssSet3=new HashSet<Subject>();
        ssSet3.add(s5);
        ssSet3.add(s6);
        
        Set<Subject> ssSet4=new HashSet<Subject>();
        ssSet4.add(s7);
        
        
        Teacher t1=new Teacher();
        t1.setId(101);
        t1.setName("Ram");
        t1.setSalary(23456);
        t1.setDept("IT");
        t1.setSubjects(ssSet1);
        
        Teacher t2=new Teacher();
        t2.setId(102);
        t2.setName("Sham");
        t2.setSalary(23456);
        t2.setDept("ENTC");
        t2.setSubjects(ssSet2);
        
        Teacher t3=new Teacher();
        t3.setId(103);
        t3.setName("Onkar");
        t3.setSalary(23456);
        t3.setDept("MECH");
        t3.setSubjects(ssSet3);
        
        Teacher t4=new Teacher();
        t4.setId(104);
        t4.setName("Part");
        t4.setSalary(23456);
        t4.setDept("DS");
        t4.setSubjects(ssSet4);
        
        Teacher t5=new Teacher();
        t5.setId(105);
        t5.setName("Sushant");
        t5.setSalary(23456);
        t5.setDept("AI");
        t5.setSubjects(ssSet1);
        
        eManager.persist(t1);
        eManager.persist(t2);
        eManager.persist(t3);
        eManager.persist(t4);
        eManager.persist(t5);
        
        
        Set<Teacher> ttSet1=new HashSet<Teacher>();
        ttSet1.add(t1);
        ttSet1.add(t2);
        
        Set<Teacher> ttSet2=new HashSet<Teacher>();
        ttSet2.add(t3);
        ttSet2.add(t4);
       
        Set<Teacher> ttSet3=new HashSet<Teacher>();
        ttSet1.add(t5);
        
        s1.setTeachers(ttSet1);
        s2.setTeachers(ttSet2);
        s3.setTeachers(ttSet3);
        s4.setTeachers(ttSet1);
        s5.setTeachers(ttSet2);
        s6.setTeachers(ttSet3);
        s7.setTeachers(ttSet1);
        
        eManager.getTransaction().commit();
        System.out.println("Executed");
        
      
        
       
        
        
    }
}
