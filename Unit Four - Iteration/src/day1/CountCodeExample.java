package day1;

public class CountCodeExample {
    public static void main(String[] args) {
        int numCats = countCat("catdccatca");
        System.out.println(numCats);

        numCats = countCat("catdccatcat");
        System.out.println(numCats);

        numCats = countCat("");
        System.out.println(numCats);
    }

    private static int countCat(String str) {
        int numCats = 0;

        for (int i = 0; i <= str.length() - 3; i++) {
            String s = str.substring(i, i+3);

            if ("cat".equals(s))
                numCats++;
        }

        return numCats;

    }

}