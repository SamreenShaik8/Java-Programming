// greatest of three numbers by using logical operators
public class logicalop {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        
        // logical and operator
        if(a>b && a>c){
            System.out.println("a is greter");
        }
        else if(b>a && b>c){
            System.out.println("b is greter");
        }
        else{
            System.out.println("c is greter");
        }

        // logical or operator 
        int x=10;
        int y=20;
        int z=15;
        if(x>y || x>z){
            System.out.println("Hi");
        }
        else if(y>x || y>z){
            System.out.println("Hello");
        }
        else{
            System.out.println("hurry...");
        }

    }
}
