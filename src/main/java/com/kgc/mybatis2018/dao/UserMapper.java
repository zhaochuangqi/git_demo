package com.kgc.mybatis2018.dao;

import com.kgc.mybatis2018.entity.Address;
import com.kgc.mybatis2018.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    int selectUserCount();

    List<User> selectAllUser();

    //根据userName查询
    public List<User> selectUserByUserName(String userName);

    //根据userName和sex查询
    public List<User> findUserByNameAndSex(@Param("userName") String userName, @Param("gender") int gender);

    //根据userName模糊查询，复杂类型传参
    public List<User> selectUser(User user);

    //根据userName模糊查询，复杂类型传参-map
    public List<User> selectUser2(Map<String, Object> userMap);

    //多个复杂类型参数查询
    public List<User> findUserByTwoUser(@Param("user1") User user1,@Param("user2") User user2);

    //根据用户名查询用户对象
    public List<User> findUserLikeName(@Param("userName") String userName);

    //连表查询
    public List<User> selectUser3() ;

    //连表查询
    public List<User> selectUser4() ;

    //添加操作
    public Integer addUser(User user);

    //修改操作
    public Integer modify(User user);

    //删除操作
    public Integer delete(int id);

    //分局角色id查询用户（用户中要包括角色信息）
    public List<User> getUserListByRoleId(Integer roleId);

    User selectById(Integer id);

    User selectById2(Integer id);

    User selectById3(Integer id);

    List<User> selectUser1(Map<String, Object> userMap);

    Integer modify2(User user);

    List<User> getUserByRoleId_foreach_array(@Param("rids")Integer[] roleIds);

    List<User> getUserByRoleId_foreach_list(@Param("rids")List<Integer> roleIds);

    List<User> getUserByRoleId_foreach_map(Map<String, List<Integer>> roleIds);

    List<User> getUserList_choose(Integer order);//1  用id排序升序   2用id降序   3.birthday 升序  4.birthday 降序
}