package day2;

public class NestedForLoops {
    public static void main(String[] args) {
        // createBox();
        int height = 5;
        int width = 6;
        // createCustomBox(height, width);

        // createTriangle();

        // createTriangle(height);
        // createBackwardsTriangle(height);
        createEmptyBox(width, height);
    }

    // ***********
    // * *
    // * *
    // ***********
    private static void createEmptyBox(int width, int height) {
        // top
        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int j = 0; j < height; j++) {
            System.out.print("*");
            for (int i = 0; i < width - 2; i++) {
                System.out.print(" ");

            }
            System.out.println("*");
        }

        // bottom
        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private static void createBackwardsTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void createTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void createTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void createCustomBox(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // *******
    // *******
    // *******
    private static void createBox() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
