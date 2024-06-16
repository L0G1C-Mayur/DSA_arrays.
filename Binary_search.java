public class Binary_search {
    public static int search (int arr[], int key){
        int start = 0;
        int end = arr.length;

        while(start <= end){      // <= imp. --> for the index which becomes start, mid and end.
            int mid = (start+end)/2;

            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid]< key){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int key = 7;

        System.out.println("key found at : " + search(arr, key));

        
    }
}
