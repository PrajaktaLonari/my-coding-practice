public class Rarr {
    // Reverse array
    public static void main(String[] args) {
        int arr[]={4,5,6,7,8,9,3,2,1};
        System.out.println("The Reverse array is : ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    
    //Sorting
    System.out.println();
    System.out.println("The sorted array is :");
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length-i-1;j++){
          if(arr[j]>arr[j+1]){
            int temp;
            temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
          }
        }
    }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
