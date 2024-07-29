package binary_search;

public class String_Char_ceiling {
    public static void main(String[] args) {
        char[] letters={'c','d','g','k'};
        char target='k';
        if(nextGreatestLetter( letters,  target)=='/')
            System.out.println("Invalid input");
        else
            System.out.println(nextGreatestLetter( letters,  target));


        }
    static char nextGreatestLetter(char[] letters, char target) {

        if(target>=letters[letters.length-1])
            return '/';
        if(letters.length==0)
            return '/';
        int s=0;
        int e=letters.length-1;// length-1

        while(s<=e) {
            int mid =(s+e)/2;
            if(target==letters[mid])
                return letters[mid+1];
            else if (target<letters[mid]) {
                e=mid-1;
            }
            else
                s=mid+1;
        }
        return letters[s];
    }

}


