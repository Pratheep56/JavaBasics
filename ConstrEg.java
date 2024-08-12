public class ConstrEg {
    int modelYear;
    String modelName;
    public ConstrEg(int year,String name){
        modelYear=year;
        modelName=name;
    }
    public static void main(String[] args) {
        ConstrEg obj=new ConstrEg(1969,"Mustang");
        System.out.printf("%s %s",obj.modelYear,obj.modelName);
    }
}
