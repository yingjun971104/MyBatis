package com.st.pojo;

/**
 * @BelongsProject: MyBatis
 * @BelongsPackage: com.st.pojo
 * @Author: luyingjun
 * @CreateTime: 2022-09-11  13:44
 * @Description: TODO
 * @Version: 1.0
 */
public class Users {
	/**
	 *  id
	 */
	private Integer id;
	/**
	 *  姓名
	 */
	private String username;
	/**
	 *  密码
	 */
	private String password;
	/**
	 *  年龄
	 */
	private Integer age;
	/**
	 *  性别
	 */
	private String sex;
	/**
	 * 邮箱
	 */
	private String email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Users() {
	}

	public Users(Integer id, String username, String password, Integer age, String sex, String email) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.age = age;
		this.sex = sex;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Users" +
				"id=" + id +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", age=" + age +
				", sex='" + sex + '\'' +
				", email='" + email + '\'' +
				'}';
	}
}
