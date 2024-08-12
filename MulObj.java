public class MulObj {
    int x=5;
    public static void main(String[] args) {
        MulObj myObj1=new MulObj();
        MulObj myObj2=new MulObj();
        myObj2.x=25;
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }
   
}
