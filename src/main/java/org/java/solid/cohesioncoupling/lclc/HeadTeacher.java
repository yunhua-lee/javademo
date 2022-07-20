package org.java.solid.cohesioncoupling.lclc;

import java.util.List;

/**
 * @Desctiption
 * @Author wallace
 * @Date 2022/7/20
 */
public class HeadTeacher {
	public void panish(Integer id, Integer delta){
		Student student = query(id);
		if( student == null ){
			return;
		}

		//扣分逻辑
		student.updateCreditScore(delta);
		Integer score = student.getScore();

		if( score < 50 ){
			delete(student); //开除逻辑
		}

		return;
	}

	/**
	 * 为何这里的代码内聚性低？
	 *
	 * @param student
	 * @return
	 */
	public static boolean add(Student student){
		//省略具体实现
		return false;
	}

	public static boolean delete(Student student){
		//省略具体实现
		return false;
	}

	public static boolean update(Student student){
		//省略具体实现
		return false;
	}

	public static Student query(Integer id){
		//省略具体实现
		return null;
	}

	public static List<Student> query(String name){
		//省略具体实现
		return null;
	}
}
