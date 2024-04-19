package singleton;

public class Main {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("First");
        Singleton outro = Singleton.getInstance("Second");
        System.out.println(singleton.value);
        System.out.println(outro.value);
    }

}
