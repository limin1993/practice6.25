package org.ichunk.action;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.ichunk.service.UserService;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

@Controller
public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	@Resource(name="userService")
	private UserService userService;
	
	public LoginAction() {
		
	}
	
	private String username;
	private String password;
	
	public String login(){
		
		//ActionContext ac = ActionContext.getContext();
		
		System.out.println("name:" + username + " password:" + password);
			
		HttpServletRequest request = ServletActionContext.getRequest();
		boolean login = userService.login(username, password);
		
		System.out.println(login);

		if (login) {
			request.setAttribute("name", username);
			return SUCCESS;
		} 
		else {
			addFieldError("failed","用户名或密码错误！" );
			return ERROR;
		}
			
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
	
}
