class Gen<T, U> {
    T a;
    U b;
    Gen(T a1,U b1){
        a=a1;
        b=b1;
    }

    T displayt(){
        
        return a;
    }
    U displayv(){
        
        return b;

    
}
}
class Demo2{
    public static void main(String args[]){
        Gen<Integer,String> iob;
        iob=new Gen<Integer,String>(20,"nithz");
        int num=iob.displayt();
        String s=iob.displayv();
        System.out.println("number is"+" "+num);
        System.out.println("name is "+ s);

        
}
}