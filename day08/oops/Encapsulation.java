package day8.oops;

class A{
    public int a=10;
    private int b=20;
    protected int c=30;
    int d=40;

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
class B extends A{
    void print(){
        System.out.println(a);
        System.out.println(getB());
        System.out.println(c);
        System.out.println(d);

    }

}
public class Encapsulation {
    public static  void main(String[] args){
        B obj = new B();
        obj.print();

    }
}
