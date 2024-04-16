package uprajnenia;
import java.util.Scanner;
public class hospital_exam {

	public static void main(String[] args) {
	 Scanner scan = new Scanner (System.in);
	 /*
	  * For a given period, everyday patients arrive at the hospital for an examination. 
	  * The hospital initially has 7 doctors. 
	  * Each doctor can treat only one patient per day, but sometimes there is a shortage of doctors, so the untreated patients are sent to other hospitals. Every third day the hospital makes calculations and if the number of untreated patients is greater than the treated patients, they hire one more doctor. 
	  * The hire happens before the daily patient's admission begins.
      Write a program, that calculates for a given period the number of treated and untreated patients.
      */
	 int period = Integer.parseInt(scan.nextLine());
	 int treatedPatients = 0;
	 int untreatedPatients = 0;
	 int countOfDoctors = 7;
	 for (int day = 1; day <= period; day++) {
		 int currentPatients = Integer.parseInt(scan.nextLine());
		 if((day%3==0)&&(untreatedPatients >treatedPatients	 )) {
			 countOfDoctors++;
		 }
		 if (currentPatients>countOfDoctors) {
			 treatedPatients += countOfDoctors;
			 untreatedPatients += currentPatients - countOfDoctors;
			 }else {
				 treatedPatients += currentPatients;
			 }
		 }
	 System.out.printf( "Treated patients: %d.%nUntreated patients: %d.",treatedPatients, untreatedPatients);
	 
	 }
	}


