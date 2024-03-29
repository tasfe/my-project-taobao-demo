package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Trade;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.trade.memo.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TradeMemoUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1291467293971319176L;

	/** 
	 * 更新交易的备注信息后返回的Trade，其中可用字段为tid和modified
	 */
	@ApiField("trade")
	private Trade trade;

	public void setTrade(Trade trade) {
		this.trade = trade;
	}
	public Trade getTrade( ) {
		return this.trade;
	}

}
