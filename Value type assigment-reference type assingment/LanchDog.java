class Dog{
    String name;
    int cost;
}

class LanchDog{
    public static void main(String[] args){
        // whenever the address of one variable is assigned to another variabl then it is called as reference type assing
        Dog d1=new Dog();
        d1.name="Leo";
        d1.cost=10000;
        Dog d2;
        // address of one variable assigned to another
        d2=d1;

        
        d2.name="snifer";
        d2.cost=50000;
        Dog d3;
        d3=d2;

        d3.name="sunny";
        d3.cost=60000;
        
        System.out.println(d3.name);
        System.out.println(d1.name);
        System.out.println(d3.cost);
        System.out.println(d2.name);

    }
}