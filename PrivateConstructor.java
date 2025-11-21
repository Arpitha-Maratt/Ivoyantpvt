class PrivateConstructorExample {

    private PrivateConstructorExample() {
        System.out.println("Private constructor called");
    }

    public static void displayMessage() {
        System.out.println("Hello from PrivateConstructor");
    }
}

public class PrivateConstructor {
    public static void main(String[] args) {
        PrivateConstructorExample.displayMessage();
    }
}
