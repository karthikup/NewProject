package inheritance;

public class Bowler extends Player
{
	private int wickets;
	private double economy;
	private int totalwickets;
	
	public Bowler(String playerName,  int serialNo, int age, int wickets, double economy, int totalWickets)
	{
		super(playerName, serialNo, age);
		this.wickets=wickets;
		this.economy=economy;
		this.totalwickets=totalWickets;
	}
	
	public int getWickets() {
		return wickets;
	}




	public void setWickets(int wickets) {
		this.wickets = wickets;
	}




	public double getEconomy() {
		return economy;
	}




	public void setEconomy(float economy) {
		this.economy = economy;
	}




	public int getTotal5wickets() {
		return totalwickets;
	}




	public void setTotal5wickets(int total5wickets) {
		this.totalwickets = total5wickets;
	}




	public void showPlayerDetails() {
		System.out.println("Player Name - "+playerName);
		System.out.println("Serial No. - "+serialNo);
		System.out.println("Age - "+age);
		System.out.println("Total Wickets - "+wickets);
		System.out.println("Economy - "+economy);
		System.out.println("No. of 5-wickets - "+totalwickets);
	}
}
