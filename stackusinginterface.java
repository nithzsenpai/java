import java.util.*;
interface Stack{
    void push(int val);
    int pop();
    void display();
    int max=5;
}
class Operations implements Stack{
   
    public final int MAX = 10;
    public int[] a;
    public int top;

    // Constructor to initialize the stack
    public Operations() {
        a = new int[MAX];
        top = -1;
    }
   public void push(int val)
    {
        if(top>=max)
        {
           System.out.println("stack is full\n");
            
        }
        else
        {
            top++;
            a[top]=val;
            System.out.println("item inserted\n");
            
        }

        
        }
    public int pop()
    {
        if(top==-1)
        {
            System.out.println("stack is empty\n");
            return 0;
        }
        else
        {
            int x;
            x=a[top];
            top--;
            return x;
        }
    }
    public void display()
    {
        int i;
        System.out.println("elements present are:\n");
        for(i=top;i>=0;i--)
        {
            System.out.println(a[i]);
            System.out.println("\n"); 
        }
    }
}

class Demostack{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of stack\n");
        int max=sc.nextInt();
        Operations obj1=new Operations();

        int option=0;
        while(option!=1)
        {
            int choice;
            System.out.println("menu:\n1)insert\n 2)delete\n 3)display\n 4)exit\n");
            do{
        
            
            System.out.println("enter choice:");
            choice=sc.nextInt();
            
            switch(choice){
                case 1: 
                {
                    
                    System.out.println("enter element to be inserted\n");
                    int n=sc.nextInt();
                    obj1.push(n);
                    break;
                }
                case 2:
                {
                    int x=obj1.pop();
                    break;
                }
                case 3:
                {
                    
                    obj1.display();
                    break;
                }
                case 4:
                {
                    System.out.println("exit point\n");
                    break;
                }
            }
        }while(choice!=4);
    }
}
}
       
        
