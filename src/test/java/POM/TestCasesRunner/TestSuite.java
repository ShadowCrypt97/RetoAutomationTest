package POM.TestCasesRunner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({homePageRegisterRunner.class,  registerFormCompleteRunner.class})
public class TestSuite {
}
