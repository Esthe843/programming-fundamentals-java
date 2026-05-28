import java.util.Scanner; 
public class Solution { 
    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in);
        int costPerDozen = sc.nextInt();
        int dozens = sc.nextInt();
        int discount = sc.nextInt();

        int total = costPerDozen * dozens;
        int finalAmount = total - (total * discount / 100);

        System.out.println(finalAmount);
    
        
        
        sc.close(); 
    } 
}