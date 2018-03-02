import java.util.Scanner;

public class MathGrade {

	public static void main(String[] args) {
		
		int[] myList = new int[5];
		
		for(int i= 0; i<myList.length; i++) {
			myList[i] = (int) (Math.random() * 100);
		}
		int max = Integer.MIN_VALUE;
		
		for(int i= 0; i<myList.length; i++) {
			int x = myList[i];
			System.out.print(x + " ");
			if(x > max) {
				max = x;
			}
		}
		System.out.println("The maximum is " + max);
		/*Scanner scan = new Scanner(System.in);
		int month = Integer.parseInt(scan.nextLine());
		
		switch(month % 12) {
			case 0:
				System.out.println("December");
				break;
			case 1:
				System.out.println("January");
				break;
			case 2:
				System.out.println("February");
				break;
			case 3:
				System.out.println("March");
				break;
			case 4:
				System.out.println("April");
				break;
			case 5:
				System.out.println("May");
				break;
			case 6:
				System.out.println("June");
				break;
			case 7:
				System.out.println("July");
				break;
			case 8:
				System.out.println("August");
				break;
			case 9:
				System.out.println("September");
				break;
			case 10:
				System.out.println("October");
				break;
			case 11:
				System.out.println("November");
				break;
			default:
				System.out.println("IMPROPER");
				break;
		}
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the year you were born: ");
		int year = input.nextInt();
		 	
		switch (year % 12) {
			case 0: System.out.println("monkey"); break;
		 	case 1: System.out.println("rooster"); break;
		 	case 2: System.out.println("dog"); break;
		 	case 3: System.out.println("pig"); break;
		 	case 4: System.out.println("rat"); break;
		 	case 5: System.out.println("ox"); break;
		 	case 6: System.out.println("tiger"); break;
		 	case 7: System.out.println("rabbit"); break;
		 	case 8: System.out.println("dragon"); break;
		 	case 9: System.out.println("snake"); break;
		 	case 10: System.out.println("horse"); break;
		 	case 11: System.out.println("sheep"); break;
		 	default: break;
		 }*/

		
	}

}
