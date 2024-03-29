package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.TradeAmount;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.trade.amount.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TradeAmountGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1175613719835159217L;

	/** 
	 * 主订单的财务信息详情
	 */
	@ApiField("trade_amount")
	private TradeAmount tradeAmount;

	public void setTradeAmount(TradeAmount tradeAmount) {
		this.tradeAmount = tradeAmount;
	}
	public TradeAmount getTradeAmount( ) {
		return this.tradeAmount;
	}

}
