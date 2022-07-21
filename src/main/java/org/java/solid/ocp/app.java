package org.java.solid.ocp;

/**
 * @Desctiption
 * @Author wallace
 * @Date 2022/7/21
 */
public class app {
	public static void main(String[] args){
		//如果增加了JsonConfig，这里还是要改代码啊，是否还符合OCP呢？
		IConfig config = new XmlConfig();

		MyTheadPool pool = new MyTheadPool(config);
		pool.createPool();
	}
}
