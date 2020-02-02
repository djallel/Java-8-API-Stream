package Java8Streams;

import java.util.HashSet;

public class AB {
    A a = new A();
    A b = new B();

    public static void main(String[] args) {
        C x = new C();
        C y = new C();
        C z=x;
        System.out.println(z.i + " et " + z.j);

        HashSet s = new HashSet();

        s.add(new Integer(1));
        s.add(new Integer(1));
        s.add(new Integer(2));

        s.size();
    }

}

class A  {
};

class B  extends A   {
};

class OuterClass {
    private String str;

    class InnerClass {

    }
}

class C  {

    public static int i;
    public int j;

    public C() {
        i++;
        j=i;


    }
};

