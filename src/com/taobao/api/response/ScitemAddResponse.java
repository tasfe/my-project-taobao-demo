package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.ScItem;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.scitem.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ScitemAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7453294584195246522L;

	/** 
	 * 后台商品信息
	 */
	@ApiField("sc_item")
	private ScItem scItem;

	public void setScItem(ScItem scItem) {
		this.scItem = scItem;
	}
	public ScItem getScItem( ) {
		return this.scItem;
	}

}
