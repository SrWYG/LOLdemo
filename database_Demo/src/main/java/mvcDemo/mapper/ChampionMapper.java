package mvcDemo.mapper;

import mvcDemo.bean.Champion;
import org.apache.ibatis.annotations.Param;

import java.util.Map;
import java.util.List;

public interface ChampionMapper 
{
	void insertChampion(Champion champion);
	
	void deleteChampion(Champion champion);
	
	void updateChampion(Champion champion);
	
	void selectChampion(Champion champion);
	
	void selectChampionNumber();

	List<Map> countAllChampionGroup(@Param("version") String version);

	List<Map> countAllChampionGroupByView(@Param("version") String version);

	List<Map> heroDetail(@Param("heroName") String heroName);

	Integer countMatches(String version);
}
