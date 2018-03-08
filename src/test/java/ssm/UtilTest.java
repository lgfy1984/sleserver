package ssm;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.alibaba.fastjson.JSON;
import com.qmh.web.dao.SUserMapper;
import com.qmh.web.entity.SUser;
import com.qmh.web.entity.User;
import com.qmh.web.service.IUserService;

/**
 * 单元测试
 * @author developer
 *
 */


@RunWith(SpringJUnit4ClassRunner.class)

// 
@WebAppConfiguration(value = "src/main/webapp") //可以不填，默认此目录

@ContextConfiguration(locations = { "file:src/main/resources/applicationContext.xml", "file:src/main/resources/spring-mybatis.xml", "file:src/main/resources/springMVC-servlet.xml" })

public class UtilTest {
	
	@Autowired
	private SUserMapper userMapper;
	
	
	@Autowired
	private IUserService userService;
	
	@Before
	public void before(){
//		userDao.executeSql("INSERT INTO `user` VALUES ('2231','zhao','shuxue')");
		System.out.println("准备测试！！！");
	}
	
	@After
	public void After(){
		System.out.println("测试结束！！！");
	}
	
	@Test
	public void get() {
		//User user = userMapper.selectByPrimaryKey("1");
		//System.out.println(JSON.toJSONString(user));
	}
	
	@Test
	public void getAll(){
		//User selectByPrimaryKey = userMapper.selectByPrimaryKey("99");
		//System.out.println(JSON.toJSONString(selectByPrimaryKey));
	}
	
	
	
	
	@Test
	public void add(){
		SUser user = new SUser();
		user.setId(""
				+ "7");
		//user.setName("Zsx");
		//user.setPwd("pwd");
		userService.insert(user);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
