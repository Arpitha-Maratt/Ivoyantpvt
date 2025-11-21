package JavaCourse.Arrays;

public class RemoveElement {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};

        int index = 2;

        int[] newArr = new int[arr.length-1];

        for (int i =0,j=0; i < arr.length;i++) {

                if (i != index) {       //Skip the element at the removal index
                    newArr[j] = arr[i];  //Copy the rest of the elements
                    j++;
                }
            }
            for(int num : newArr){
                System.out.print(num + " ");
            }
        }
    }


