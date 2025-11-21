public class CopyConstructor {

    String name;
    int id;

    // Parameterized Constructor
    CopyConstructor(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Copy Constructor
    CopyConstructor(CopyConstructor obj) {
        this.name = obj.name;
        this.id = obj.id;
    }

    public static void main(String[] args) {

        System.out.println("First Object:");
        CopyConstructor obj1 = new CopyConstructor("Sweta", 68);
        System.out.println("Name: " + obj1.name + ", ID: " + obj1.id);

        System.out.println();

        System.out.println("Second Object (Copy Constructor):");
        CopyConstructor obj2 = new CopyConstructor(obj1);
        System.out.println("Name: " + obj2.name + ", ID: " + obj2.id);
    }
}
