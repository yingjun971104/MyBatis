package com.st.mapper;

import com.st.pojo.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 *  @author: 卢应军
 */
public interface ParameterMapper {

	/**
	 * 添加用户信息
	 */
	int insertUser();

	/**
	 * 查询所有的用户信息集合
	 */
	List<Users> getAllUser();

	/**
	 * 根据用户名查询用户信息
	 * @param userName 用户名
	 * @return
	 */
	Users getUsreByUserName(String userName);

	/**
	 * 验证登录
	 * @param username
	 * @param password
	 * @return
	 */
	Users checkLogin(String username,String password);

	/**
	 * 验证登录
	 * @param map
	 * @return
	 */
	Users checkLoginByMap(Map<String,String> map);

	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	int insertUserByUser(Users user);

	/**
	 * 验证登录 @param
	 * @param username
	 * @param password
	 * @return
	 */
	Users checkLoginByParam(@Param("username") String username, @Param("password") String password);

}
