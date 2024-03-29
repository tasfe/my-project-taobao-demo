package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.fenxiao.grade.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class FenxiaoGradeUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1787966582137243311L;

	/** 
	 * 操作是否成功
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}

}
