package mvcDemo.controller;


import mvcDemo.dao.ChampionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.NumberFormat;
import java.util.*;

@Controller
public class heroDetailController {

    static int all_match_num=182528;

    /*首页-英雄列表*/
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String toindex() {
        return "index";
    }

    /*首页-英雄列表*/
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String home() {
        return "index";
    }

    @RequestMapping(value = "/heroDetail", method = RequestMethod.GET)
    public String heroDetail() {
        return "heroDetail";
    }

    @Autowired
    protected ChampionDao championDao;

    @ResponseBody
    @RequestMapping(value = "/allChampion", method = RequestMethod.POST)
    public  Map<String,Object> allChampion(String version) {
        Map<String,Object> result=new HashMap<>();
        List<Map<String,Object>> heroList=new ArrayList<>();
        long startTime=System.currentTimeMillis(); //获取开始时间
        int matches_num=championDao.countMatches(version);
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMinimumFractionDigits(4);
        List<Map> templist = championDao.countAllChampionGroup(version);
        for (Iterator<Map> it = templist.iterator(); it.hasNext(); ) {
            Map tempitem=new HashMap<String,Object>();
            Map<Object, Object> temp = it.next();
            tempitem.put("nickname",temp.get("nickname").toString());
            tempitem.put("name",temp.get("name").toString());
            float a_num=Float.parseFloat(temp.get("count").toString());
            float v_num=Float.parseFloat(temp.get("v_num").toString());
            tempitem.put("a_rate",nf.format(a_num/matches_num));
            tempitem.put("v_rate",nf.format(v_num/a_num));
            heroList.add(tempitem);
        }
        long endTime=System.currentTimeMillis(); //获取结束时间
        String timeSpan=(endTime-startTime)+"ms";
        result.put("heroList",heroList);
        result.put("timeSpan",timeSpan);
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/allChampionByView", method = RequestMethod.POST)
    public  Map<String,Object> allChampionByView(String version) {
        Map<String,Object> result=new HashMap<>();
        List<Map<String,Object>> heroList=new ArrayList<>();
        long startTime=System.currentTimeMillis(); //获取开始时间
        int matches_num=championDao.countMatches(version);
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMinimumFractionDigits(4);
        List<Map> templist = championDao.countAllChampionGroupByView(version);
        for (Iterator<Map> it = templist.iterator(); it.hasNext(); ) {
            Map tempitem=new HashMap<String,Object>();
            Map<Object, Object> temp = it.next();
            tempitem.put("nickname",temp.get("nickname").toString());
            tempitem.put("name",temp.get("name").toString());
            float a_num=Float.parseFloat(temp.get("count").toString());
            float v_num=Float.parseFloat(temp.get("v_num").toString());
            tempitem.put("a_rate",nf.format(a_num/matches_num));
            tempitem.put("v_rate",nf.format(v_num/a_num));
            heroList.add(tempitem);
        }
        long endTime=System.currentTimeMillis(); //获取结束时间
        String timeSpan=(endTime-startTime)+"ms";
        result.put("heroList",heroList);
        result.put("timeSpan",timeSpan);
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/heroDetailData", method = RequestMethod.POST)
    public  Map<String,Object> heroDetailData(String heroName) {
        Map<String,Object> result=new HashMap<>();
        List<Map<String,Object>> heroDetailList=new ArrayList<>();
        long startTime=System.currentTimeMillis(); //获取开始时间
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMinimumFractionDigits(4);
        List<Map> templist = championDao.heroDetail(heroName);
        for (Iterator<Map> it = templist.iterator(); it.hasNext(); ) {
            Map tempitem=new HashMap<String,Object>();
            Map<Object, Object> temp = it.next();
            //tempitem.put("nickname",temp.get("nickname").toString());
            //tempitem.put("name",temp.get("name").toString());
            tempitem.put("version",temp.get("version").toString());
            float a_num=Float.parseFloat(temp.get("a_num").toString());
            float v_num=Float.parseFloat(temp.get("v_num").toString());
            float k_sum=Float.parseFloat(temp.get("k_sum").toString());
            float d_sum=Float.parseFloat(temp.get("d_sum").toString());
            float a_sum=Float.parseFloat(temp.get("a_sum").toString());
            tempitem.put("v_rate",nf.format(v_num/a_num));
            tempitem.put("ave_k",nf.format(k_sum/a_num));
            tempitem.put("ave_d",nf.format(d_sum/a_num));
            tempitem.put("ave_a",nf.format(a_sum/a_num));
            heroDetailList.add(tempitem);
        }
        long endTime=System.currentTimeMillis(); //获取结束时间
        String timeSpan=(endTime-startTime)+"ms";
        result.put("heroDetailList",heroDetailList);
        result.put("timeSpan",timeSpan);
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/allHero", method = RequestMethod.GET)
    public  List<Map> allchampion() {
        return championDao.countAllChampionGroup(null);
    }

}