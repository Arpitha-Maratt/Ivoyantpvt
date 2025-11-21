package JavaCourse.arrays;

public class FindZeroAndEncounter {
    public static void main(String[] args) {

        int[] numbers1 = {1, 2, 5, -2, 70, 0, 8};

        for (int i = 0; i < numbers1.length; i++) {

            if (numbers1[i] < 0) {
                continue;   // skips negative numbers
            }
            else if (numbers1[i] == 0) {
                System.out.println("Encountered");
                break;      // stops loop when 0 found
            }
            else {
                System.out.println(numbers1[i]); // prints positive numbers
            }
        }
    }
}
