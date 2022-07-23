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
	public void testJsonConfig(){
		JsonConfig config = new JsonConfig();
		config.set(key, value, comment);

		Assert.assertEquals(value, config.get(key));
		Assert.assertNull(config.getComment(key));

		//换成Json5Config
		config = new Json5Config();
		config.set(key, value, comment);

		Assert.assertEquals(value, config.get(key));

		//这里会测试会失败，因为Json5Config违背了LSP原则
		//请思考：如何避免违背LSP，又能够重用代码？
		Assert.assertEquals(comment, null);
	}


}
