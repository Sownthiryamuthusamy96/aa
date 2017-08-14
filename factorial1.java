import java.util.*;
import java.io.*;
public class Main
{
public static void main(String[] args)
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
int fact=1,i;
for(i=0;i<n;i++)
{
fact=fact*i;
}
System.out.println(fact);
}
}
