import java.util.*;
import java.io.*;
public class Main
{
public static void main(String[] args)
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
int i;
for(i=1;i<=10;i++)
{
System.out.println("i"+"*"+"n"+"="+(i*n));
}
}
}
