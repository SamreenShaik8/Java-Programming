class instance{
    int a;
    float b;
    char c;
    boolean d;
    String e;
    long f;
    double g;
    short h;
}

class instancevariable{
    public static void main(String[] args) {
        instance i=new instance();
        // jvm will provide default values  for instance variable
        System.out.println(i.a);
        System.out.println(i.b);
        System.out.println(i.c);
        System.out.println(i.d);
        System.out.println(i.e);
        System.out.println(i.f);
        System.out.println(i.g);
        System.out.println(i.h);

    }
}