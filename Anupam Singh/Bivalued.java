import java.util.*;
public class Bivalued
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int arr[]= new int[n];
int max=Integer.MIN_VALUE;

for(int i=0;i<n;i++)
arr[i]=sc.nextInt();



int a= sc.nextInt();
int b = sc.nextInt();

if(a>=arr.length || b>=arr.length)
System.out.print("worng input");

if(arr[a]==arr[b])
{for(int i=a+1;i<b;i++)
{
max = Math.max(arr[i],max);
}

System.out.println(max);
}
else
{
System.out.println("try again");
}




}
}