package mvcDemo.bean;

public class BanList
{
	private int banId;
	private int teamId;
	private int championId;
	private int banOrder;
	
	public int getBanId() {
		return banId;
	}
	public void setBanId(int banId) {
		this.banId = banId;
	}
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public int getChampionId() {
		return championId;
	}
	public void setChampionId(int championId) {
		this.championId = championId;
	}
	public int getBanOrder() {
		return banOrder;
	}
	public void setBanOrder(int banOrder) {
		this.banOrder = banOrder;
	}
}
