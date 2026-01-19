import java.util.*;
public class LS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Key");
        int key = sc.nextInt();
        int arr[]={10,20,30,40,50,60,70,80,90};
        boolean flag=false;
        for(int i = 0; i<arr.length;i++){
        if(arr[i]==key){
            flag=true;
            System.out.println("The key is found at index : "+i);
            break;
        }
     }
     if(!flag){
        System.out.println("The key is not found ");
     }          
}

}
