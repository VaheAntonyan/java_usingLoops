public class usingLoops {


    public static void printA(int len, char ch, char fillChar) {
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i == 0 || j == 0 || i + j == len - 1) {
                    System.out.print(ch);
                } else {
                    if (i + j > len - 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print(fillChar);
                    }
                }
                if (j == len - 1) {
                    System.out.println();
                }
            }
        }
    }

    public static void printF(int len, char ch, char fillChar) {
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i == len - 1 || j == len - 1 || i + j == len - 1) {
                    System.out.print(ch);
                } else {
                    if (i + j < len - 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print(fillChar);
                    }
                }
                if (j == len - 1) {
                    System.out.println();
                }
            }
        }
    }

    public static void main(String[] args) {
        int len = 8;
        char borderChar = '*';
        char fillChar = ' ';
        printA(len, borderChar, fillChar);
        System.out.println("");
        printA(len, borderChar, borderChar);
        System.out.println("");
        printF(len, borderChar, fillChar);
        System.out.println("");
        printF(len, borderChar, borderChar);
    }
}
