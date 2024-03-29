package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SubuserDepartmentAddResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.subuser.department.add request
 * 
 * @author auto create
 * @since 1.0, 2013-02-16 12:41:30
 */
public class SubuserDepartmentAddRequest implements TaobaoRequest<SubuserDepartmentAddResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 部门名称
	 */
	private String departmentName;

	/** 
	* 父部门ID 如果是最高部门则传入0
	 */
	private Long parentId;

	/** 
	* 主账号用户名
	 */
	private String userNick;

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentName() {
		return this.departmentName;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	public Long getParentId() {
		return this.parentId;
	}

	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}
	public String getUserNick() {
		return this.userNick;
	}
	private Map<String,String> headerMap=new TaobaoHashMap();
	
	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.subuser.department.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("department_name", this.departmentName);
		txtParams.put("parent_id", this.parentId);
		txtParams.put("user_nick", this.userNick);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new TaobaoHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Class<SubuserDepartmentAddResponse> getResponseClass() {
		return SubuserDepartmentAddResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(departmentName,"departmentName");
		RequestCheckUtils.checkNotEmpty(parentId,"parentId");
		RequestCheckUtils.checkNotEmpty(userNick,"userNick");
	}
	
	public Map<String,String> getHeaderMap() {
		return headerMap;
	}
}
