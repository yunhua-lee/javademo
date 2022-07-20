package org.java.solid.cohesioncoupling.lchc;

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
			StudentOperator.delete(student); //开除逻辑
		}

		return;
	}

	//HeadTeacher实现了query方法，而StudentOperator实现了add、remove等方法
	public static Student query(Integer id){
		//省略具体实现
		return null;
	}

	public static List<Student> query(String name){
		//省略具体实现
		return null;
	}
}
