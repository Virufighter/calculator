import java.util.Scanner;

public class calculator {
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }

    public static void main(String[] args) {
        calculator c=new calculator();
        Scanner sc=new Scanner(System.in);
        int i=1;
        while(i==1){
            System.out.println("1.add");
            System.out.println("2.substraction");
            System.out.println("3.multiplication");
            System.out.println("4.division");
            System.out.println("5.exit");
            System.out.println("enter your choice");
            int s=sc.nextInt();
            System.out.println("enter two numbers");
            int a= sc.nextInt();
            int b=sc.nextInt();
            switch (s){
                case 1:
                    System.out.println(c.add(a,b));
                       break;
                case 2: System.out.println(c.sub(a,b));;
                    break;
                case 3: System.out.println(c.mul(a,b));;
                    break;
                case 4: System.out.println(c.div(a,b));;
                    break;
                default:
                    System.out.println("invalid choice");
            }
            System.out.println("do you want to continue 1.yes 2.no");
            i=sc.nextInt();
        }
    }
}
