 class Gen<T> {
    T a;
    Gen(T a1){
        a=a1;
    }

    void display(){
        System.out.println("element is"+" "+a);
    }

    
}
class Demo{
    public static void main(String args[]){
        Gen<Integer> iob;
        iob=new Gen<Integer>(20);
        iob.display();
        Gen<String> iob1;
        iob1=new Gen<String>("nithya");
        iob1.display();

        
    }
}
