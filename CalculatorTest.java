import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
	private Calculator calc;
	
    @Before
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void addition() {
        assertThat(calc.addition(4,5), is(9));
    }
}