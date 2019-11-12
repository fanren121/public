package clientmanage;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.catalina.core.ApplicationContext;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.dao.ILogDao;
import com.company.pojo.Log;

public class Test2 {
	@Test
	public void test() {
		try {
			String resource = "spring/spring-dao.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			ILogDao logDao = sqlSession.getMapper(ILogDao.class);
			List<Log> list = logDao.findAll();
			System.out.println(list.size());
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
