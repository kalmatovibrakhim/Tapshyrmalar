public class Cat {
    private String name;
    private int weight;
    private int age;
    void setName(String name){
        this.name=name;
    }
    void setWeight(int weight){
        this.weight=weight;
    }
    void setAge(int age){
        this.age=age;
    }
    String getName(){return name;}
    int getWeight(){return weight;}
    int getAge(){return age;}

    String getInfo(){
        return (" Name:"+name+" \n"+" Age:"+age+" \n"+"Weight: "+weight);
    }

}
