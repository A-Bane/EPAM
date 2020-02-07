import java.util.*;
class NewYear 
{
	public static void main(String[] args)

    {
		int Choice,choice,noChoco,noSweet,C,candleChoice,sorting_Decision;
		String choco[]= {"Ferrero Rocher","Lindt","Ghirardelli","Hershey's","Toblerone","Cadbury","Guylian","Patchi"};
		int choprice[]= {100,200,300,400,120,560,800,350};
		double choweight[]= {60,30,90,100,150,234.90,34.50,70};

		String sweet[]= {"Gulab Jamun","Jalebi","Kheer","Shikhand","Gajar ka Halwa"};
		int sprice[]= {200,150,220,120,210}; 
		double sweight[]= {4,5,2,3,3}; 
    	
 Scanner sc=new Scanner(System.in);
 
while(true)
{
System.out.println("Enter 1 for buying chocolates, 2 for sweets");
Choice=sc.nextInt();
switch(Choice)
{
case 1:
	System.out.println("Enter the chocolate you want to buy. Press the mentioned digit for selecting it");
	
Chocolate obj=new Chocolate();
obj.show(choco);
choice=sc.nextInt();

System.out.println("Do you wish to see price in sorted manner?");
sorting_Decision=sc.nextInt();
if(sorting_Decision==1)
obj.sort(choco,choweight,choprice);
System.out.println("Enter the number of chocolates");
noChoco=sc.nextInt();

obj.cal(choice,choprice,choweight,noChoco);
System.out.println("Do you want candles as a gift for shopping with us?Press 1 if so");
candleChoice=sc.nextInt();
if (candleChoice==1)
{
	obj.tweight+=obj.tweight/5;
}
break; 

case 2:
	System.out.println("Enter the sweets you want to buy. Press the mentioned digit for selecting it");
	
Sweet obj1=new Sweet();
obj1.show(sweet);
choice=sc.nextInt();

System.out.println("Do you wish to see price in sorted manner?");
sorting_Decision=sc.nextInt();
if(sorting_Decision==1)
obj1.sort(choco,choweight,choprice);

System.out.println("Enter the number of sweets");
noSweet=sc.nextInt();
obj1.cal(choice,sprice,sweight,noSweet);
System.out.println("Do you want candles as a gift for shopping with us?Press 1 if so");
candleChoice=sc.nextInt();
if (candleChoice==1)
{
	obj1.tweight+=obj1.tweight/5;
}
break;

}





System.out.println("Do you want to buy more? Press 1 to continue");
C=sc.nextInt();
if(C!=1)
	break;
}

}

}    




public class Sweet
{
	double tweight,tprice;
	void show(String sweet[])
	{
		for(int i=0;i<sweet.length;i++)
		{
			System.out.println(i+1+" "+sweet[i]);
		}
	}
	void cal(int choice,int sprice[],double sweight[],int noSweet)
	{
		tweight=noSweet*sweight[choice-1];
		tprice=noSweet*sprice[choice-1];
		System.out.println("Total weight:"+tweight);
		System.out.println("Total price:"+tprice);
		
	}
	void sort(String sweet[],double sweight[],int sprice[])
	{int i,j;
		String ctemp; double wtemp;int ptemp;
		for(i=0;i<6;i++)
		{
			for(j=0;j<6-i;j++)
			{
				if(sprice[j]>sprice[j+1])
				{
					ptemp=sprice[j];
					sprice[j]=sprice[j+1];
					sprice[j+1]=ptemp;
					
					wtemp=sweight[j];
					sweight[j]=sweight[j+1];
					sweight[j+1]=wtemp;
					
					ctemp=sweet[j];
					sweet[j]=sweet[j+1];
					sweet[j+1]=ctemp;
				}
			}
		}
		for(i=0;i<sweet.length;i++)
		{
			System.out.println(i+1+" "+sweet[i]+" "+sprice[i]+" "+sweight);
		}

	}
}
public class Chocolate
{
	double tweight,tprice;
	void show(String choco[])
	{
		
		for(int i=0;i<choco.length;i++)
		{
			System.out.println(i+1+" "+choco[i]);
		}
	}
	void cal(int choice,int choprice[],double choweight[],int noChoco)
	{
		tweight=noChoco*choweight[choice-1];
		tprice=noChoco*choprice[choice-1];
		System.out.println("Total weight:"+tweight);
		System.out.println("Total price:"+tprice);
		
	}
	void sort(String choco[],double choweight[],int choprice[])
	{int i,j;
		String ctemp; double wtemp;int ptemp;
		for(i=0;i<8;i++)
		{
			for(j=0;j<8-i;j++)
			{
				if(choprice[j]>choprice[j+1])
				{
					ptemp=choprice[j];
					choprice[j]=choprice[j+1];
					choprice[j+1]=ptemp;
					
					wtemp=choweight[j];
					choweight[j]=choweight[j+1];
					choweight[j+1]=wtemp;
					
					ctemp=choco[j];
					choco[j]=choco[j+1];
					choco[j+1]=ctemp;
				}
			}
		}
		for(i=0;i<choco.length;i++)
		{
			System.out.println(i+1+" "+choco[i]+" "+choprice[i]+" "+choweight);
		}

	}
	
	}
