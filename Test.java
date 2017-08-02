import java.io.*;
import java.util.*;
public class Test
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
int n=sc.nextInt();                                                                                  

if(n<0)
{
System.out.println(+n+"is negative");
}
else if(n>0)
{
System.out.println(+n+"is positive");
}
else
{
System.out.println(+n+"is zero");
}
}
}                                            
