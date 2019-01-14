package mvcDemo.bean;

public class Team 
{
	private int teamId;
	private int matchId;
	private String teamColor;
	private boolean isWinner;
	private boolean hasFirstBlood;
	private boolean hasFirstTower;
	private boolean hasFirstInhibitor;
	private boolean hasFirstBaron;
	private boolean hasFirstDragon;
	private int towerKills;
	private int inhibitorKills;
	private int baronKills;
	private int dragonKills;
	
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public int getMatchId() {
		return matchId;
	}
	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}
	public String getTeamColor() {
		return teamColor;
	}
	public void setTeamColor(String teamColor) {
		this.teamColor = teamColor;
	}
	public boolean isWinner() {
		return isWinner;
	}
	public void setWinner(boolean isWinner) {
		this.isWinner = isWinner;
	}
	public void setIsWinner(boolean isWinner) {
		this.isWinner = isWinner;
	}
	public boolean isHasFirstBlood() {
		return hasFirstBlood;
	}
	public void setHasFirstBlood(boolean hasFirstBlood) {
		this.hasFirstBlood = hasFirstBlood;
	}
	public boolean isHasFirstTower() {
		return hasFirstTower;
	}
	public void setHasFirstTower(boolean hasFirstTower) {
		this.hasFirstTower = hasFirstTower;
	}
	public boolean isHasFirstInhibitor() {
		return hasFirstInhibitor;
	}
	public void setHasFirstInhibitor(boolean hasFirstInhibitor) {
		this.hasFirstInhibitor = hasFirstInhibitor;
	}
	public boolean isHasFirstBaron() {
		return hasFirstBaron;
	}
	public void setHasFirstBaron(boolean hasFirstBaron) {
		this.hasFirstBaron = hasFirstBaron;
	}
	public boolean isHasFirstDragon() {
		return hasFirstDragon;
	}
	public void setHasFirstDragon(boolean hasFirstDragon) {
		this.hasFirstDragon = hasFirstDragon;
	}
	public int getTowerKills() {
		return towerKills;
	}
	public void setTowerKills(int towerKills) {
		this.towerKills = towerKills;
	}
	public int getInhibitorKills() {
		return inhibitorKills;
	}
	public void setInhibitorKills(int inhibitorKills) {
		this.inhibitorKills = inhibitorKills;
	}
	public int getBaronKills() {
		return baronKills;
	}
	public void setBaronKills(int baronKills) {
		this.baronKills = baronKills;
	}
	public int getDragonKills() {
		return dragonKills;
	}
	public void setDragonKills(int dragonKills) {
		this.dragonKills = dragonKills;
	}
}
