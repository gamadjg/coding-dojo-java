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
		Date date = new Date();

		return "It is currently "+date;
	}

	public String respondBeforeAlexis(String conversation) {
		if(conversation.contains("Alexis")){
			return "I'll handle that right away sir. No idea where... the other one is at.";
		} else if (conversation.contains("Alfred")) {
			return "At your service.";
		}
		return "A fine observation sir.";
	}

	// NINJA BONUS
	// See the specs to overload the guessGreeting method
	// SENSEI BONUS
	// Write your own AlfredQuote method using any of the String methods you have learned!
}

