class A{
    int a;
    public A(int a){
        this.a = a;
    }
    public void show(){
        System.out.print("A: "+ a);
    }
}

class B extends A{
    int b;
    public B(int a, int b){
        super(a);
        this.b = b;
    }

    @Override
    public void show(){
        super.show();
        System.out.println("B: "+ b);
    }
}

class C extends B{
    int c;
    public C(int a, int b, int c){
        super(a,b);
        this.c = c;
    }
    @Override
    public void show(){
        super.show();
        System.out.println("C: "+ c);
    }
}

public class Q5 {

    public static void main(String[] args) {
        A a = new A(1);
        a.show();

        B b = new B(10, 20);
        b.show();

        C c = new C(100, 200, 300);
        c.show();
    }


}
