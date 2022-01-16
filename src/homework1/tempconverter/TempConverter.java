package homework1.tempconverter;
import java.util.Scanner;
public class TempConverter {

	public static void main(String[] args) {
    int h;
	System.out.println("---------Welecom--------------");
	System.out.println("---Celsius-Fahrenheit/Fahrenheit-Celsius converter---");
	do {
	System.out.println("choose the conversion mode:");
	System.out.println("1- Celsius-Fahrenheit");
	System.out.println("2- Fahrenheit-Celsius");
	int x;
	double z;
	Scanner sc = new Scanner(System.in);
	x=sc.nextInt();
	if (x==1) {
	System.out.println("Enter the temperature to convert:");
	z=sc.nextDouble();
	double f=(z*9/5)+32; 
	System.out.println(f);
}
	if (x==2) {
		System.out.println("Enter the temperature to convert:");
		z=sc.nextDouble();
		double c=(z-32)*5/9;
		System.out.println(c);
		}
	System.out.println("do you want to convert other temperatures ?");
	System.out.println("press 1 for Yes or press 2 for No");

	 h= sc.nextInt();
	}
	while (h==1); 
	System.out.println("-------------------------------Good bye, see you soon---------------------------");
    }
}
