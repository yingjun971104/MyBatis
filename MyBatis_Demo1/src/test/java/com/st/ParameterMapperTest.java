package com.st;

import com.st.mapper.ParameterMapper;
import com.st.pojo.Users;
import com.st.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @BelongsProject: MyBatis
 * @BelongsPackage: com.st
 * @Author: luyingjun
 * @CreateTime: 2022-09-11  14:39
 * @Description: TODO
 * @Version: 1.0
 */
public class ParameterMapperTest {

	/**
	 * 查询所有用户
	 */
	@Test
	public void test01() {
		SqlSession sqlSession = SqlSessionUtils.getSqlSession();
		ParameterMapper parameterMapper = sqlSession.getMapper(ParameterMapper.class);
		List<Users> list = parameterMapper.getAllUser();
		list.forEach(user-> System.out.println(user));
	}

	/**
	 * 添加用户
	 */
	@Test
	public void test02() {
		SqlSession sqlSession = SqlSessionUtils.getSqlSession();
		ParameterMapper parameterMapper = sqlSession.getMapper(ParameterMapper.class);
		int i = parameterMapper.insertUser();
		System.out.println(i);
	}

	/**
	 * 查询用户
	 */
	@Test
	public void test03() {
		SqlSession sqlSession = SqlSessionUtils.getSqlSession();
		ParameterMapper parameterMapper = sqlSession.getMapper(ParameterMapper.class);
		Users user = parameterMapper.getUsreByUserName("张三");
		System.out.println(user);
	}

	/**
	 * 验证登录
	 */
	@Test
	public void test04(){
		SqlSession sqlSession = SqlSessionUtils.getSqlSession();
		ParameterMapper parameterMapper = sqlSession.getMapper(ParameterMapper.class);
		Users user = parameterMapper.checkLogin("张三","123");
		System.out.println(user);
	}

	/**
	 * 验证登录 map
	 */
	@Test
	public void test05(){
		SqlSession sqlSession = SqlSessionUtils.getSqlSession();
		ParameterMapper parameterMapper = sqlSession.getMapper(ParameterMapper.class);
		Map<String,String> map = new HashMap<String,String>();
		map.put("username","张三");
		map.put("password","123");
		Users user = parameterMapper.checkLoginByMap(map);
		System.out.println(user);
	}

	/**
	 * 添加 user
	 */
	@Test
	public void test06(){
		SqlSession sqlSession = SqlSessionUtils.getSqlSession();
		ParameterMapper parameterMapper = sqlSession.getMapper(ParameterMapper.class);
		int result = parameterMapper.insertUserByUser(new Users(null, "李四", "123", 23, "男", "1234@qq.com"));
		System.out.println(result);
	}

	/**
	 * 验证登录 @Param
	 */
	@Test
	public void test07(){
		SqlSession sqlSession = SqlSessionUtils.getSqlSession();
		ParameterMapper parameterMapper = sqlSession.getMapper(ParameterMapper.class);
		Users user = parameterMapper.checkLoginByParam("张三","123");
		System.out.println(user);
	}
}
