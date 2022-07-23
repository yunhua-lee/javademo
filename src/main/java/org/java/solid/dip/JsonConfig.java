package org.java.solid.dip;

/**
 * @Desctiption
 * @Author wallace
 * @Date 2022/7/23
 */
public class JsonConfig implements IConfig{
	public void set(String key, String value, String comment) {
		//省略具体实现
	}

	public String get(String key){
		//省略具体实现
		return "";
	}

	public String getComment(String key) {
		return null;
	}
}
