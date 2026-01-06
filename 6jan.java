// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Demo{
    public String Add(int a,int b){
        if(a%2==0){
            return"even";
        }
        return"odd";
        }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
           Demo obj=new Demo();
              System.out.println(obj);
               String r=obj.Add(20,3);
        System.out.println(r);
    }
}
