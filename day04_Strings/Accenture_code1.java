package Day04_Strings;

public class Accenture_code1 {

        public static void main(String[] args) {
            String s = "1C0C1C1A0B1";

            int result = s.charAt(0) - '0';

            for (int i = 1; i < s.length(); i += 2) {
                char op = s.charAt(i);
                int num = s.charAt(i + 1) - '0';

                if (op == 'A') {
                    result = result & num;
                } else if (op == 'B') {
                    result = result | num;
                } else if (op == 'C') {
                    result = result ^ num;
                }
            }

            System.out.println(result);
        }
    }

