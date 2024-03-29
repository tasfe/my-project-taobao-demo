package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.ADGroupPage;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.simba.adgroupsbyadgroupids.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaAdgroupsbyadgroupidsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4854994287961918423L;

	/** 
	 * 返回的推广组分页对象
	 */
	@ApiField("adgroups")
	private ADGroupPage adgroups;

	public void setAdgroups(ADGroupPage adgroups) {
		this.adgroups = adgroups;
	}
	public ADGroupPage getAdgroups( ) {
		return this.adgroups;
	}

}
