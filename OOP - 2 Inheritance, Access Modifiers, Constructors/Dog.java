import Animal.Animal;

public class Dog extends Animal implements Runner{

    @Override
    public void run() {
        System.out.println("Dog in running");
    }
}