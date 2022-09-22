import java.util.Scanner;


public class FactorsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		num = sc.nextInt();
		if(num==0){
			System.out.println("No factors");
		}
		if(num<0){
			num= num*-1;
		}
		for (int i=1;i<=num;++i){
			if(num% i == 0){
				System.out.println(i + " ");
			}
		}
	}

}
