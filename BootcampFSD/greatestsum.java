import java.util.*;
/**
 * greatestsum
 */
public class greatestsum {

    public static void main(String[]args){
        int arr[][]={
            {5,4,8},
            {3,9,2},
            {5,8,3}
        };
        int large =0 , rowsum=0;
        for(int i=0;i < 3;i++)
        {large=0;
            for(int j=0;j<3 ;j++){
                if(arr[i][j]>=large)
                large= arr[i][j];
            }
             rowsum = rowsum+large;
        }
    System.out.println(rowsum);
    }
}