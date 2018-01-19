package lab;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import categories.Failed;
import categories.Passed;
import categories.Warning;

/**
 * Dumb test class
 * 
 * @author henbreda
 * @version 1.0
 * @since 2017-01-19
 */
public class DumbTest {

	static Logger log = Logger.getLogger(DumbTest.class.getName());
	
	@Category(Passed.class)
	@Test
	public void test01() {
		log.info("=)");
	}

	@Category({ Passed.class, Warning.class })
	@Test
	public void test02() {
		log.warn("=|");
	}

	@Category(Warning.class)
	@Test
	public void test03() {
		log.warn("=|");
	}

	@Category(Failed.class)
	@Test
	public void test04() {
		Assert.fail("=(");
	}
}