package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.top.matrix.vm.monitor.put response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TopMatrixVmMonitorPutResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1153724565946363772L;

	/** 
	 * 返回值
	 */
	@ApiField("value")
	private String value;

	public void setValue(String value) {
		this.value = value;
	}
	public String getValue( ) {
		return this.value;
	}

}
