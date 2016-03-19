# simplecalc
Very simple calculator to teach pair programming techniques

#ToDos

0. Clone this repo: ``git clone https://https://github.com/saleem/simplecalc.git``

0. If you want to do the rest of these steps on your own, revert to an older revision of this repo: ``git revert 01ceba6b3ce9871e356dbd42cfbe3b67e42feb6b``  
        
1. Read the Calculator class.
2. Compile and run the program:  
``javac *.java``  
``java Calculator``

3. Add Unit testing capability:  
  * Download [JUnit jar](http://search.maven.org/remotecontent?filepath=junit/junit/4.12/junit-4.12.jar).  

  * Download [Hamcrest jar](http://search.maven.org/remotecontent?filepath=org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar).
  
  * Remember to **put these two jars in your classpath** for both the ``javac`` and ``java`` commands.  

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
  
5. Compile and run the test.
6. Practice the following enhancements:   
   * Write additional unit tests.  
   * Remove hard-coded "magic constants" from Calculator.  
   * Change the main method to take input from console.

# Useful stuff
1. Compiling from shell:  

        find -name "*.java" > sources.txt
        javac -cp classpath @sources.txt

2. Running JUnit tests from shell:  

        java -cp .:/full/path/to/junit.jar org.junit.runner.JUnitCore YourTest
        
        
# Credit
The Calculator class is taken with gratitude from user "[gmhk](http://stackoverflow.com/users/238052/gmhk)". The original post is on [Stackoverflow](http://stackoverflow.com/questions/2734227/simple-java-calculator).
