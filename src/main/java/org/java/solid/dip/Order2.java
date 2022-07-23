package org.java.solid.dip;

/**
 * @Desctiption
 * @Author wallace
 * @Date 2022/7/23
 */
public class Order2 {
	//依赖接口
	private IConfig config;

	//这里用初始化的方式，实际工作中直接用框架来依赖注入最方便
	public Order2(IConfig config){
		this.config = config;
	}
	public boolean pay(){
		String bonus = config.get("plus_user_bonus");

		//省略具体实现
		return true;
	}

}
