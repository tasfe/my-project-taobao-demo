package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.ump.activity.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class UmpActivityAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1891458745487192284L;

	/** 
	 * 活动id
	 */
	@ApiField("act_id")
	private Long actId;

	public void setActId(Long actId) {
		this.actId = actId;
	}
	public Long getActId( ) {
		return this.actId;
	}

}
