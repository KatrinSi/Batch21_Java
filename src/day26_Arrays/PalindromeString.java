package day26_Arrays;

public class PalindromeString {
    public static void main(String[] args) {

        String[] names = {"Anna", "Nalan", "Hannah", "Java", "Eve"};
        int countPalindromes = 0;
        for (int j = 0; j < names.length; j++) {

            String originalName = names[j];

            String reversed = "";

            for (int i = originalName.length() - 1; i >= 0; i--) {
                reversed += originalName.charAt(i);

            }
            if (originalName.equalsIgnoreCase(reversed)) {
                countPalindromes++;
                System.out.println(originalName);
            }
        }
        System.out.println("countPalindromes = "+ countPalindromes);
    }
}
