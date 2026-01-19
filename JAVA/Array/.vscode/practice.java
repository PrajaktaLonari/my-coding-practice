class practice{
    public static void main(String [] args){
        int arr[]={9,8,7,6,5,4,3,2,1};
        //1
        System.out.println("The array is ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        //2
        System.out.println("The Reverse array is ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        //3 bubble sort
        System.out.println("The sorted array is ");
         for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                 if(arr[j]>arr[j+1]){
                    int temp;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    
                 }
                 }}
                 for(int i=0;i<arr.length;i++){
                    System.out.print(arr[i]+" ");
                 }
        // reverse String and palindrome check 
        System.out.println("");
        String name = "madam";
        String rev="";
        for(int i=name.length()-1;i>=0;i--){
            char ch = name.charAt(i);
            rev=rev+ch;
        }
        System.out.println("The reverse String is : "+rev);
        if(rev.equalsIgnoreCase(name)){
            System.out.println("The String is Palindrome.");
        }
        else{
            System.out.println("The string is not Palindrome.");
                }
        // palindrome without using reverse concept
        int l=0;
        int r=name.length()-1;
        boolean isPalindrome =true;
        while(l<r){
            if(name.charAt(l)!=name.charAt(r)){
                isPalindrome=false;
                break;
                
            }
            l++;
                r--;
        }
            if(isPalindrome){
                System.out.println("The string is Palindrome. ");
            }
            else{
                System.out.println("The string is not Palindrome. ");
            }
// counting vowels in string
String A="Programming";
        int Vcount =0;
        for(int i=0; i<A.length();i++){
            char ch = A.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                Vcount++;
            }
        }
        System.out.println("The vowels in String is : "+Vcount);
        // linear search 
        int B[]={2,3,4,5,6,7,8,9,1,2,3,4,9};
        int key = 5;
        boolean flag=false;
        for(int i=0;i<B.length-1;i++){
            if(B[i]==key){
                flag=true;
                System.err.println("The key is found at Index : "+i);
                break;
            }
        }
        if(!flag){
            System.out.println("The key is not found");
        }
        // for count frequency 
        int k = 9;
        boolean f = false;
        int count=0;
        for(int i =0;i<B.length;i++){
            if(B[i]==k){
                f=true;
                System.out.println("The key is found at index : "+i);
                count++;

            }
        }
        if(!f){
            System.out.println("The key is not found");
            
        }
        System.out.println("The count of key in array is : "+count);

    }
}
