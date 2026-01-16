import java.util.*;
class LSR{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the key : ");
    int key = sc.nextInt();
    int arr[]={1,2,3,4,5,6,7,8,9,1,9,8,7,6,5,4,3,2};
    boolean flag=false;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==key){
         flag=true;
         System.out.println("The key is found at index : "+arr[i]);
          break;
        }
    }
    if(!flag){
        System.out.println("The key is not found. ");
    }
  }
}