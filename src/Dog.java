public class Dog {
    private String name;
    private String nameOwner;
    private int age ;
    void setName(String name){
        this.name=name;
    }
    void setNameOwner(String nameOwner){
        this.nameOwner=nameOwner;
    }
    void setAge(int age){
        this.age=age;
    }
    String getName(){return name;}
    String getNameOwner(){return nameOwner;}
    int getAge(){return age;}

    void getInfo(){
        System.out.printf(" Name: %s \n Age: %d \n Owner Name: %s",name,age,nameOwner);
        System.out.println();
    }
}
