public class ThirdLargest {
    // third largest element

public static void main(String[] args){
   int arr[]={6,7,8,9,4,5,8,5,4,3,2,1,6,10,12};
   if(arr.length<3){
       return;
   }
   int Fst=arr[0];
   int Snd=Integer.MIN_VALUE;
   int Trd=Integer.MIN_VALUE;
   for(int i=0;i<arr.length;i++){
       if(arr[i]>Fst){
           Fst=arr[i];
       }
   }
   System.out.println("The largest element is "+Fst);
   for(int j=0;j<arr.length;j++){
       if(Fst !=arr[j]&&arr[j]>Snd){
           Snd=arr[j];
       }
   }
   System.out.println("THe second largest element is "+Snd);
   for(int k=0;k<arr.length;k++){
       if(Fst !=arr[k]&&Snd !=arr[k]&&arr[k]>Trd){
           Trd=arr[k];
       }
   }
   System.out.println("The third largest element is "+Trd);
}

}
