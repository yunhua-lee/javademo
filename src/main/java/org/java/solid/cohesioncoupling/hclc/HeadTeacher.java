package org.java.solid.cohesioncoupling.hclc;

/**
 * @Desctiption
 * @Author wallace
 * @Date 2022/7/20
 */
public class HeadTeacher {
	public void panish(Integer id, Integer delta){
		Student student = StudentOperator.query(id);
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
}
