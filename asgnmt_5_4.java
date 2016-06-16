import java.util.Scanner;
public class asgnmt_5_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float amount,timePeriod;
		System.out.println("Enter the principle amount and time period in years to calculate the simple intrest in different banks");
		amount = sc.nextInt();
		timePeriod = sc.nextInt();
		float sbiIntrest,iciciIntrest,axisIntrest;
		sbiIntrest=amount*timePeriod*SBI.getRateOfIntrest()/100;
		iciciIntrest=amount*timePeriod*Icici.getRateOfIntrest()/100;
		axisIntrest=amount*timePeriod*Axis.getRateOfIntrest()/100;
		System.out.println("Your SI for different banks are as follows\n"+ "SBI "+sbiIntrest+"\n"+"ICICI "+ iciciIntrest+"\n"+"Axis "+ axisIntrest);
		
		
	}

}
