package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.KeywordPage;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.simba.keywords.changed.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaKeywordsChangedGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3378888186989991554L;

	/** 
	 * 关键词分页对象
	 */
	@ApiField("keywords")
	private KeywordPage keywords;

	public void setKeywords(KeywordPage keywords) {
		this.keywords = keywords;
	}
	public KeywordPage getKeywords( ) {
		return this.keywords;
	}

}
