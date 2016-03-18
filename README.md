# simplecalc
Very simple calculator to teach pair programming techniques

#ToDos

1. Read the Calculator class.
2. Compile and run the program:  
``javac *.java``  
``java Calculator``

3. Add Unit testing capability:  
  3.1 Download [junit.jar](http://search.maven.org/remotecontent?filepath=junit/junit/4.12/junit-4.12.jar)  
  
  3.2 Modify your classpath to put it in your path:
  ``export $PATH=$PATH:/fully/qualified/path/to/junit.jar``  

3. Write the first unit test test:  

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
  
5. Run the test.
6. Practice the following enhancements:   
   6.1 Write additional unit tests.  
   6.2 Remove hard-coded "magic constants" from Calculator.  
   6.3 Change the main method to take input from console.

# Useful stuff
1. Compiling from shell:  

        find -name "*.java" > sources.txt
        javac -cp classpath @sources.txt

2. Running JUnit tests from shell:  

        java -cp .:/full/path/to/junit.jar org.junit.runner.JUnitCore YourTest
        
        


# Credit
The Calculator class is taken with gratitude from user "[gmhk](http://stackoverflow.com/users/238052/gmhk)". The original post is on [Stackoverflow](http://stackoverflow.com/questions/2734227/simple-java-calculator).
