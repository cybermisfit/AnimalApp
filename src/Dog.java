public class Dog extends Animal {

    public Dog() {
        System.out.println("A dog has entered the class!");
    }

    @Override
    public String sleep() {
        return "A dog sleeps...";
    }

    @Override
    public String eat() {
        return "A dog eats...";
    }
    public String barks() {
        return "A dog barks...";
    }
}
