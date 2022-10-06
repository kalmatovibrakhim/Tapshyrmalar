public class Fish {
    private String name;
    private int length;
    private int age;
    void setName(String name){this.name=name;}
    void setLength(int length){this.length=length;}
    void setAge(int age){this.age=age;}

    String getName(){return name;}
    int getLength(){return length;}
    int getAge(){return age;}

    void getInfo(){
        System.out.printf(" Name: %s \n Age: %d \n Length: %d",name,age,length);
        System.out.println();
    }
}
