import java.util.Scanner; 
public class Solution { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int intialAmount=sc.nextInt();
        int addition=sc.nextInt();
        int subtraction=sc.nextInt();
        intialAmount+=addition;
        intialAmount-=subtraction;
        System.out.println(intialAmount);
        sc.close(); 
    } 
}