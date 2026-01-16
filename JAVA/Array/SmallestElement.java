public class SmallestElement {
    //Smallest element

    public static void main(String[] args){
        int arr[]={4,10,70,90,100,0,1,5,6};
        int s=arr[0];
        for(int i=0;i<arr.length;i++){
            if(s>arr[i]){
                s=arr[i];
            }
        }
        System.out.println("The smallest element is "+s);
    }

//The time complexity is 0(n) & space complexity is 0(1)
}
