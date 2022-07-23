package org.java.solid.lsp;

import java.util.HashMap;
import java.util.Map;

/**
 * @Desctiption
 * @Author wallace
 * @Date 2022/7/23
 */
public class Json5Config extends JsonConfig{
	Map<String, String> comments = new HashMap();

	public void set(String key, String value, String comment) {
		configs.put(key, value);
		comments.put(key, comment);
	}

	public String getComment(String key) {
		//Json5支持注释，此方法需要返回配置的comment
		return comments.get(key);
	}
}
