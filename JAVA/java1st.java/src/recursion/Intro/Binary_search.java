package recursion.Intro;

public class Binary_search {
    public static void main(String[] args) {
        int[]arr={-89,-67,-34,-8,0,1,2,3,5,9,16,18};
        int tar=-34;
        int ans= search1(arr,tar,0, arr.length-1);
        if(ans==-1){
            System.out.println("Element not found, re enter");
        }
        else
            System.out.println(ans);

    }

    static int search(int []arr, int tar, int s, int e ){
        if (s>e){
            return -1;
        //base condition
        }
        int m=s+(e-s)/2;
        if(tar==arr[m]){
            return m;
        } else if (tar<arr[m]) {
            e=m-1;
        }
        else
            s=m+1;

        return search(arr,tar,s,e);
    }

    //kunals way !

    static int search1(int []arr,int tar, int s ,int e){
        if(s>e)
            return -1;
        int m= s+(e-s)/2;
        if(arr[m]==tar)
            return m;
        else if (tar>arr[m]) {
            return search1(arr,tar,m+1,e);
        }
        return search1(arr,tar,s,m-1);
    }
}
