interface Firstinterface {
    public void myMethod();
}

interface Secondinterface {
    public void myOtherMethod();
}

interface Thirdinterface{
    public void myAnotherMethod();
}

class DemoClass implements Firstinterface,Secondinterface,Thirdinterface{
    public void myMethod(){
        System.out.println("Some text..");
    }
    public void myOtherMethod(){
        System.out.println("Some other text...");
    }
    public void myAnotherMethod(){
        System.out.println("Some another text...");
    }
}

class InterfaceEx{
    public static void main(String[] args) {
        DemoClass obj=new DemoClass();
        obj.myMethod();
        obj.myOtherMethod();
        obj.myAnotherMethod();
    }
}