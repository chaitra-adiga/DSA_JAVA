package binary_search;

public class Floor_of_no {
    public static void main(String[] args) {
        int[]arr={2,3,5,9,16,18};
        int tar= 1;
        if(floor(arr,tar)==-1)
            System.out.println("Invalid try");
        else
            System.out.println("floor number of "+tar+" is " +floor(arr,tar));

    }
    static int floor(int[]arr,int t){
        if(t<arr[0])
            return -1;
        if(arr.length==0)
            return -1;
        int s=0;
        int e=arr.length-1;// length-1

        while(s<=e) {
            int mid =(s+e)/2;
            if(t==arr[mid])
                return arr[mid];
            else if (t<arr[mid]) {
                e=mid-1;
            }
            else
                s=mid+1;
        }
        return arr[e];
    }
}

