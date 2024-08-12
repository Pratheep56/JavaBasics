public class Ex3 {
    public static void main(String args[]){
        class Student{
            public String name;
            Student(String name){
                this.name=name;
            }


            public String toString(){
                return name;
            }
        }
        Student[] myStudents=new Student[]{
            new Student("Dharma"), new Student("Sanvi"), new Student("Rupa"), new Student("Ajay")
        };


        for(Student i:myStudents){
            System.out.println(i);
        }
    }    
}
