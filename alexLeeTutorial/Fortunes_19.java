package alexLeeTutorial;

import java.util.Random;

public class Fortunes_19 {

//      Data Structures in array
	static String[] fortunes = { "The early bird gets the worm, but the second mouse gets the cheese.",
			"Some days you are pigeon, some days you are statue.", "Today, bring umbrella.",
			"The fortune you seek is in another cookie.",
			"Be on the alert to recognize your prime at whatever time of your life it may occur.",
			"The love of your life is right in front of your eyes.", "Behind this fortune is the love of my life.",
			"You have a secret admirer.", "Love, because it is the only true adventure.",
			"The love of your life will appear in front of you unexpectedly!", "An old love will come back to you.",
			"It doesn’t get easier.", "You don’t know your limits until you’ve grown beyond them.",
			"We can’t change the wind, but we can set the sails differently.",
			"Everything that happens is an invitation to grow.",
			"Start with what is necessary, then do what is possible – and suddenly you will do the impossible.",
			"Be stronger than your strongest excuse!", "Even skyscrapers started out as basements.",
			"Love all, trust a few, do wrong to none.", "You are not what you’ve done. You are what we keep doing." };

	public static void main(String[] args) {
		Random rand = new Random();
		int r = rand.nextInt(fortunes.length);
		System.out.println(fortunes[r]);

	}

}
