package cn.gyyx.beans;

public class UserInfo {

	private int code;
	private String account;
	private String password;
	
	/**
	 * 查询code
	 * @return
	 */
	public int getCode() {
		return code;
	}
	
	/**
	 * 设置code
	 * @param code
	 */
	public void setCode(int code) {
		this.code = code;
	}
	
	/**
	 * 查询账号
	 * @return
	 */
	public String getAccount() {
		return account;
	}
	
	/**
	 * 设置账号
	 * @param account
	 */
	public void setAccount(String account) {
		this.account = account;
	}
	
	/**
	 * 查询密码
	 * @return
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * 设置密码
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
		
}
