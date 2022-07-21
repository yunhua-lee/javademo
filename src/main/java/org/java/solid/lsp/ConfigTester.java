package org.java.solid.lsp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Desctiption
 * @Author wallace
 * @Date 2022/7/21
 */
public class ConfigTester {
	String key = "pool_thread_name";
	String value = "tester_no.1";
	String comment = "config your pool name";

	@Test
	public void test(){
		IConfig config = new XmlConfig();
		config.set(key, value, comment);

		Assert.assertEquals(value, config.getValue(key));
		Assert.assertEquals(comment, config.getComment(key));

		config = new JsonConfig();
		config.set(key, value, comment);

		//这里测试会失败，因为JsonConfig违背了LSP原则
		Assert.assertEquals(value, config.getValue(key));
		Assert.assertEquals(comment, config.getComment(key));
	}


}
