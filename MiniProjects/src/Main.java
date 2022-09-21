public class Main {
    public static void main(String[] args) {
        System.out.println(primeNum(242));

        System.out.println(checkVowel("İ"));

        System.out.println(perfectNums(239));

        System.out.println(friendNums(220, 284));

        int[] numbers = {1,4,2,71,2,523,31,12};
        System.out.println(findNum(numbers, 52));
    }

    public static String primeNum(int num) {
        if(num == 1) {
            return "The number " + num + " is not a prime number";
        }

        if(num < 2) {
            return "Unapplicable Number";
        }

        boolean isPrime = true;
        for(int i = 2; i < num; i++){
            if(num % 2 == 0)  isPrime = false;
        }

        if(isPrime) {
           return "The number " + num + " is a prime number";
        } else {
           return "The number " + num + " is not a prime number";
        }
    }

    public static String checkVowel(String character) {
        String boldCharacters = "AIOU";
        String thinCharacters = "EİÖÜ";

        if(boldCharacters.contains(character)) {
            return character + " is a bold vowel";
        } else if (thinCharacters.contains(character)) {
            return character + " is a thin vowel";
        } else {
            return character + " is not a vowel";
        }
    }

    public static String perfectNums(int num) {
        int totalDividers = 0;

        for(int i = 1; i < num; i++) {
            if(num % i == 0) totalDividers += i;
        }

        if(num == totalDividers) {
            return "The number: " + num + " is a perfect number";
        } else {
            return "The number: " + num + " is not a perfect number";
        }
    }

    public static String friendNums(int num1, int num2) {
        int total1 = 0;
        int total2 = 0;

        for(int i = 1; i < num1; i++) {
            if(num1 % i == 0) total1 += i;
        }
        for(int i = 1; i < num2; i++) {
            if(num2 % i == 0) total2 += i;
        }

        if (num1 == total2 && num2 == total1) {
            return num1 + " and " + num2 + " are friend numbers";
        } else {
            return num1 + " and " + num2 + " are not friend numbers";
        }
    }

    public static String findNum(int[] array, int lookedFor) {
        for(int nums : array) {
            if(nums == lookedFor) return "The searched number : "+ lookedFor +" is in the list.";
        }
        return "The searched number : "+lookedFor +" is not in the list";
    }
}
