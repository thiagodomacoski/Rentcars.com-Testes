package com.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	ClienteTest.class, FiltrosTest.class
})
public class JunitTestSuite {
	public JunitTestSuite() {}
}