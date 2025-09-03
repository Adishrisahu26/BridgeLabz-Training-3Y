public class WordReplacer {
    public static String replaceWord(String sentence, String target, String replacement) {
        StringBuilder result = new StringBuilder();

        int i = 0;
        int targetLen = target.length();

        while (i < sentence.length()) {
            // Check if substring starting at i matches the target word
            if (i + targetLen <= sentence.length() && sentence.substring(i, i + targetLen).equals(target)) {
                result.append(replacement);
                i += targetLen;
            } else {
                result.append(sentence.charAt(i));
                i++;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog. The fox is smart.";
        String target = "fox";
        String replacement = "cat";

        String modified = replaceWord(sentence, target, replacement);
        System.out.println(modified);
    }
}
