import java.io.*;
import java.util.*;
public class largestofthreenum
{
public static void main(String[] args)
{
int a,b,c;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if((a>b)&&(a>c))
{
System.out.println(+a+" is largest number");
}
if((b>a)&&(b>c))
{
System.out.println(+b+" is largest number");
}
if((c>a)&&(c>b))
{
System.out.println(+c+" is largest number");
}
}
}