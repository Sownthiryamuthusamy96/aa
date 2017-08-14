import java.util.*;
import java.io.*;
public class Main
{
public static void main(String[] args)
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
int a,c,temp=n;
while(n>0)
{
c=%10;
n=n/10;
a=a+(c*c*c);
}
if(temp==a)
{
System.out.println("Armstrong number");
}
else
System.out.println("not a Armstrong number");
}
}
