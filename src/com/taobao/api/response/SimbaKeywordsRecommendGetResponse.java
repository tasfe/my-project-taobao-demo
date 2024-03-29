package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.RecommendWordPage;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.simba.keywords.recommend.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaKeywordsRecommendGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7673726462179713958L;

	/** 
	 * 推荐词分页对象，当输入的页码大于最大数值时，将返回最大的page_no值，并且结果中的数据列表为空值
	 */
	@ApiField("recommend_words")
	private RecommendWordPage recommendWords;

	public void setRecommendWords(RecommendWordPage recommendWords) {
		this.recommendWords = recommendWords;
	}
	public RecommendWordPage getRecommendWords( ) {
		return this.recommendWords;
	}

}
