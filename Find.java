public class Find {
    public static void main(String[] args) {
        findSymbolOccurance();
    }
    public static void findSymbolOccurance(){
        String s = "Apple";
        int[] count = new int[3];
        char c = 'a';

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
