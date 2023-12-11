package studentGradeCalculator;
import java.util.Scanner;
public class Task2 {
	
	//Task 2 - Student Grade Calculator
	
	static{
		System.out.println("\n***STUDENT GRADE CALCULATOR***");
		System.out.println("\n-------------------------\n    Grade Table   \n Avg_marks >= 80    , Grade A \n Avg_marks >=60&<80 , Grade B \n Avg_marks >=40&<60 , Grade C \n Avg_marks < 40     , Grade D \n------------------------- \n\n");
	}
	
	
	    public static void main(String args[])
	    {
	    	/* This program assumes that the student has 6 subjects,
	    	 * thats why I have created the array of size 6. You can
	    	 * change this as per the requirement.
	    	 */
	        int marks[] = new int[6];
	        int i;
	        float total=0, avg;
	        Scanner scanner = new Scanner(System.in);
			
	        
	        for(i=0; i<6; i++) { 
	           System.out.print("Enter Marks of Subject"+(i+1)+":");
	           marks[i] = scanner.nextInt();
	           total = total + marks[i];
	        }
	        //Displaying total marks here
	        System.out.println("\nThe student total marks is: "+total);
	        
	        scanner.close();
	        //Calculating average here
	        avg = total/6;
	        //Displaying average percentage here
	        System.out.println("The student average percentage is: "+avg);
	        System.out.print("The student Grade is: ");
	        if(avg>=80)
	        {
	            System.out.print("A");
	        }
	        else if(avg>=60 && avg<80)
	        {
	           System.out.print("B");
	        } 
	        else if(avg>=40 && avg<60)
	        {
	            System.out.print("C");
	        }
	        else
	        {
	            System.out.print("D");
	        }
	        
	        
	    }
	}

