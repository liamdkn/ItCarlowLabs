package lab6q1;

public class Test {
	   public static void main(String[] args) {
	      // Test Student class
	      Student s1 = new Student("John Doe", "1 FairyLand Ave", args, null);
	      s1.addCourseGrade("H2215", 92);
	      s1.addCourseGrade("H2202", 68);
	      s1.printGrades();
	      System.out.println("Average grade is " + s1.getAverageGrade());
	      
	      // Test Teacher class
	      Teacher t1 = new Teacher("Oisin Cawley", "8 Yellow Brick Road", 0, args);
	      System.out.println(t1);
	      String[] courses = {"H2215", "H2202"};
	      for (String course: courses) 			//Note the shortcut technique here for iterating through an array.
	      {
	         if (t1.addCourse(course)) 			//Note that addCourse returns a boolena to indicate success or not.
	         {
	            System.out.println(course + " added.");
	         } 
	         else 
	         {
	            System.out.println(course + " cannot be added.");
	         }
	      }
	      for (String course: courses) 			//Note that removeCourse returns a boolena to indicate success or not.
	      {
	         if (t1.removeCourse(course)) 
	         {
	            System.out.println(course + " removed.");
	         } 
	         else 
	         {
	            System.out.println(course + " cannot be removed.");
	         }
	      }
	   }
	}

