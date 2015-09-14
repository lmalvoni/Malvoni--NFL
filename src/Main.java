import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		System.out.println("Input Touchdowns Scored:");
		Scanner keyboard = new Scanner(System.in);
/*TD=touchdowns scored
 * YDS=total yards
 * INT= total interceptions
 * Comp= total number of completed passes
 * ATT=total number of passes attempted
 * passerRating= passer rating in percent 
 */

		double TD = keyboard.nextDouble();
		System.out.println("Input Total Yards:");
		double YDS = keyboard.nextDouble();
		System.out.println("Input Number of Interceptions:");
		double INT = keyboard.nextDouble();
		System.out.println("Input Number of Completed Passes:");
		double Comp = keyboard.nextDouble();
		System.out.println("Input Number of Passes Attempted:");
		double ATT = keyboard.nextDouble();
		
		double a = ((Comp/ATT)-.3)*5;
		System.out.println("a = " + Double.toString(a));
		double b = ((YDS/ATT)-3)*.25;
		System.out.println("b = " + Double.toString(b));
		double c = (TD/ATT)*20;
		System.out.println("c = " + Double.toString(c));
		double d = 2.375-((INT/ATT)*25);
		System.out.println("d = " + Double.toString(d));
		double passerRating = ((a+b+c+d)/6)*100;
		System.out.println("passerRating = " + Double.toString(passerRating));

	}

}
