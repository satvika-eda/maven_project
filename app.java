package demo1;

import java.util.Scanner;
public class app implements Gifts2 {
int costs;
public void choco(int x)
{costs=x;
}
public void bicci(int x)
{costs=x;
}
public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
System.out.println("Enter chocolates count:");
int c=sc.nextInt();
app c1[]=new app[c];
for(int i=0;i<c;i++)
{c1[i]=new app();
}
System.out.println("Enter chocolates price:");
for(int i=0;i<c;i++)
{ int cos=sc.nextInt();
c1[i].choco(cos);
}
System.out.println("Enter biscuits count:");
int b=sc.nextInt();
app b1[]=new app[b];
for(int i=0;i<b;i++)
{b1[i]=new app();
}
System.out.println("Enter biscuits price:");
for(int i=0;i<b;i++)
{ int cost=sc.nextInt();
b1[i].bicci(cost);
}
for(int i=0;i<c;i++)

{for(int j=1;j<c-i;j++)
{ if(c1[j-1].costs > c1[j].costs){  
    //swap elements
int temp;
    temp =c1[j-1].costs ;  
    c1[j-1].costs = c1[j].costs;  
    c1[j].costs = temp;  
}  
}
}
for(int i=0;i<c;i++)
System.out.println(c1[i].costs);

System.out.println("Enter a range");
int a=sc.nextInt();
int b2=sc.nextInt();
for(int i=0;i<b;i++)
{if(b1[i].costs>=a && b1[i].costs<=b)
System.out.println("candie"+(i+1));
}
}
}
