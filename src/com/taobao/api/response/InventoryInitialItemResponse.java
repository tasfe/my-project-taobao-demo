package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.TipInfo;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.inventory.initial.item response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class InventoryInitialItemResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8246112844432975259L;

	/** 
	 * 提示信息
	 */
	@ApiListField("tip_infos")
	@ApiField("tip_info")
	private List<TipInfo> tipInfos;

	public void setTipInfos(List<TipInfo> tipInfos) {
		this.tipInfos = tipInfos;
	}
	public List<TipInfo> getTipInfos( ) {
		return this.tipInfos;
	}

}
