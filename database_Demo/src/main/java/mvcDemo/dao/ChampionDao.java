package mvcDemo.dao;

import mvcDemo.mapper.ChampionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Repository
public class ChampionDao {
    @Autowired
    private ChampionMapper championMapper;

    public  List<Map> countAllChampionGroup(String version) {
        return championMapper.countAllChampionGroup(version);
    }

    public  List<Map> countAllChampionGroupByView(String version) {
        return championMapper.countAllChampionGroupByView(version);
    }

    public  List<Map> heroDetail(String heroName) {
        return championMapper.heroDetail(heroName);
    }

    public Integer countMatches(String version){
        return championMapper.countMatches(version);
    }
}
