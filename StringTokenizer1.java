import java.util.StringTokenizer;

public class StringTokenizer1 {
    public static void main(String args[]){
        StringTokenizer st=new StringTokenizer("This program is to learn about the function of hasMoreTokens() method from StringTokenizer class");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
    }
    }
}
