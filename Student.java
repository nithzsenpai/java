import java.util.Scanner;
class Stud_details{

              int grade[]=new int[3];
              int creds[]=new int[3];
              int marks[]=new int[3];
              String usn,name;
      int i;
                Scanner sc = new Scanner(System.in);


                void getdetails()
                {  System.out.println("enter usn");
                
                  usn=sc.next();
                  System.out.println("enter name");
                  name=sc.next();
                  {for(int i=0;i<3;i++)
                   { System.out.println("enter marks ");                 
                     marks[i]=sc.nextInt();
                    
                   { if(marks[i]>=90)
                    grade[i]=10;
                    else if(marks[i]<90&&marks[i]>=80)
                    grade[i]=9;
                    else if(marks[i]<80 && marks[i]>=70)
                    grade[i]=8;
                    else 
                    grade[i]=7;}
                }}

                     {for(int i=0;i<3;i++)
                     {System.out.println("enter creds");
                        creds[i]=sc.nextInt();}}
                     }
                  
               
                 
                  void display()
               {
                     System.out.println("usn"+" "+usn);
                     System.out.println("name"+" "+name);
                    for(int i=0;i<3;i++)
                   {
                     System.out.println("marks of 3 subjects"+" "+marks[i]);
        
                    }
           }
           void sgpa()
           {
            
               double total=0.0,totalcreds=0.0;
               {for (int i = 0; i < 3; i++) 
                    {total=total+(grade[i]*creds[i]);
                    totalcreds=totalcreds+creds[i];}}
                System.out.println("sgpa is"+""+(total/totalcreds));}

                    
                
            
            
               
            

           }


 

 class Student{
                 public static void main(String args[])
            {
               Stud_details s1[]=new Stud_details[3];

               for(int j=0;j<1;j++)
              {
                 s1[j]=new Stud_details();
               }

                    for(int j=0;j<1;j++)
                  {
                    System.out.println("Enter the marks of"+(j+1)+" "+"student details");
                    s1[j].getdetails();
                 }
 

              for(int j=0;j<1;j++)
              {
                 s1[j].display();
               }
               for(int j=0;j<1;j++)
               {
                s1[j].sgpa();
            
               }

      }
 }
         
 















              

              
