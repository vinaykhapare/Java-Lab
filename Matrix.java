import java.util.Scanner;

class GetMatrix {
    int A[][] = new int[2][2];
    int B[][] = new int[2][2];

    // Method to get matrix elements from the user
    void GetEle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of matrix A: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of matrix B: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                B[i][j] = sc.nextInt();
            }
        }
    }

    // Method to print the matrices
    void printMatrix() {
        System.out.println("Matrix A: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matrix B: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to add matrices A and B
    void add() {
        int C[][] = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("Addition Matrix:");
        printResult(C);
    }

    // Method to subtract matrix B from matrix A
    void sub() {
        int C[][] = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                C[i][j] = A[i][j] - B[i][j];
            }
        }
        System.out.println("Subtraction Matrix:");
        printResult(C);
    }

    // Method to multiply matrices A and B
    void multi() {
        int C[][] = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        System.out.println("Multiplication Matrix:");
        printResult(C);
    }

    // Helper method to print any result matrix
    void printResult(int C[][]) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Matrix {
    public static void main(String args[]) {
        GetMatrix M = new GetMatrix();
        M.GetEle();
        M.printMatrix();
        M.add();
        M.sub();
        M.multi();
    }
}
