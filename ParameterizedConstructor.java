public class ParameterizedConstructor {

    // data members of the class
    String name;
    int id;

    // Parameterized Constructor
    ParameterizedConstructor(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display object data
    void display() {
        System.out.println("MyName: " + name + " and MyId: " + id);
    }

    public static void main(String[] args) {

        // This will invoke the parameterized constructor
        ParameterizedConstructor geek1 = new ParameterizedConstructor("Arpitha", 60);
        geek1.display();
    }
}
