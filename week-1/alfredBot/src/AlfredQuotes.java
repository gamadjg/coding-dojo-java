import java.util.Date;
public class AlfredQuotes {

	public String basicGreeting() {
		// You do not need to code here, this is an example method
		return "Hello, lovely to see you. How are you?";
	}

	public String guestGreeting(String name) {
		return "Hello, "+name;
	}

	public String dateAnnouncement() {
		java.util.Date date = new Date();
		return date.toString();
	}

	public String respondBeforeAlexis(String conversation) {
		if(conversation.contains("Alexis!")){
			return "Na bruh.";
		} else if (conversation.contains("Alfred")) {
			return "I believe Alexis may have something to do with this...";
		}
		return "A fine observation sir.";
	}

	// NINJA BONUS
	// See the specs to overload the guessGreeting method
	// SENSEI BONUS
	// Write your own AlfredQuote method using any of the String methods you have learned!
}

