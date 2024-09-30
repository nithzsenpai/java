import java.util.Scanner;
 class Multi1 {
    public static void main(String args[]){

      
        int i,j,k,x,y,z,l,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows in the first matrix: ");
        int r1=sc.nextInt();
        System.out.println("Enter the number of columns in the first matrix: ");
        int c1=sc.nextInt();
        System.out.println("Enter the number of rows in the second matrix: ");
        int r2=sc.nextInt();
        System.out.println("Enter the number of columns in the second matrix: ");
        int c2=sc.nextInt();
        if(c1!=r2)
        {System.out.println("operation not possible");}
        int a1[][]=new int[r1][c1];
        int a2[][]=new int[r2][c2];
        {for(i=0;i<r1;i++)
        { for(j=0;j<c1;j++)
            {System.out.println("enter element");
             a1[i][j]=sc.nextInt();}
            }}
        {for(i=0;i<r2;i++)
        {
            for(j=0;j<c2;j++)
            {
                System.out.println("enter element");
                a2[i][j]=sc.nextInt();
            }
        }}    

            int mul[][]=new int[r1][c2];
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c2;j++)
                mul[i][j]=0;
                for(k=0;k<r2;k++)
                {mul[i][j]=a1[i][k]*a2[k][j];



            }
        
    
    
}
for(i=0;i<r1;i++)
{for(j=0;j<c2;j++)
System.out.println(mul[i][j]);}
}
}