package com.kgc.mybatis2018.dao.impl;

import com.kgc.mybatis2018.dao.UserMapper;
import com.kgc.mybatis2018.entity.Address;
import com.kgc.mybatis2018.entity.MyBatisUtil;
import com.kgc.mybatis2018.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperImpl implements UserMapper {
    @Override
    public int selectUserCount() {
        SqlSession sqlSession = null;

            try {
             sqlSession = MyBatisUtil.createSqlSession();//开启事务
                Integer count;
                count = sqlSession.getMapper(UserMapper.class).selectUserCount();
                return  count;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);//关闭事务
                return 0;
        }
    }

    @Override
    public List<User> selectAllUser() {

       SqlSession sqlSession =null;
       try {
           sqlSession = MyBatisUtil.createSqlSession();
           List<User> list = sqlSession.getMapper(UserMapper.class).selectAllUser();
           sqlSession.commit();
           return list;
       }catch (Exception e){
           sqlSession.rollback();
           e.printStackTrace();
       }
        return null;
    }

    @Override
    public List<User> selectUserByUserName(String userName) {
        SqlSession sqlSession =null;
        try {
            sqlSession = MyBatisUtil.createSqlSession();
            List<User> list = sqlSession.getMapper(UserMapper.class).selectUserByUserName(userName);
            sqlSession.commit();
            return list;
        }catch (Exception e){
            sqlSession.rollback();
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<User> findUserByNameAndSex(String userName, int gender) {
        SqlSession sqlSession =null;
        try {
            sqlSession = MyBatisUtil.createSqlSession();
            List<User> list = sqlSession.getMapper(UserMapper.class).findUserByNameAndSex(userName,gender);
            sqlSession.commit();
            return list;
        }catch (Exception e){
            sqlSession.rollback();
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<User> selectUser(User user) {
        SqlSession sqlSession =null;
        try {
            sqlSession = MyBatisUtil.createSqlSession();
            List<User> list = sqlSession.getMapper(UserMapper.class).selectUser(user);
            sqlSession.commit();
            return list;
        }catch (Exception e){
            sqlSession.rollback();
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<User> selectUser2(Map<String, Object> userMap) {
        SqlSession sqlSession =null;
        try {
            sqlSession = MyBatisUtil.createSqlSession();
            List<User> list = sqlSession.getMapper(UserMapper.class).selectUser2(userMap);
            sqlSession.commit();
            return list;
        }catch (Exception e){
            sqlSession.rollback();
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<User> findUserByTwoUser(User user1, User user2) {
        SqlSession sqlSession =null;
        try {
            sqlSession = MyBatisUtil.createSqlSession();
            List<User> list = sqlSession.getMapper(UserMapper.class).findUserByTwoUser(user1,user2);
            sqlSession.commit();
            return list;
        }catch (Exception e){
            sqlSession.rollback();
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<User> findUserLikeName(String userName) {
        SqlSession sqlSession =null;
        try {
            sqlSession = MyBatisUtil.createSqlSession();
            List<User> list = sqlSession.getMapper(UserMapper.class).selectUserByUserName(userName);
            sqlSession.commit();
            return list;
        }catch (Exception e){
            sqlSession.rollback();
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<User> selectUser3() {
        SqlSession sqlSession =null;
        try {
            sqlSession = MyBatisUtil.createSqlSession();
            List<User> list = sqlSession.getMapper(UserMapper.class).selectUser3();
            sqlSession.commit();
            return list;
        }catch (Exception e){
            sqlSession.rollback();
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<User> selectUser4() {
        SqlSession sqlSession =null;
        try {
            sqlSession = MyBatisUtil.createSqlSession();
            List<User> list = sqlSession.getMapper(UserMapper.class).selectUser4();
            sqlSession.commit();
            return list;
        }catch (Exception e){
            sqlSession.rollback();
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Integer addUser(User user) {
        SqlSession sqlSession =null;
        try {
            sqlSession = MyBatisUtil.createSqlSession();
            Integer integer = sqlSession.getMapper(UserMapper.class).addUser(user);
            sqlSession.commit();
            return integer;
        }catch (Exception e){
            sqlSession.rollback();
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Integer modify(User user) {
        SqlSession sqlSession =null;
        try {
            sqlSession = MyBatisUtil.createSqlSession();
            Integer integer = sqlSession.getMapper(UserMapper.class).modify(user);
            sqlSession.commit();
            return integer;
        }catch (Exception e){
            sqlSession.rollback();
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Integer delete(int id) {
        SqlSession sqlSession =null;
        try {
            sqlSession = MyBatisUtil.createSqlSession();
            Integer integer = sqlSession.getMapper(UserMapper.class).delete(id);
            sqlSession.commit();
            return integer;
        }catch (Exception e){
            sqlSession.rollback();
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<User> getUserListByRoleId(Integer roleId) {
        SqlSession sqlSession =null;
        try {
            sqlSession = MyBatisUtil.createSqlSession();
            List<User> list = sqlSession.getMapper(UserMapper.class).getUserListByRoleId(roleId);
            return list;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public User selectById(Integer id) {
        SqlSession sqlSession =null;
        try {
            sqlSession = MyBatisUtil.createSqlSession();
            User user = sqlSession.getMapper(UserMapper.class).selectById(id);
            return user;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public User selectById2(Integer id) {
        SqlSession sqlSession =null;
        try {
            sqlSession = MyBatisUtil.createSqlSession();
            User user = sqlSession.getMapper(UserMapper.class).selectById2(id);
            return user;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public User selectById3(Integer id) {
        SqlSession sqlSession =null;
        try {
            sqlSession = MyBatisUtil.createSqlSession();
            User user = sqlSession.getMapper(UserMapper.class).selectById3(id);
            return user;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<User> selectUser1(Map<String, Object> userMap) {
        SqlSession sqlSession =null;
        try {
            sqlSession = MyBatisUtil.createSqlSession();
            List<User> list = sqlSession.getMapper(UserMapper.class).selectUser1(userMap);
            sqlSession.commit();
            return list;
        }catch (Exception e){
            sqlSession.rollback();
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Integer modify2(User user) {
        SqlSession sqlSession =null;
        try {
            sqlSession = MyBatisUtil.createSqlSession();
            Integer integer = sqlSession.getMapper(UserMapper.class).modify2(user);
            sqlSession.commit();
            return integer;
        }catch (Exception e){
            sqlSession.rollback();
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<User> getUserByRoleId_foreach_array(Integer[] roleIds) {
        SqlSession sqlSession =null;
        try {
            sqlSession = MyBatisUtil.createSqlSession();
            List<User> user = sqlSession.getMapper(UserMapper.class).getUserByRoleId_foreach_array(roleIds);
            return user;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<User> getUserByRoleId_foreach_list(List<Integer> roleIds) {
        SqlSession sqlSession =null;
        try {
            sqlSession = MyBatisUtil.createSqlSession();
            List<User> user = sqlSession.getMapper(UserMapper.class).getUserByRoleId_foreach_list(roleIds);
            return user;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<User> getUserByRoleId_foreach_map(Map<String, List<Integer>> roleIds) {
        SqlSession sqlSession =null;
        try {
            sqlSession = MyBatisUtil.createSqlSession();
            List<User> user = sqlSession.getMapper(UserMapper.class).getUserByRoleId_foreach_map(roleIds);
            return user;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<User> getUserList_choose(Integer order) {
        SqlSession sqlSession=null;
        try {
            sqlSession= MyBatisUtil.createSqlSession();

            List<User> users=sqlSession.getMapper(UserMapper.class).getUserList_choose(order);
            return  users;
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }


    @Test
    public void test01(){
        List<User> list = selectUserByUserName("admin");
        for (User user : list) {
            System.out.println(user);
        }
    }

    @Test
    public void test02(){
        List<User> list = findUserByNameAndSex("admin",1);
        for (User user : list) {
            System.out.println(user);
        }
    }

    @Test
    public void test03(){
        User user=new User();
        user.setUserName("张");
        List<User> list = selectUser(user);
        for (User u : list) {
            System.out.println(u);
        }
    }

    @Test
    public void test04(){
        Map<String,Object> map=new HashMap<>();
        map.put("userName","张");
        List<User> list = selectUser2(map);
        for (User u : list) {
            System.out.println(u);
        }
    }
    @Test
    public  void test05(){
        User user1 = new User();
        User user2 = new User();
        user1.setUserName("admin");
        user2.setGender(1);
        List<User> userByTwoUser = findUserByTwoUser(user1, user2);
        for (User user : userByTwoUser) {
            System.out.println(user);
        }
    }
    @Test
    public  void test06(){
        List<User> users = findUserLikeName("李");
        for (User user : users) {
            System.out.println(user);
        }
    }
    @Test
    public void  test07(){
        List<User> list = selectUser3();
        for (User user : list) {
            System.out.println(user);
        }
    }
    @Test
    public void  test08(){
        List<User> list = selectUser4();
        for (User user : list) {
            System.out.println(user);
        }
    }
    @Test
    public void test09(){
       User user = new User();
       user.setUserName("李白");
       user.setUserCode("侠客行");
       user.setUserPassword("123569");
       Integer integer = addUser(user);
        if (integer==null){
            System.out.println("请联系管理员");
        }else if(integer==1){
            System.out.println("添加成功");
        }else {
            System.out.println("输出错误！编号为："+user.getId());
        }
    }
    @Test
    public  void test10(){
        User user = new User();
        user.setId(6);
        user.setUserPassword("123569");
        Integer integer = modify(user);
        if(integer==null){
            System.out.println("请联系管理员");
        }else if (integer==1){
            System.out.println("修改成功");
        }else {
            System.out.println("输出错误！编号为："+user.getId());
        }
    }
    @Test
    public void test11(){
        User user = new User();
        Integer integer = delete(17);
        if(integer==null){
            System.out.println("请联系管理员");
        }else if (integer==1){
            System.out.println("删除成功");
        }else {
            System.out.println("输出错误！编号为："+user.getId());
        }
    }
    @Test
    public void test12(){
        List<User> userListByRoleId = getUserListByRoleId(3);
        for (User user : userListByRoleId) {
            System.out.println(user);
            System.out.println(user.getRoles());
        }
    }

    @Test
    public void  test13(){
        User user = selectById(1);
        System.out.println(user);
        System.out.println(user.getUserName());
        System.out.println(user.getRoles().getRoleName());
    }

    @Test
    public void  test14() {
        User user = selectById2(1);
        System.out.println(user.getUserName());
        List<Address> list = user.getAddresss();
        for (Address address : list) {
            System.out.println(address.toString());
        }
    }

    @Test
    public void  test15() {
        User user = selectById2(1);
        System.out.println(user.getUserName());
        List<Address> list = user.getAddresss();
        for (Address address : list) {
            System.out.println(address);
        }
    }
    @Test
    public void test16() {
   	User user = new User();
   	user.setId(6);
		/* user.setAddress("天剑山崖川"); */
   	user.setUserPassword("7758521");
    	user.setUserName("寒心雨");
   	 Integer integer1 = modify2(user);
    	 System.out.println("受影响行数："+integer1);
   }


      @Test
      public void Test() { Integer[] arrays = {}; List<User> usera =
     getUserByRoleId_foreach_array(arrays); for (User user : usera) {
     System.out.println(user); } }


     @Test
     public void Test1() { List<Integer> list=new ArrayList<Integer>();
     list.add(1); list.add(2); List<User> userByRoleId_foreach_array =
      getUserByRoleId_foreach_list(list); for (User user :
     userByRoleId_foreach_array) { System.out.println(user); } }



     @Test
     public void test017() { Map<String, List<Integer>> map=new
      HashMap<String, List<Integer>>(); List<Integer> list=new
      ArrayList<Integer>(); list.add(1); list.add(2); map.put("rids", list);

     List<User> userByRoleId_foreach_array = getUserByRoleId_foreach_map(map); for
     (User user : userByRoleId_foreach_array) { System.out.println(user); } }



    @Test
    public void test18() {

        List<User> userByRoleId_foreach_array = getUserList_choose(10); for (User
                user : userByRoleId_foreach_array) { System.out.println(user); } }

}
