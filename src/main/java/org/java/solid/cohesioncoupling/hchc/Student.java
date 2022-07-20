package org.java.solid.cohesioncoupling.hchc;

/**
 * @Desctiption
 * @Author wallace
 * @Date 2022/7/20
 */
public class Student {
	private String name;
	private Integer id;
	private Integer sex;

	private String grade;             //成绩等级：优良中差
	private Integer creditScore = 80; //信用分，用来记过，低于60分警告，低于50分开除

	public void updateCreditScore(Integer score){
		if(score > 100 || score < -100){
			throw new RuntimeException("invalid score: " + score);
		}
		this.creditScore += score;
	}

	public Integer getScore(){
		return creditScore;
	}
}
