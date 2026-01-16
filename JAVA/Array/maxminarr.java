public class maxminarr {
    // maximum and mininum array

    public static void main(String [] args){
        int arr[]={2,3,4,5,5,4,7,9,4,10};
        int max=arr[0];
        int min=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The max element is "+max);
        System.out.println("The min element is "+min);
    }
}
// "time complexity is 0(n) of searching

//reverse array
class main{
    public static void main(String[] args){
        int arr[]={2,4,6,8,10,1,3,5,7,9};
        System.out.println("The reverse array is ");
        for(int i=(arr.length-1);i>=0;i--){
            System.out.print(arr[i]+" ");
          
        }
         
    }
}
// time complexity is 0(n)

