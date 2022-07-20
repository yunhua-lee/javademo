package org.java.demo;

/**
 * @Desctiption
 * @Author wallace
 * @Date 2021/12/9
 */
public class Player {
	String name;
	public Player(String name){
		this.name = name;
	}

	void play(ICar car){
		//ICar可以是Ford，可以是Tesla，但是play方法不需要修改代码
		//如果要增加一个BMW的车型，play方法还是不需要修改代码
		//但是如果ICar增加了新的方法，play要用，那么就必须修改代码
		System.out.println(car.drive());
	}
}
