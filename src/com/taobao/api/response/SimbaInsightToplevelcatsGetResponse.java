package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.INCategoryTop;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.simba.insight.toplevelcats.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaInsightToplevelcatsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5553987187963163817L;

	/** 
	 * 得到一级类目
	 */
	@ApiListField("in_category_tops")
	@ApiField("i_n_category_top")
	private List<INCategoryTop> inCategoryTops;

	public void setInCategoryTops(List<INCategoryTop> inCategoryTops) {
		this.inCategoryTops = inCategoryTops;
	}
	public List<INCategoryTop> getInCategoryTops( ) {
		return this.inCategoryTops;
	}

}
