package com.question3;

public abstract class Evaluation {
	
	private int numberOfQuestions;
	
	
	abstract void evaluationTiming();
	
	
	
	void printNoOfQuestions() {
	System.out.println("No. of Questions in Evaluation is :" +getNumberOfQuestions());
	}



	public int getNumberOfQuestions() {
		return numberOfQuestions;
	}



	public void setNumberOfQuestions(int numberOfQuestions) {
		this.numberOfQuestions = numberOfQuestions;
	}

}
