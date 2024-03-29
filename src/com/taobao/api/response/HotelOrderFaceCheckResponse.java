package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.hotel.order.face.check response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class HotelOrderFaceCheckResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1682657613739515669L;

	/** 
	 * 处理结果
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
