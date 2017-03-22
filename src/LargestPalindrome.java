// Find the largest palindrome made from the product of two 3-digit numbers.
public class LargestPalindrome {

    private static boolean isPalindrome(int number){

        int original = number;
        int reverse = 0;

        for (int i=0; i<=number; i++){
            int remain = number % 10;
            number = number / 10;
            reverse = reverse * 10 + remain;
        }
        return reverse == original;
    }

    public static void main(String[] args) {

        long largest = 0;

        for (int i=999; i>0; i--)
            for (int j=999; j>0; j--){
            if (isPalindrome(i*j)){
                if ((i*j)>largest){
                    largest = i*j;
                }
            }
            }
        System.out.print("Largest palindrome: "+largest);
    }

}
