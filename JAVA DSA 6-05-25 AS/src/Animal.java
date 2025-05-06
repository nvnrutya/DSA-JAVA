public class Animal { //Parent or super class
    String name;
    void eat(){
        System.out.println(this.name + " eats some food...! ");
    }
}
class Cat extends Animal { //child class
    String speed;
    Cat(String speed){
        this.speed = speed;
        this.name = name;
    }
    void speedData() {
        System.out.println(name + " runs " + speed);
    }
    public static void main(String[] args) {
        Animal animal = new Animal();

        Cat cat = new Cat("Fast");
        cat.name = "Tom";
        cat.eat();
        cat.speedData();



    }


}
