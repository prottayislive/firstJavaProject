import java.awt.Color;

public class ThatsYourStory {
	public static void main(String[] args) {
		GTerm gt = new GTerm(600, 400);
		// color variables
		Color pathwayColor = Color.YELLOW;
		Color wrongAnswer = Color.red;
		Color correct = Color.GREEN;
		// String variables
		String lineBreak = "-------------------------------------";
		String chosenPath;
		String enteredArea = "You've entered the ";
		String thankYouMessage = "Thankyou for helping me, ";
		// welcome message
		gt.setBackgroundColor(Color.GREEN);
		gt.showMessageDialog("Welcome to The Adventures of Toby");
		gt.setXY(200, 100);
		gt.addImageIcon("sayingHello.gif");
		gt.setXY(0, 0);
		gt.setFontSize(20);
		gt.println("Hello Partner!");
		gt.println("I am TOBY");
		String playerName = gt.getInputString("What's your name?");
		gt.setFontColor(Color.MAGENTA);
		gt.println("Welcome to the playground, " + playerName + "!");
		String input = gt.getInputString("Will you help me get to Lisa?" + "\n" + "Yes  OR  No");
		gt.setBackgroundColor(Color.WHITE);
		// Game starts
		if (input.equalsIgnoreCase("NO")) {
			gt.showMessageDialog("Goodbye!");
			gt.close();
		}
		if (input.equalsIgnoreCase("YES")) {
			gt.clear();
			gt.showMessageDialog("Let's get Started");
			// Choose Type of Game
			gt.setXY(200, 100);
			gt.addImageIcon("runningToby.png");
			gt.setXY(0, 0);
			gt.addImageIcon("pathsFirst.png");
			int pathNumber = Integer.parseInt(gt.getInputString("Which path do you want to take?"));
			gt.clear();
			gt.setFontSize(12);
			gt.setBackgroundColor(Color.BLACK);
			gt.setFontColor(pathwayColor);
			// path1
			if (pathNumber == 1) {
				chosenPath = "Seeker's Jungle!";
				gt.println(enteredArea + chosenPath + "\n" + lineBreak);
				gt.println("To cross the jungle you have to" + "\n" + "answer the elder tree's question." + "\n"
						+ lineBreak);
				gt.addImageIcon("howMany.jpg");
				int rightAnswer = Integer
						.parseInt(gt.getInputString("What's your answer?" + "\n" + "Enter a numerical value"));
				if (rightAnswer == 5) {
					gt.setXY(0, 300);
					gt.setFontColor(correct);
					gt.println("The elder tree shows you the way out of the forest.");
					gt.println(lineBreak + "\n" + "Toby crosses the " + chosenPath + " and finds LISA!");
					gt.setXY(350, 50);
					gt.addImageIcon("finalImage.jpg");
					gt.showMessageDialog(thankYouMessage + playerName);
				} else {
					gt.setFontSize(25);
					gt.clear();
					gt.setFontColor(wrongAnswer);
					gt.println("Wrong! The elder tree has " + "\n" + "locked you in the jungle!");
				}
			}
			// path2
			else if (pathNumber == 2) {
				chosenPath = "Math Lake!";
				gt.println(enteredArea + chosenPath + "\n" + lineBreak);
				gt.println("To cross the bridge you have to answer" + "\n" + "all the troll's questions." + "\n"
						+ lineBreak);
				gt.println("Answer the question");
				// question1
				gt.println("458+62 = ?");
				int rightAnswer1 = Integer.parseInt(gt.getInputString("What's your answer?"));
				if (rightAnswer1 == 520) {
					gt.setFontColor(Color.GREEN);
					gt.println("=520" + "\n" + lineBreak);
					gt.setFontColor(pathwayColor);
					// question2
					gt.println("24.5-11.2 = ?");
					double rightAnswer2 = Double.parseDouble(gt.getInputString("What's your answer?"));
					if (rightAnswer2 == 13.3) {
						gt.setFontColor(correct);
						gt.println("= 13.3" + "\n" + lineBreak);
						gt.println("Good work smart fellow! You may cross the bridge.");
						gt.println(lineBreak + "\n" + "Toby crosses the " + chosenPath + " and finds LISA!");
						gt.setXY(350, 50);
						gt.addImageIcon("finalImage.jpg");
						gt.showMessageDialog(thankYouMessage + playerName);
					} else {
						gt.setFontSize(20);
						gt.setFontColor(wrongAnswer);
						gt.println("WRONG! The troll closes the bridge forever");
					}
				} else {
					gt.setFontSize(20);
					gt.setFontColor(wrongAnswer);
					gt.println("WRONG! The troll closes the bridge forever");
				}
			}
			// path3
			else if (pathNumber == 3) {
				chosenPath = "T&F Castle!";
				gt.println(enteredArea + chosenPath + "\n" + lineBreak);
				gt.println(
						"To cross the castle you have to" + "\n" + "answer the king of the castle." + "\n" + lineBreak);
				gt.println("Answer in True or False");
				// question1
				boolean CorrectAnswer1 = Boolean.parseBoolean(
						gt.getInputString("Melbourbe is the capital of Australia" + "\n" + "True or False?"));
				if (CorrectAnswer1 == false) {
					gt.setFontColor(correct);
					gt.println("Good work!!");
					gt.println(lineBreak);
					gt.setFontColor(pathwayColor);
					gt.println("Penguins are not mammals");
					boolean CorrectAnswer2 = Boolean.parseBoolean(gt.getInputString("\n" + "True or False?"));
					if (CorrectAnswer2 == true) {
						gt.setFontColor(correct);
						gt.println("Good work!!");
						gt.println(lineBreak);
						gt.println("The king shows you the exit door");
						gt.println(lineBreak + "\n" + "Toby crosses the " + chosenPath + " and finds LISA!");
						gt.setXY(350, 50);
						gt.addImageIcon("finalImage.jpg");
						gt.showMessageDialog(thankYouMessage + playerName);
					} else {
						gt.setFontSize(20);
						gt.setFontColor(wrongAnswer);
						gt.println("WRONG Answer! The king locked you in a prison.");
					}

				} else {
					gt.setFontSize(20);
					gt.setFontColor(wrongAnswer);
					gt.println("WRONG Answer! The king locks you in a prison.");
				}

			}
		}
	}
}
