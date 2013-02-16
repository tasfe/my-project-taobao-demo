package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Role;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.sellercenter.role.info.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SellercenterRoleInfoGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5591969868646544896L;

	/** 
	 * 角色具体信息
	 */
	@ApiField("role")
	private Role role;

	public void setRole(Role role) {
		this.role = role;
	}
	public Role getRole( ) {
		return this.role;
	}

}
