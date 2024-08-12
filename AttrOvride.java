public class AttrOvride {
    int x=10;
    public static void main(String[] args) {
        AttrOvride myObj=new AttrOvride();
        myObj.x=25;
        System.out.println(myObj.x);
    }
}