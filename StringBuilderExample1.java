public class StringBuilderExample1{
    public static void main(String args[]){
   	 StringBuilder sb=new StringBuilder("Hello ");
   	 sb.append("Java");
   	 System.out.println(sb);
   	 sb.insert(1,"Jam");
   	 System.out.println(sb);
   	 sb.replace(1,4,"e");
   	 System.out.println(sb);
   	 sb.delete(1,2);
   	 System.out.println(sb);
   	 sb.reverse();
   	 System.out.println(sb);
    }
}

