public class Ex2 {
    public static void main(String[] args) {
        class Student{
            public int rno;
            public String name;
            Student(int rno,String name){
                this.rno=rno;
                this.name=name;
            }
        }


        Student[] arr=new Student[5];
        arr[0]=new Student(1,"Muthu");
        arr[1]=new Student(2,"Velu");
        arr[2]=new Student(3,"Lakshmi");
        arr[3]=new Student(4,"Shakthi");
        arr[4]=new Student(5,"JD");


        System.out.println("Student details with their roll number and name: ");


        for(int i=0;i<arr.length;i++)
        System.out.printf("Roll number %d, Name: %s\n",arr[i].rno,arr[i].name);
    }
}
