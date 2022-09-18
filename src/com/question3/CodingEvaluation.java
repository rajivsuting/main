package com.question3;

public class CodingEvaluation extends Evaluation {

	@Override
	void evaluationTiming() {
		// TODO Auto-generated method stub
		System.out.println("Coding evaluation timing is 2:00 to 3:30");
	}
	
	CodingEvaluation(int n) {
		this.setNumberOfQuestions(n);
	}

}
