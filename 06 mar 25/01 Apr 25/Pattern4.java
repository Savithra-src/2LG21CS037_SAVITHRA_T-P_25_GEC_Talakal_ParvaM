
//****** 
import java.util.*;

public class Pattern4 {

    public static void main(String arg[]) {
        int c = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows:");
            c = sc.nextInt();
        }
        System.out.println(" left aligned pyramid:");
        for (int i = 1; i <= c; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println("center aligned pyramid");
        for (int i = 1; i <= c; i++) {
            for (int j = 1; j <= c - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *  ");
            }
            System.out.println();
        }
        System.out.println("right aligned pyramid");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < c - i - 1; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println(" left aligned pyramid:");
        for (int i = 1; i <= c; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("10" + " ");
            }
            System.out.println();
        }
        System.out.println("center aligned pyramid");
        for (int i = 1; i <= c; i++) {
            for (int j = 1; j <= c - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" 10  ");
            }
            System.out.println();
        }
        System.out.println("right aligned pyramid");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < c - i - 1; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("10" + " ");
            }
            System.out.println();
        }
        System.out.println("left aligned pyramid");
        for (int i = 1; i <= c; i++) {
            // Loop to iterate over each column of the ith row
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Right aligned pyramid:");
        for (int i = 1; i <= c; i++) {
            for (int j = 1; j <= c - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("Center aligned pyramid:");
        for (int i = 1; i <= c; i++) {
            for (int j = 1; j <= c - i; j++) {
                System.out.print("" + " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("left aligned pyramid");
        for (int i = 1; i <= c; i++) {
            for (int j = 1; j <= c - i; j++) {
                System.out.print("");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("center aligned pyramid");
        for (int i = 1; i <= c; i++) {
            for (int j = 1; j <= c - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i + "   ");
            }
            System.out.println();
        }
        System.out.println("right aligned pyramid");
        for (int i = 0; i < c; i++) {
            for (int j = 1; j < c; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

}