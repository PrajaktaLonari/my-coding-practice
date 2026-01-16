public class SndLarg {
    //second largest element

    public static void main(String[] args){
        int arr[]={1,2,3,4,5,8,9,5,7};
        int largest=Integer.MIN_VALUE;
        int ndLar=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
           
        }
            System.out.println("The largest element is "+largest);
    for(int j=0;j<arr.length;j++){
            if(arr[j]!=largest&&arr[j]>ndLar){
                ndLar=arr[j];
            }
    }
        System.out.println("Te second largest element is "+ndLar);
        
    }
}

