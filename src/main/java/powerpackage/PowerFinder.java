package powerpackage;

public class PowerFinder {
    public static int of(int base, int index) {
        int result = 1;
        for (int i = 0; i< index; i++) {
            result *= base;
        }
        return result;
    }
}
