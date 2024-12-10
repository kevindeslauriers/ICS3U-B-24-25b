package teststuff;

public class TestEquals {
    public static void main(String[] args) {
        int x = 7;
        int y = 7;

        Integer xx = new Integer(7);
        Integer yy = new Integer(7);
        Integer zz = xx;

        System.out.println(xx == yy);
        System.out.println(xx == zz);

    }
}
