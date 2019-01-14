package mvcDemo.mapper;

import mvcDemo.bean.Matches;

public interface MatchesMapper
{
	void insertMatches(Matches matches);
	
	void updateMatches(Matches matches);
	
	void deleteMatches(Matches matches);
	
	Matches selectMatches(Matches matches);
	
	int selectMatchesNumber();
}
