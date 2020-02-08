package demo1;

import java.util.Scanner;
public class sweet implements Gifts1
{
	
int costs;
private String n;

public void choco(int x)
{
	costs=x;
}
public void bicci(int x)
{
	costs=x;
}  
public String getName()
{  
return n;  
}  

public void setName(String name)
{  
this.n=name;
}  
public static void main(String[] args) 
{
Scanner sin=new Scanner(System.in);
System.out.println("Enter fact name:");
String n1=sin.nextLine();
sweet st=new sweet();
st.setName(n1);
System.out.println("Enter chocolates count:");
int count=sin.nextInt();
sweet choc[]=new sweet[count];
for(int i=0;i<count;i++)
{
	choc[i]=new sweet();
}
System.out.println("Enter chocolates price:");
for(int i=0;i<count;i++)
{ 
	int price=sin.nextInt();
    choc[i].choco(price);
}
System.out.println("Enter biscuits count:");
int b=sin.nextInt();
sweet bicci[]=new sweet[b];
for(int i=0;i<b;i++)
{
	bicci[i]=new sweet();
}
System.out.println("Enter biscuits price:");
for(int i=0;i<b;i++)
{ 
	int price=sin.nextInt();
    bicci[i].bicci(price);
}
System.out.print("In the "+st.getName()+" factory, ");
display(b+count);
display(count,b);
System.out.println("Sorting costs of chocolates");
for(int i=0;i<count;i++)

{for(int j=1;j<count-i;j++)
{ if(choc[j-1].costs > choc[j].costs){  
    //swap elements
int temp;
    temp =choc[j-1].costs ;  
    choc[j-1].costs = choc[j].costs;  
    choc[j].costs = temp;  
}  
}
}
for(int i=0;i<count;i++)
System.out.println(choc[i].costs);

System.out.println("Enter a range");
int a=sin.nextInt();
int a2=sin.nextInt();
System.out.println("Printing candies within a given range");
for(int i=0;i<b;i++)
{if(bicci[i].costs>=a && bicci[i].costs<=b)
System.out.println("candie"+(i+1));
}
}
public static void display(int c)
{
System.out.println("Total sweets are: "+c);
}
public static void display(int a,int b)
{System.out.println("count of choco:"+a+"\n count of bicci are: "+b);
}

}
