import java.util.StringTokenizer;

public class StringTokenizer3 {
    public static void main(String args[]){
        StringTokenizer st=new StringTokenizer("Hello Everyone Have a nice day"," ");
        System.out.println("Total number of Tokens before the loop: "+st.countTokens());
        while(st.hasMoreTokens()){
            System.out.println(st.nextElement());
        }
        System.out.println("Total number of Tokens after the loop: "+st.countTokens());
    }
}
