import java.util.*;
public class Quad1{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter coeff of x2:");
        double a=sc.nextDouble();
        System.out.println("enter coeff of x:");
        double b=sc.nextDouble();
        System.out.println("enter coeff of constant:");
        double c=sc.nextDouble();

        double r1,r2,d,imag,real1;
        d=(b*b)-(4*a*c);
        r1=(-b+(Math.pow(d,0.5)))/(2*a);
        r2=(-b-(Math.pow(d,0.5)))/(2*a);
        if(d==0.0)
        {System.out.println("THE ROOTS ARE EQUAL AND REAL AND is"+ r1);}
        else if(d>0.0)
        
        {System.out.println("roots are real and distinct:"+ r1 + r2);}
        else
        {
            real1=-b/2*a;
            imag=Math.pow(d,0.5)/2*a;
            System.out.println("roots are imaginary:"+(real1+imag)+(real1-imag));
        }
        
    }
    
}
