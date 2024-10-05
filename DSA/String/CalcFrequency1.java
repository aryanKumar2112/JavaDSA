package DSA.String;
public class CalcFrequency1 {
    public static void main(String[] args) {
        String s = "njifriflffyrwamlwi";
        int[] freq = new int[256]; // Assuming extended ASCII characters

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch]++;
        }

        // Print frequencies

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                System.out.println("Character: " + (char) i + ", Frequency: " + freq[i]);

            }

        }
    }
}

