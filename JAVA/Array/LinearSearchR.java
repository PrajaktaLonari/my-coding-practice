import java.util.*;
public class LinearSearchR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key : ");
        int key = sc.nextInt();
        int arr[]={10,20,30,40,50,60,70,80,90,1,2,3,4,5,6,7,8,9};
        int count=0;
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                flag=true;
                System.out.println("The key is found at index : "+arr[i]);
                count++;
            }
        }
       if(!flag){
       System.out.println("The is not Found!!");
       }
       System.out.println("The key occurrence in list is : "+count); 
    }
}
