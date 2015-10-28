package anajavatica.junit.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ConnectionGeneratorTest.class, RandomNumberGeneratorTest.class })
public class GeneratorTestSuite {

}
