import java.util.Scanner;

public class BasicCalc {
    public static void main(String[] args) {
        Scanner inpObj=new Scanner(System.in);
        int oprn;
        int firstNum,secondNum;
        System.out.println("Welcome to the Basic Calculator.\n");
        int end=1;

        for(;end!=0;){
            System.out.println("Select your choice:");
            System.out.println("1 - Addition of 2 numbers");
            System.out.println("2 - Subtraction of 2 numbers");
            System.out.println("3 - Multiplication of 2 numbers");
            System.out.println("4 - Division of 2 numbers");
            System.out.println("5 - Modulus of 2 numbers");
            System.out.println("-1 - to Quit");
            oprn=inpObj.nextInt();

            if(oprn!=1 && oprn!=2 && oprn!=3 && oprn!=4 && oprn!=5 && oprn!=-1){
                System.out.println("You entered a wrong choice ,please select a correct option\n");
            }
            else if(oprn==-1){
                System.out.println("You have exited the calcultator successfully.");
                end=0;
            }
            else{
                System.out.println("Enter two integers: ");
                firstNum=inpObj.nextInt();
                secondNum=inpObj.nextInt();
                switch(oprn){
                    case 1:
                    System.out.println(String.format("The result is %d\n",firstNum+secondNum));
                    break;

                    case 2:
                    System.out.println(String.format("The result is %d\n",firstNum-secondNum));     
                    break;

                    case 3:
                    System.out.println(String.format("The result is %d\n",firstNum*secondNum));
                    break;

                    case 4:
                    System.out.println(String.format("The result is %f\n",(float)firstNum/secondNum));
                    break;

                    case 5:
                    System.out.println(String.format("The result is %d\n",firstNum%secondNum));
                    break;
                }
            }
            inpObj.close();
        }
    }
}
