
package Mypack;
class Balance
{
String name;
double Balance1;
Balance(String s ,double f)
{
name=s;
Balance1=f;
}
void displayshow()
{
if(Balance1<0)
{
System.out.println("No balance");
}
if(Balance1>0)
{
System.out.println("Name:"+name);
System.out.println("Balance:"+Balance1);
}
}
}
class AccountBalance{
public static void main(String args[])
{
Balance Current[]=new Balance[3];
Current[0]=new Balance("nithz",1000.0);
Current[1]=new Balance("shashi",2000.0);
Current[2]=new Balance("padma",-4.0);
for(int i=0;i<3;i++)
{
Current[i].displayshow();
}
}
}
