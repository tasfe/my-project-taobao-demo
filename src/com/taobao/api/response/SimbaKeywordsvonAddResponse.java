package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.Keyword;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.simba.keywordsvon.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaKeywordsvonAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5277117819263775883L;

	/** 
	 * 关键词列表
	 */
	@ApiListField("keywords")
	@ApiField("keyword")
	private List<Keyword> keywords;

	public void setKeywords(List<Keyword> keywords) {
		this.keywords = keywords;
	}
	public List<Keyword> getKeywords( ) {
		return this.keywords;
	}

}
