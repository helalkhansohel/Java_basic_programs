package Problems;

public class Find_Vowel_inString {
    public static void main(String[] args) {
        String a="Helal" , b="TVl";

        System.out.println(FindVowel(a)); // true

        System.out.println(FindVowel(b));// false
    }

    public static boolean FindVowel(String input){

        return input.toLowerCase().matches(".*[aeiou].*");
    }

}
