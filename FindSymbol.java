public class FindSymbol {
    public static void main(String[] args) {
        findSymbolOccurance("Apple", 'a');
    }

    public static void findSymbolOccurance(String s, char c) {
        int[] count = new int[3];

        String temp = s.toLowerCase();
        for (int i = 0; i < temp.length(); i++) {
            c = temp.charAt(i);
            if (c >= 'a' && c <= 'c') {
                count[c - 'a']++;
            }
        }
        for (int i = 0; i < count.length; i++) {
            System.out.println((char) (i + 'a') + ": " + count[i]);
        }
    }
}
