package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.AtOrder;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.trip.jipiao.agent.order.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TripJipiaoAgentOrderGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3455648269421373618L;

	/** 
	 * 返回订单详细列表
	 */
	@ApiListField("orders")
	@ApiField("at_order")
	private List<AtOrder> orders;

	public void setOrders(List<AtOrder> orders) {
		this.orders = orders;
	}
	public List<AtOrder> getOrders( ) {
		return this.orders;
	}

}
