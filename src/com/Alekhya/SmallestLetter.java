package Alekhya;

public class SmallestLetter {
    public static void main(String[] args) {
    char[] arr = {'a','c','f','g'};
    char target = 'g';
    char anss = nextGreatestLetter(arr, target);
            System.out.println(anss);
}
static char nextGreatestLetter(char[]  letters, char target){
    int start = 0;
    int end = letters.length-1;
    while(start <= end) {
        //find the middle element
        int mid = start + (end-start)/2;

        if(target < letters[mid]) {
            end = mid -1;
        } else  {
            start = mid + 1;
        }

    }
    return letters[start % letters.length];

}

}
