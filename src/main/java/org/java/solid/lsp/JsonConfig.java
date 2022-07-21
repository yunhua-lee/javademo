package org.java.solid.lsp;

/**
 * @Desctiption
 * @Author wallace
 * @Date 2022/7/21
 */
public class JsonConfig implements IConfig {
	public void set(String key, String value, String comment) {
		//json不支持主持，comment参数没有作用
	}

	public String getValue(String key) {
		//省略具体实现
		return null;
	}

	public String getComment(String key) {
		//Json不支持注释，此方法直接返回null
		return null;
	}
}
