package JavaCourse.Arrays;

import java.util.Arrays;

public class RotatedArray {
    public static int[] clockwise(int[] arr){
            int last = arr[arr.length-1];
            for(int i= arr.length-1;i>0;i--){
                arr[i] =arr[i-1];
            }
            arr[0] = last;

            return arr;
        }
        public static void main(String[] args) {
            int[] arr = {2,9,11,1,3,5};
            int[] arr1 = clockwise(arr);

            System.out.println(Arrays.toString(arr1));
        }
    }


