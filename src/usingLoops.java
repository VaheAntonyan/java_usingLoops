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

    public static void printB(int height, char ch, char fillChar) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height * 2 - 1; j++) {
                if (height - 1 - i == j || j == height - 1 + i || i == height - 1) {
                    System.out.print(ch);
                } else {
                    if (j < height - 1 - i || j > height - 1 + i) {
                        System.out.print(" ");
                    } else {
                        System.out.print(fillChar);
                    }
                }
                if (j == height * 2 - 2) {
                    System.out.println();
                }
            }
        }
    }

    public static void printC(int len, char ch, char fillChar) {
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i == 0 || j == len - 1 || i == j) {
                    System.out.print(ch);
                } else {
                    if (i > j) {
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

    public static void printD(int len, char ch, char fillChar) {
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i == len - 1 || j == 0 || i == j) {
                    System.out.print(ch);
                } else {
                    if (i < j) {
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

    public static void printE(int height, char ch, char fillChar) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height * 2 - 1; j++) {
                if (j == i || j == height * 2 - 2 - i || i == 0) {
                    System.out.print(ch);
                } else {
                    if (j < i || j > height * 2 - 2 - i) {
                        System.out.print(" ");
                    } else {
                        System.out.print(fillChar);
                    }
                }
                if (j == height * 2 - 2) {
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

    public static void printG(int height, char ch, char fillChar) {
        for (int i = 0; i < height * 2 - 1; i++) {
            for (int j = 0; j < height; j++) {
                if ((i < height && j == height - 1 - i) || (i >= height && i == height - 1 + j) || j == height - 1) {
                    System.out.print(ch);
                } else {
                    if ((i < height && j < height - 1 - i) || (i >= height && i > height - 1 + j)) {
                        System.out.print(" ");
                    } else {
                        System.out.print(fillChar);
                    }
                }
                if (j == height - 1) {
                    System.out.println();
                }
            }
        }
    }

    public static void main(String[] args) {
        int len = 8;
        char borderChar = '*';
        char fillChar = ' ';
        int height = 7;

        //printA()
        printA(len, borderChar, fillChar);
        System.out.println("");
        printA(len, borderChar, borderChar);
        System.out.println("");

        //printB()
        printB(height, borderChar, fillChar);
        System.out.println("");
        printB(height, borderChar, borderChar);
        System.out.println("");

        //printC()
        printC(len, borderChar, fillChar);
        System.out.println("");
        printC(len, borderChar, borderChar);
        System.out.println("");

        //printD()
        printD(len, borderChar, fillChar);
        System.out.println("");
        printD(len, borderChar, borderChar);
        System.out.println("");

        //printE()
        printE(height, borderChar, fillChar);
        System.out.println("");
        printE(height, borderChar, borderChar);
        System.out.println("");

        //printF()
        printF(len, borderChar, fillChar);
        System.out.println("");
        printF(len, borderChar, borderChar);
        System.out.println("");

        //printG()
        printG(height, borderChar, fillChar);
        System.out.println("");
        printG(height, borderChar, borderChar);
        System.out.println("");
    }
}
