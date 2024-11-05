public class SChachbrett {
    public static void main(String[] args) {

        String[] Buchstaben = new String[8];
        Buchstaben[0] = "A";
        Buchstaben[1] = "B";
        Buchstaben[2] = "C";
        Buchstaben[3] = "D";
        Buchstaben[4] = "E";
        Buchstaben[5] = "F";
        Buchstaben[6] = "G";
        Buchstaben[7] = "H";

        for (int a = 8; a > 0; a--) {
            for (int b = 0; b <= 7; b++) {
                System.out.print(Buchstaben[b] + a +  " ");

            }
            System.out.println();
        }
    }
}
