package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Item;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.item.bseller.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ItemBsellerAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7655466878412295973L;

	/** 
	 * 新发布的商品
	 */
	@ApiField("item")
	private Item item;

	public void setItem(Item item) {
		this.item = item;
	}
	public Item getItem( ) {
		return this.item;
	}

}
