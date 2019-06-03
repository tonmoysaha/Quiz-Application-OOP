package com.quizapplication.opi;

import java.util.Scanner;

public class Quiz {
	public void begin() {

		int countCorrect = 0;
		int countWrong = 0;
		int countTotall = 0;

		Question question1 = new Question("What is the use of final keyword in Java?",
				"a class is made final, a sublcass of it can not be created.",
				"When a method is final, it can not be overridden.",
				"When a variable is final, it can be assigned value only once.", "All of the above",
				new Answer("All of the above"));
		Question question2 = new Question("To prevent any method from overriding, we declare the method as,", "final",
				"static", "const", "abstract", new Answer("final"));
		Question question3 = new Question("The fields in an interface are implicitly specified as,", "static only",
				"protected", "private", "both static and final ", new Answer("both static and final "));

		Question questions[] = { question1, question2, question3 };

		for (Question question : questions) {
			System.out.println("A." + question.getOption1());
			System.out.println("B." + question.getOption2());
			System.out.println("C." + question.getOption3());
			System.out.println("D." + question.getOption4());
			System.out.println("please enter an option: ");

			Scanner scanner = new Scanner(System.in);
			char option = scanner.next().charAt(0);
			String answer = "";

			switch (option) {
			case 'A':
				answer = question.getOption1();
				break;
			case 'B':
				answer = question.getOption2();
				break;
			case 'C':
				answer = question.getOption3();
				break;
			case 'D':
				answer = question.getOption4();
				break;

			default:
				break;
			}

			if (answer.equals(question.getAnswer())) {
				System.out.println("---------------------------------");
				System.out.println("Correct answer");
				System.out.println("---------------------------------");
				countCorrect++;
			} else {
				System.out.println("---------------------------------");
				System.out.println("Wrong answer");
				System.out.println("---------------------------------");
				countWrong++;
			}
			System.out.println("==================opi===================");
			countTotall++;
		}

	}

}
