package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.Room;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.hotel.rooms.search response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class HotelRoomsSearchResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5811327211523238593L;

	/** 
	 * 多个商品结构。是否返回酒店信息、房型信息、房态列表、宝贝描述根据参数决定
	 */
	@ApiListField("rooms")
	@ApiField("room")
	private List<Room> rooms;

	/** 
	 * 符合条件的结果总数
	 */
	@ApiField("total_results")
	private Long totalResults;

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
	public List<Room> getRooms( ) {
		return this.rooms;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}
