package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.ADGroupCatMatchPage;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.simba.adgroup.changedcatmatchs.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaAdgroupChangedcatmatchsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2374638234157829131L;

	/** 
	 * 一页类目出价对象
	 */
	@ApiField("changed_catmatchs")
	private ADGroupCatMatchPage changedCatmatchs;

	public void setChangedCatmatchs(ADGroupCatMatchPage changedCatmatchs) {
		this.changedCatmatchs = changedCatmatchs;
	}
	public ADGroupCatMatchPage getChangedCatmatchs( ) {
		return this.changedCatmatchs;
	}

}
