import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(mCat());
        mDog();

    }
    static String mCat(){
        Scanner sc = new Scanner(System.in);
        Cat cat =new Cat();

        System.out.println("cats name");
        cat.setName(sc.nextLine());

        System.out.println("cats age");
        cat.setAge(sc.nextInt());

        System.out.println("cats weight");
        cat.setWeight(sc.nextInt());

        return cat.getInfo();
    }
    static void mDog(){
        Scanner sc = new Scanner(System.in);
        Dog dog = new Dog();

        System.out.println("dogs name");
        dog.setName(sc.nextLine());

        System.out.println("dogs age");
        dog.setAge(sc.nextInt());

        System.out.println("dogs Owner name");
        dog.setNameOwner(sc.nextLine());

        dog.getInfo();

    }
    static void mParrot(){
        Scanner sc = new Scanner(System.in);
        Parrot parrot =new Parrot();

        System.out.println("parrots name");
        parrot.setName(sc.nextLine());

        System.out.println("parrot age");
        parrot.setAge(sc.nextInt());

        System.out.println("parrots color");
        parrot.setColor(sc.nextLine());

        parrot.getInfo();


    }
    static void mFish(){
        Scanner sc = new Scanner(System.in);
        Fish fish = new Fish();

        System.out.println("Fish name");
        fish.setName(sc.nextLine());

        System.out.println("fish age");
        fish.setAge(sc.nextInt());

        System.out.println("fish length");
        fish.setLength(sc.nextInt());

        fish.getInfo();


    }
}