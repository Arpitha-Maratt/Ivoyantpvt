class ConstructorOverload{
    ConstructorOverload(String name) {
        System.out.println("Constructor with one argument (String): " + name);
    }

    ConstructorOverload(String name, int age) {
        System.out.println("Constructor with two arguments (String, int): " + name + ", " + age);
    }

    ConstructorOverload(long id) {
        System.out.println("Constructor with one argument (long): " + id);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {

        ConstructorOverload obj1 = new ConstructorOverload("Sweta");

        ConstructorOverload obj2 = new ConstructorOverload("Amiya", 28);

        ConstructorOverload obj3 = new ConstructorOverload(325614567L);
    }
}
