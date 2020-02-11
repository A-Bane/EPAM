public class Calculator {
public void add(int a,int b)
{
	System.out.println("The sum is:"+(a+b));
}
public void sub(int a,int b)
{
	System.out.println("The subtracted result is:"+(a-b));
}
public void multiply(int a,int b)
{
	System.out.println("After multiplication,the number is is:"+(a*b));
}
public void divide(int a,int b )
{
	System.out.println("The number after division is:"+(a/b));
}
}

import java.util.Scanner;

public class Example {
public static void main(String args[])
{
	int a,b,ch,c;
	Calculator cal=new Calculator();
	System.out.println("Enter 2 numbers:");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	while(true)
	{
	System.out.println("Enter 1 if you want to ADD");
	System.out.println("Enter 2 if you want to SUBSTRACT");
	System.out.println("Enter 3 if you want to MULTIPLY");
	System.out.println("Enter 4 if you want to DIVIDE");
	ch=sc.nextInt();
	switch(ch)
	{
	case 1:	cal.add(a, b);
	break;
	case 2: cal.sub(a, b);
	break;
	case 3: cal.multiply(a, b);
	break;
	case 4:cal.divide(a, b);
	break;
	default: System.out.println("Wrong choice :/");
	}
	System.out.println("Continue? Press 1");
	c=sc.nextInt();
	if(c!=1)
		break;
	}
}
}
