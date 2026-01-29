package Sorting;

class Sort{
public static void main(String args[]){
    int[] arr = {1,5,10,8,2,3};
   // selectionSort(arr);
   mergeSort(arr,0,arr.length-1);
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
}
public static void selectionSort(int[] arr){
    //Select Range initially 0 to n-1 and then check min in range 1 to n-1 and then swap min elem in pos 0
    //and continue the same till last element;
     for(int i=0;i<arr.length-1;i++){
        int min=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[min]){
                min=j;
            }
        }
        int temp=arr[i];
        arr[i]=arr[min];
        arr[min]=temp;
     }
}
public static void mergeSort(int[] arr,int left, int right){
    if(left<right){
        int mid=(left+right)/2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid+1, right);
        merge(arr,left,mid,right);
    }

    
}
public static void merge(int arr[], int left,int mid,int right){
          int [] arr1=new int[(mid-left)+1];
           int k=0;
          for(int i=left;i<=mid;i++){
             arr1[k]=arr[i];
             k++;
          }
          k=0;
          int arr2[] = new int[right-(mid)];
          for(int i=mid+1;i<=right;i++){
            arr2[k]=arr[i];
            k++;
          }
          int ind1=0;
          int ind2=0;
          int temp=left;
         
            for(int i=0;i<arr1.length;i++){
        System.out.println("1 ->"+arr1[i]);
    }
    for(int i=0;i<arr2.length;i++){
        System.out.println("2->"+ arr2[i]);
    }
          while(ind1<arr1.length || ind2<arr2.length){
              System.out.println("left ->"+temp+ "ind1->" + ind1 +" ind2 "+ ind2);
            int elem1=ind1<arr1.length?arr1[ind1]:Integer.MAX_VALUE;
            int elem2=ind2<arr2.length?arr2[ind2]:Integer.MAX_VALUE;
            if(elem1<elem2){
                
                 arr[temp]=elem1;
                 ind1++;
            }
            else{
               arr[temp]=elem2;
               ind2++;
            }
            temp++;
          }
          
          


}
}
