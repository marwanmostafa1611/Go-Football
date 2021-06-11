import java.util.ArrayList;

public class Team {
	private String teamName, stripColor, matchDay;
	private int numOfPlayers;
	private ArrayList <Player> playersArray;
	
	public Team(String teamName, String stripColor, String matchDay, int numOfPlayers) {
		super();
		this.teamName = teamName;
		this.stripColor = stripColor;
		this.matchDay = matchDay;
		this.numOfPlayers = numOfPlayers;
	}
	
	public void addPlayer(Player p) {
		playersArray.add(p);
	}
	
	public void displayPlayers() {
		for (int i = 0 ; i < playersArray.size() ; i++) {
			System.out.println(playersArray.get(i));
		}
	}
	
	public void viewNextMatch() {
		System.out.println("Your next match is on " + matchDay);
	}
}
