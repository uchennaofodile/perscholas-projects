package views;

import controllers.StudentController;
import models.Student;

public class MVCPatternDemo {
	 private static Student retriveStudentFromDatabase (){
		Student stu =  new Student();
		stu.setName("Robert");
		stu.setRollnum("10");
		return stu;
		}	
		public static void main(String[] args) {
		//fetch student record based on his roll no from the database
		 Student model = retriveStudentFromDatabase() ;
		//Create a view : to write student details on console
		 StudentView view =  new StudentView () ;
		 StudentController controller = new StudentController(model, view) ;
		 controller. updateView();
		 //update model data
		 controller.setStudentName("John") ;
		 controller.updateView();
	     }
	}