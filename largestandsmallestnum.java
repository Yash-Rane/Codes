public class largestandsmallestnum{
 public static void main (String[] args) {
    
    int arr[]={5,2,9,1,7};
    
    int min=arr[0];
    int max=arr[0];
    
    for(int i=0;i<arr.length;i++){
        if(arr[i]<min){
            min=arr[i];
        }
        if(arr[i]>max){
            max=arr[i];
        }
    }
    System.out.println("smallest " + min + " largest " + max);

    }
}