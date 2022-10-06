public class Parrot {
    private String name;
    private String color;
    private int age;
    void setName(String name){this.name=name;}
    void setColor(String color){this.color=color;}
    void setAge(int age){this.age=age;}

    String getName(){return name;}
    String getColor(){return color;}
    int getAge(){return age;}

    void getInfo(){
        System.out.printf(" Name: %s \n Age: %d \n Color: %s",name,age,color);
        System.out.println();
    }
}
