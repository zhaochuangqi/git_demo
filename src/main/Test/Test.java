import com.kgc.mybatis2018.dao.UserMapper;
import com.kgc.mybatis2018.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class Test {

    public static void  main(String[]args){

/*    SqlSession session=null;
        try {
            String name="myBatis-config.xml";
            InputStream inputStream= Resources.getResourceAsStream(name);
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
            session=factory.openSession();
            int count=session.selectOne("com.kgc.mybatis2018.dao.UserMapper.selectUserCount");
            System.out.println(count);
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            session.close();
        }*/
     SqlSession session=null;
       try {
           String  name= "myBatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(name);
         SqlSessionFactory factory =  new SqlSessionFactoryBuilder().build(inputStream);
           session = factory.openSession();
           List<User> list = session.getMapper(UserMapper.class).selectAllUser();
           for (User user:list) {
               System.out.println(user.getUserName());
           }
       }catch (Exception e){
           e.printStackTrace();
       }finally {
           session.close();
       }
    }
}
