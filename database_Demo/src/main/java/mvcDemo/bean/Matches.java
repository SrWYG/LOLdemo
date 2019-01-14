package mvcDemo.bean;

public class Matches 
{
	private int matchId;
	private String platform;
	private String duration;
	private String creationTime;
	private String version;
	public int getMatchId() {
		return matchId;
	}
	public void setMatchId(int matchid) {
		this.matchId = matchid;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
}
