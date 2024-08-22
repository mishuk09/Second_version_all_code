public class index {
    public static void main(String[] args) {
        String str = "a4b6c2";
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            // i++;

            StringBuilder sb = new StringBuilder();
            sb.append(str.charAt(i));

            int num = Integer.parseInt(sb.toString());

            for (int j = 1; j <= num; j++) {
                System.out.print(temp);
            }

        }

    }

}