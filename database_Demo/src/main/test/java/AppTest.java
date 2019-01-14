import mvcDemo.dao.ChampionDao;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {
        "file:src/main/webapp/WEB-INF/spring.xml",
        "file:src/main/webapp/WEB-INF/spring-mybatis.xml",
})
public class AppTest {
    private MockMvc mockMvc;

    @Autowired
    protected WebApplicationContext wac;

    @Autowired
    protected ChampionDao championDao;

    @Before
    public void setup() {
        this.mockMvc = webAppContextSetup(this.wac).build();
    }


    @Test
    public void volunteerTest() throws Exception {
        List<Map> result=championDao.countAllChampionGroup(null);
        for(Iterator<Map> it = result.iterator(); it.hasNext();){
            Map<Object,Object> temp=it.next();
            System.out.println(temp.get("nickname").toString()+temp.get("name").toString()+temp.get("count").toString());

        }
    }
}
