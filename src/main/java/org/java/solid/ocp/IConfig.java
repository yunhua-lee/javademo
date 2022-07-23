package org.java.solid.ocp;

/**
 * @Desctiption
 * @Author wallace
 * @Date 2022/7/21
 */
public interface IConfig {
	void set(String key, String value, String comment);
	String get(String key);
	String getComment(String key);
}
