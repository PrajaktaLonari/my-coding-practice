import java.util.*;
public class LinearSearch {
    void PrintFound(int i){
            System.out.println("The key is found at "+i);
    }
    void PrintNotFound(){
         System.out.println("The key is not found ");
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       LinearSearch LS = new LinearSearch();
       System.out.println("Enter the key : ");
       int key = sc.nextInt();
       int arr[]={3,2,1,7,6,5,4,8,9,10,1,2,3,4,5,6,7,8,9,10};
       boolean flag = false;
       int count=0;

       for(int i = 0; i<arr.length;i++){
        if(arr[i]==key){
           flag=true;
           LS.PrintFound(i);
           count++;
        }
       
       } 
       if(!flag){
        LS.PrintNotFound();
       }
       System.out.println("The key is in list "+count+" times occurs");
    }
}
