class AbstractSecond{
    public static void main(String[] args) {
        AbstractStudent myobj=new AbstractStudent();
        System.out.println("Name: "+myobj.fname);
        System.out.println("Age: "+myobj.age);
        myobj.study();
    }
}
