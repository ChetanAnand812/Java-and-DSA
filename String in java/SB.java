public class SB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        // set char at index 0
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        // insert extra 'n'
        sb.insert(2, 'n');
        System.out.println(sb);

        // Delete the extra 'n'
        sb.delete(2, 3);
        System.out.println(sb);
   
        // Append
        StringBuilder s = new StringBuilder("H");
        s.append("e");
        s.append("l");
        s.append("l");
        s.append("o");
        System.out.println(s);
        System.out.println(s.length());

    }
}
