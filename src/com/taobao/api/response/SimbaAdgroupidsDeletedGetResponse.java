package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.simba.adgroupids.deleted.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaAdgroupidsDeletedGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1797265567248826382L;

	/** 
	 * 推广组ID列表
	 */
	@ApiListField("deleted_adgroup_ids")
	@ApiField("number")
	private List<Long> deletedAdgroupIds;

	public void setDeletedAdgroupIds(List<Long> deletedAdgroupIds) {
		this.deletedAdgroupIds = deletedAdgroupIds;
	}
	public List<Long> getDeletedAdgroupIds( ) {
		return this.deletedAdgroupIds;
	}

}
