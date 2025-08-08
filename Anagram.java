public class AnagramChecker {

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] count1 = new int[256];
        int[] count2 = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            count1[s1.charAt(i)]++;
            count2[s2.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (isAnagram(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}
