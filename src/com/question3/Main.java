package com.question3;

public class Main {
	
	static void messageToStudent(Evaluation evaluation) {
		
		if(evaluation instanceof DsaEvaluation) {
			
			System.out.println("It's a Dsa evaluation");
//			DsaEvaluation d =new DsaEvaluation();
			evaluation.printNoOfQuestions();
			evaluation.evaluationTiming();
			
		}else if(evaluation instanceof CodingEvaluation) {
			
			System.out.println("It's a Coding evaluation");
//			CodingEvaluation c = new CodingEvaluation();
			evaluation.printNoOfQuestions();
			evaluation.evaluationTiming();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		messageToStudent(new DsaEvaluation(5));
		messageToStudent(new CodingEvaluation(10));
		
		

	}

}
