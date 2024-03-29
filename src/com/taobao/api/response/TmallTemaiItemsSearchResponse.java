package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.TmallSearchTmItem;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: tmall.temai.items.search response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TmallTemaiItemsSearchResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1648251393919639348L;

	/** 
	 * 特卖搜索结果宝贝列表
	 */
	@ApiListField("item_list")
	@ApiField("tmall_search_tm_item")
	private List<TmallSearchTmItem> itemList;

	/** 
	 * 当前页数
	 */
	@ApiField("page")
	private Long page;

	/** 
	 * 每页搜索返回数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 搜索总页数
	 */
	@ApiField("total_page")
	private Long totalPage;

	/** 
	 * 搜索结果总数
	 */
	@ApiField("total_results")
	private Long totalResults;

	public void setItemList(List<TmallSearchTmItem> itemList) {
		this.itemList = itemList;
	}
	public List<TmallSearchTmItem> getItemList( ) {
		return this.itemList;
	}

	public void setPage(Long page) {
		this.page = page;
	}
	public Long getPage( ) {
		return this.page;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}
	public Long getTotalPage( ) {
		return this.totalPage;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}
