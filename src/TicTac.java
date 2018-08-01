import java.util.Arrays;

public class TicTac {
    static int[] X = new int[3];
    static int[] Y = new int[3];
    static int[] Z = new int[3];
    static int n = 0;

    static boolean isWinner(String[][] C, String mark) {
        System.out.println(mark + mark + mark);
        boolean result = false;
        if ((C[0][0] + C[0][1] + C[0][2] == mark + mark + mark) ||
                (C[1][0] + C[1][1] + C[1][2] == mark + mark + mark) ||
                (C[2][0] + C[2][1] + C[2][2] == mark + mark + mark) ||
                (C[0][0] + C[1][0] + C[2][0] == mark + mark + mark) ||
                (C[0][1] + C[1][1] + C[2][1] == mark + mark + mark) ||
                (C[0][2] + C[1][2] + C[2][2] == mark + mark + mark) ||
                (C[0][0] + C[1][1] + C[2][2] == mark + mark + mark) ||
                (C[0][2] + C[1][1] + C[2][0] == mark + mark + mark)
                )
            result = true;

        return result;
    }

    public static void main(String args[]) {
        String[][] C = {{"X", "O", ""},
                {"X", "O", "0"},
                {"X", "", ""}
        };
      System.out.println((C[0][0] + C[1][0] + C[2][0]));


        boolean isisWinner = isWinner(C, "X");
        if (isisWinner) {
            System.out.println("we have a winner");
        }
        else System.out.println("No winner");

    }
}
