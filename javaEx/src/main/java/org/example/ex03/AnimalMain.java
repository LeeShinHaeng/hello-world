package org.example.ex03;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.show();
        animal.sound();
        System.out.println();

        Animal cat = new Cat();
        cat.show();
        cat.sound();
        System.out.println();

        Animal dog = new Dog();
        dog.show();
        dog.sound();

        System.out.println();

        Animal ap = new Cat();
        ap.sound();
        ap = new Dog();
        ap.sound();
        ap = new Animal();
        ap.sound();

        System.out.println("-----");
        ap = new Dog();
        ap.animalMethod();
//        ap.dogMethod(); (사용 불가)
        Dog d = (Dog) ap;
        d.dogMethod();  // 형 변환 이후 사용 가능
    }
}
