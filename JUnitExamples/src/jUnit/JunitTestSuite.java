package jUnit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/*A test suite bundles a few unit test cases and runs them together. 
 * In JUnit, both @RunWith and @Suite annotation are used to run the suite test. 
 * Given below is an example that uses TestJunit1 & TestJunit2 test classes.
 */

//JUnit Suite Test
@RunWith(Suite.class)

@Suite.SuiteClasses({
	TestJunit1.class ,TestJunit2.class
})

public class JunitTestSuite {
}
