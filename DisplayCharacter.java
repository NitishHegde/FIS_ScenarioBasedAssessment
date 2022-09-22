import java.util.*;

class DisplayCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("ENter the number of inputs");
        num=sc.nextInt();
        if(num>=4){
        	System.out.println("Enter the digits:");
            for (int i = 0; i < num; ++i) {
                int digit = sc.nextInt();
                System.out.println(digit + "-" + (char) digit);
             }
        }
        else{
        	System.out.println("enetr minimum 4 inputs");
        }
       
    }
}