package powerpackage;

import org.junit.jupiter.api.Test;

public class PowerTest {
    @Test
    public void One_raised_to_one_is_one() {
        assert PowerFinder.of(1,1) == 1;
    }

    @Test
    public void Two_raised_to_one_is_two() {
        assert PowerFinder.of(2,1) == 2;
    }

    @Test
    public void Two_raised_to_two_is_four() {
        assert PowerFinder.of(2, 2) == 4;
    }

    @Test
    public void Three_raised_to_two_is_nine() {
        assert PowerFinder.of(3, 2) == 9;
    }
}
