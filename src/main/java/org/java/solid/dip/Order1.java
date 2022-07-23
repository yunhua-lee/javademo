package org.java.solid.dip;

/**
 * @Desctiption
 * @Author wallace
 * @Date 2022/7/23
 */
public class Order1 {
	public boolean pay(){
		//依赖具体的实现JsonConfig
		JsonConfig config = new JsonConfig();
		String bonus = config.get("plus_user_bonus");

		//省略具体实现
		return true;
	}

}
