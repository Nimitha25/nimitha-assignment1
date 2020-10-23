import java.util.Arrays;
import java.util.Collections;

public class Sorting {
  
    public static void main(String[] args) {
        String[] arr={"dog","cat","bat","rat"};
        System.out.println(sortStrings(arr));
    }
    public static String sortStrings(String[] arr){
        for (int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++)
            {
                if(arr[i].compareTo(arr[j])>0){
                    String temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return Arrays.toString(arr);
    }
}

