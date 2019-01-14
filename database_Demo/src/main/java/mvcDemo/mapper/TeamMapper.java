package mvcDemo.mapper;

import mvcDemo.bean.Team;

public interface TeamMapper 
{
	void insertTeam(Team team);
	
	void updateTeam(Team team);
	
	void deleteTeam(Team team);
	
	Team selectTeam(Team team);
	
	int selectTeamIdByMatchesIdAndColor(Team team);
}
