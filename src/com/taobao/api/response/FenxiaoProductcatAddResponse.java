package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.fenxiao.productcat.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class FenxiaoProductcatAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6564298423153562173L;

	/** 
	 * 操作是否成功
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	/** 
	 * 产品线ID
	 */
	@ApiField("product_line_id")
	private Long productLineId;

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}

	public void setProductLineId(Long productLineId) {
		this.productLineId = productLineId;
	}
	public Long getProductLineId( ) {
		return this.productLineId;
	}

}
