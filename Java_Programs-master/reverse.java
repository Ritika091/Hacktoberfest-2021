import java.util.*;
public class Reverse
{  
public static void main(String[] args)   
{  
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number");
  int num=sc.nextInt();
  int rev = 0;  
while(num != 0)   
{  
int r = num % 10;  
rev = rev * 10 + r;  
num = num/10;  
}  
System.out.println("Reverse number is "+rev);
}  
} 
