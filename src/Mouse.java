
//INHERITANCE FROM "Animal' (extends)
public class Mouse extends Animal {

    public Mouse() {
        System.out.println("A mouse scurries in!");
    }

    @Override
    public String sleep() {
        return "A mouse sleeps...";
    }

    @Override
    public String eat() {
        return "A mouse eats...";
    }


    //POLYMORPHISM
    public String steal() {
        return "A mouse 'steals'...";
    }
}
