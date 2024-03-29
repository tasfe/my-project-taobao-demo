package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.widget.loginstatus.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WidgetLoginstatusGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8676915622757817261L;

	/** 
	 * 当前浏览器用户是否已登陆。如果指定了nick，但是nick与浏览器用户不一致返回false。如果未指定nick，以浏览器用户登陆状态为准。如果指定了nick且与浏览器用户一致，以浏览器用户登陆状态为准
	 */
	@ApiField("is_login")
	private Boolean isLogin;

	/** 
	 * 淘宝用户的昵称，传了session且已登陆才返回
	 */
	@ApiField("nick")
	private String nick;

	/** 
	 * 淘宝用户的数字id，传了session且已登录才返回。
	 */
	@ApiField("user_id")
	private String userId;

	public void setIsLogin(Boolean isLogin) {
		this.isLogin = isLogin;
	}
	public Boolean getIsLogin( ) {
		return this.isLogin;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getNick( ) {
		return this.nick;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
