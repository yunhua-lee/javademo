package org.java.solid.lsp;

/**
 * @Desctiption
 * @Author wallace
 * @Date 2022/7/21
 */
public class ZookeeperConfig implements IConfig {
	public void set(String key, String value, String comment) {
		//省略具体实现
	}

	public String getValue(String key) {
		//省略具体实现
		return null;
	}

	public String getComment(String key) {
		//省略具体实现
		return "";
	}
}
