/*U. Umut Kanbak
 * 
 * Write a program to compute a worker's wage according to the following rules:
The first 40 hours worked the employee is getting paid regular wage which is $10.00 per hour,
 and any hour after the first 40 the employee get paid one and a half time, $15.00. 
 The number of hours worked is provided by the user. 
 Here are sample outputs, the bold text is the user's input:
Enter number of hours worked: 30
Your wage is $300
Enter number of hours worked: 50
Your wage is $550
 */
import java.util.Scanner;
public class Salary {
	
	public static void main(String[] args) {
		double hoursWorked,
			wage,
            rate=10,
			overTime;
		
	Scanner input = new Scanner (System.in);
	System.out.print("Enter number of hours worked: ");
	hoursWorked = input.nextInt();
	if (hoursWorked <= 40){
		wage = hoursWorked*rate;
		System.out.printf("Your salary is: $%.2f",wage);}
	
	else{
		overTime = hoursWorked-40;
		wage = (overTime*(rate*1.5))+(40*rate);
		System.out.printf("Your salary is: $%.2f", wage);
	}
	}

}
