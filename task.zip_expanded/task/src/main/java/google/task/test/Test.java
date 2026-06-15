package google.task.test;

import java.util.Scanner;

import google.task.service.CreateCollegeService;
import google.task.service.CreateDeptService;
import google.task.service.CreatePrincipalService;
import google.task.service.CreateStudentService;
import google.task.service.CreateSubjectService;
import google.task.service.CreateTeacherService;
import google.task.service.DeleteCollegeService;
import google.task.service.DeleteDeptService;
import google.task.service.DeletePrincipalService;
import google.task.service.DeleteStudentService;
import google.task.service.DeleteSubjectService;
import google.task.service.DeleteTeacherService;
import google.task.service.FetchCollegeService;
import google.task.service.FetchDeptService;
import google.task.service.FetchPrincipalService;
import google.task.service.FetchStudentService;
import google.task.service.FetchSubjectService;
import google.task.service.FetchTeacherService;
import google.task.service.UpdateCollegeService;
import google.task.service.UpdateDeptService;
import google.task.service.UpdatePrincipalService;
import google.task.service.UpdateStudentService;
import google.task.service.UpdateSubjectService;
import google.task.service.UpdateTeacherService;
import google.task.serviceimple.CreateCollegeServiceImple;
import google.task.serviceimple.CreateDeptServiceImple;
import google.task.serviceimple.CreatePrincipalServiceImple;
import google.task.serviceimple.CreateStudentServiceImple;
import google.task.serviceimple.CreateSubjectServiceImple;
import google.task.serviceimple.CreateTeacherServiceImple;
import google.task.serviceimple.DeleteCollegeServiceImple;
import google.task.serviceimple.DeleteDeptServiceImple;
import google.task.serviceimple.DeletePrincipalServiceImple;
import google.task.serviceimple.DeleteStudentServiceImple;
import google.task.serviceimple.DeleteSubjectServiceImple;
import google.task.serviceimple.DeleteTeacherServiceImple;
import google.task.serviceimple.FetchCollegeServiceImple;
import google.task.serviceimple.FetchDeptServiceImple;
import google.task.serviceimple.FetchPrincipalServiceImple;
import google.task.serviceimple.FetchStudentServiceImple;
import google.task.serviceimple.FetchSubjectServiceImple;
import google.task.serviceimple.FetchTeacherServiceImple;
import google.task.serviceimple.UpdateCollegeServiceImple;
import google.task.serviceimple.UpdateDeptServiceImple;
import google.task.serviceimple.UpdatePrincipalServiceImple;
import google.task.serviceimple.UpdateStudentServiceImple;
import google.task.serviceimple.UpdateSubjectServiceImple;
import google.task.serviceimple.UpdateTeacherServiceImple;



public class Test {
	public static void main(String[] args) {
		while (true) {
			System.out.println("Management system");
			System.out.println("1.Add Principal");
			System.out.println("2.Add College");
			System.out.println("3.Add Dept");
			System.out.println("4.Add Student");
			System.out.println("5.Add Subject");
			System.out.println("6.Add Teacher");
			System.out.println("7.Delete Principal");
			System.out.println("8.Delete College");
			System.out.println("9.Delete Dept");
			System.out.println("10.Delete Student");
			System.out.println("11.Delete Subject");
			System.out.println("12.Delete Teacher");
			
			System.out.println("13.Update Principal");
			System.out.println("14.Update College");
			System.out.println("15.Update Dept");
			System.out.println("16.Update Student");
			System.out.println("17.Update Subject");
			System.out.println("18.Update Teacher");
			System.out.println("19.Fetch Principal");
			System.out.println("20.Fetch College");
			System.out.println("21.Fetch Dept");
			System.out.println("22.Fetch Student");
			System.out.println("23.Fetch Subject");
			System.out.println("24.Fetch Teacher");
			
			System.out.println("Enter your choice");

			Scanner s1=new Scanner(System.in);
			int x=s1.nextInt();

			switch (x) {
			case 1:
				CreatePrincipalService c1=new CreatePrincipalServiceImple();
				c1.addPrincipal();

				break;
			case 2:
				FetchPrincipalServiceImple f4=new FetchPrincipalServiceImple();
				FetchDeptServiceImple f5=new FetchDeptServiceImple();
				CreateCollegeService c2=new CreateCollegeServiceImple(f4,f5);
				c2.addCollege();

				break;
			case 3:
				FetchTeacherServiceImple f2=new FetchTeacherServiceImple();
				FetchStudentServiceImple f3=new FetchStudentServiceImple();
				CreateDeptService c3=new CreateDeptServiceImple(f2,f3);
				c3.addDept();
				break;
			case 4:
				CreateStudentService c4=new CreateStudentServiceImple();
				c4.addStudent();
				break;
			case 5:
				CreateSubjectService c5=new CreateSubjectServiceImple();
				c5.addSubject();
				break;
			case 6:
				FetchSubjectServiceImple f1=new FetchSubjectServiceImple();
				CreateTeacherService c6=new CreateTeacherServiceImple(f1);
				c6.addTeacher();
				
				break;
				
			case 7:
				DeletePrincipalService c7=new DeletePrincipalServiceImple();
				c7.deletePrincipal();

				break;
			case 8:
				DeleteCollegeService c8=new DeleteCollegeServiceImple();
				c8.deleteCollege();

				break;
			case 9:
				DeleteDeptService c9=new DeleteDeptServiceImple();
				c9.deleteDept();
				break;
			case 10:
				DeleteStudentService c10=new DeleteStudentServiceImple();
				c10.deleteStudent();
				break;
			case 11:
				DeleteSubjectService c11=new DeleteSubjectServiceImple();
				c11.deleteSubject();
				break;
			case 12:
				DeleteTeacherService c12=new DeleteTeacherServiceImple();
				c12.deleteTeacher();
				break;
				
			case 13:
				System.out.println("Enter Principal Id");
				int pid=s1.nextInt();

				UpdatePrincipalService c13=new UpdatePrincipalServiceImple();
				c13.updatePrincipal(pid);

				break;
			case 14:
				System.out.println("Enter College Id");
				int cid=s1.nextInt();
				UpdateCollegeService c14=new UpdateCollegeServiceImple();
				c14.updateCollege(cid);

				break;
			case 15:
				System.out.println("Enter Dept Id");
				int did=s1.nextInt();
				UpdateDeptService c15=new UpdateDeptServiceImple();
				c15.updateDept(did);
				break;
			case 16:
				System.out.println("Enter Student Id");
				int sid=s1.nextInt();
				UpdateStudentService c16=new UpdateStudentServiceImple();
				c16.updateStudent(sid);
				break;
			case 17:
				System.out.println("Enter Subject Id");
				int siid=s1.nextInt();
				UpdateSubjectService c17=new UpdateSubjectServiceImple();
				c17.updateSubject(siid);
				break;
			case 18:
				System.out.println("Enter Teacher Id");
				int tid=s1.nextInt();
				UpdateTeacherService c18=new UpdateTeacherServiceImple();
				c18.updateTeacher(tid);
				break;
				
			case 19:
				FetchPrincipalService c19=new FetchPrincipalServiceImple();
				c19.getPrincipal();

				break;
			case 20:
				FetchCollegeService c20=new FetchCollegeServiceImple();
				c20.getCollege();

				break;
			case 21:
				FetchDeptService c21=new FetchDeptServiceImple();
				c21.getDept();
				break;
			case 22:
				FetchStudentService c22=new FetchStudentServiceImple();
				c22.getStudent();
				break;
			case 23:
				FetchSubjectService c23=new FetchSubjectServiceImple();
				c23.geSubject();
				break;
			case 24:
				FetchTeacherService c24=new FetchTeacherServiceImple();
				c24.geTeacher();
				break;

			default:
				System.out.println("Plz enter proper number");
				break;
			}

		}
	}

}
