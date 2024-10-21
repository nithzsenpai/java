import java.util.Scanner;
abstract class Shape{

double a,b,r;

Shape(double x,double y)
{
  a=x;
  b=y;
}
Shape(int rad)
{
   r=rad;
}


abstract double printArea();

}


class Rectangle extends Shape
{
  Rectangle(double a,double b)
 {
	super(a,b);
 }
double  printArea()
  {	
  return a*b;
   }
}

class Triangle extends Shape
 {
 Triangle(double  a, double b)
	{
   	  super(a,b);
	}

double printArea()
  	{
  	  return 0.5*a*b;
  	}
 }

class Circle extends Shape
 {
  Circle(double a,double b)
	{
   	 super(a,b);
 	}

  double  printArea()
  {return 3.14*a*b;}
 }


class Abstractdemo{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter dim1");
double dim1=sc.nextDouble();
System.out.println("enter dim2");
double dim2=sc.nextDouble();
System.out.println("enter radius");
double rad=sc.nextDouble();



Rectangle obj1=new Rectangle(dim1,dim2);
Triangle obj2=new Triangle(dim1,dim2);
Circle obj3=new Circle(rad,rad);
System.out.println("area of rectangle is"+" "+obj1.printArea());
System.out.println("area of triangle  is"+" "+obj2.printArea());

System.out.println("area of circle is"+" "+obj3.printArea());
}
}








