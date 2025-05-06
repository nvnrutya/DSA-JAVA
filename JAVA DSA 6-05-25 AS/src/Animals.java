
abstract class Animals {
//abstraction example
    //Normal or concrete Methods

    void eat(){

        System.out.println("Animals eat some food");

    }

    //Abstraction methods

    abstract void speed(); //This will be completed in child class

}

class Cow extends Animals{

    @Override

    void speed(){

        System.out.println("Cow speed is fast...!");

    }

}

class Cheetah extends Animals{

    @Override

    void speed() {

        System.out.println("Cheetah's speed is very fast.....!");

    }

}

class AbstractionDemo {

    public static void main(String[] args ) {

        Cow Cow = new Cow();

        Cheetah cheetah = new Cheetah();

        Cow.eat();

        cheetah.eat();

        Cow.speed();

        cheetah.speed();

    }

}
