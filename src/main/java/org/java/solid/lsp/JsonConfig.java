package org.java.solid.lsp;

import java.util.HashMap;
import java.util.Map;

/**
 * @Desctiption
 * @Author wallace
 * @Date 2022/7/21
 */
public class JsonConfig implements IConfig {
	Map<String, String> configs = new HashMap();

	public void set(String key, String value, String comment) {
		configs.put(key, value);
	}

	public String get(String key) {
		return configs.get(key);
	}

	public String getComment(String key) {
		//Json不支持注释，此方法直接返回null
		return null;
	}
}
