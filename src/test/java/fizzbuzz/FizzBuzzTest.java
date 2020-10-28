package fizzbuzz;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FizzBuzzTest {
    
    private final String FIZZ_BUZZ_STEP_ONE_EXPECTED = "1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz ";

    @Test
    public void testFizzBuzzStep1() {
        assertEquals(FIZZ_BUZZ_STEP_ONE_EXPECTED, FizzBuzz.fizzBuzzStepOne());
    }
}