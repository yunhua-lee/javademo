package org.java.solid.cohesioncoupling.hchc;

/**
 * @Desctiption
 * @Author wallace
 * @Date 2022/7/20
 */
public class HeadTeacher {
	public void panish(Integer id, Integer delta){
		Student student = QueryStudentOperator.query(id);
		if( student == null ){
			return;
		}

		//扣分逻辑
		student.updateCreditScore(delta);
		Integer score = student.getScore();

		if( score < 50 ){
			DeleteStudentOperator.delete(student); //开除逻辑
		}

		return;
	}
}
