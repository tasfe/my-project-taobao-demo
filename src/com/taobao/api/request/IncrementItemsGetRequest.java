package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.IncrementItemsGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.increment.items.get request
 * 
 * @author auto create
 * @since 1.0, 2013-02-16 12:41:29
 */
public class IncrementItemsGetRequest implements TaobaoRequest<IncrementItemsGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 消息所对应的操作时间的最大值。和start_modified搭配使用能过滤消通知消息的时间段。不传时：如果设置了start_modified，默认为与start_modified同一天的23:59:59；否则默认为调用接口当天的23:59:59。（格式：yyyy-MM-dd HH:mm:ss）<br>
<font color="red">注意：start_modified和end_modified的日期必须在必须在同一天内，比如：start_modified设置2000-01-01 00:00:00，则end_modified必须设置为2000-01-01这个日期</font>
	 */
	private Date endModified;

	/** 
	* 消息所属于的用户的昵称。设置此参数，返回的消息会根据传入nick的进行过滤。自用型AppKey的昵称默认为自己的绑定昵称，此参数无效。
	 */
	private String nick;

	/** 
	* 页码。取值范围:大于零的整数; 默认值:1,即返回第一页数据。
	 */
	private Long pageNo;

	/** 
	* 每页条数。取值范围:大于零的整数;最大值:200;默认值:40。
	 */
	private Long pageSize;

	/** 
	* 消息所对应的操作时间的最小值和end_modified搭配使用能过滤消通知消息的时间段。不传时：如果设置了end_modified，默认为与 end_modified同一天的00:00:00，否则默认为调用接口当天的00:00:00。（格式：yyyy-MM-dd HH:mm:ss）<br>
<font color="red">注意：start_modified和end_modified的日期必须在必须在同一天内，比如：start_modified设置2000-01-01 00:00:00，则end_modified必须设置为2000-01-01这个日期</font>
	 */
	private Date startModified;

	/** 
	* 商品操作状态，默认查询所有状态的数据，除了默认值外每次只能查询一种状态。具体类型列表见：
ItemAdd（新增商品） 
ItemUpshelf（上架商品，自动上架商品不能获取到增量信息） 
ItemDownshelf（下架商品） 
ItemDelete（删除商品） 
ItemUpdate（更新商品） 
ItemRecommendDelete（取消橱窗推荐商品） 
ItemRecommendAdd（橱窗推荐商品） 
ItemZeroStock（商品卖空）
ItemPunishDelete（小二删除商品）
ItemPunishDownshelf（小二下架商品）
ItemPunishCc（小二CC商品）
ItemSkuZeroStock（商品SKU卖空）
ItemStockChanged（修改商品库存）
	 */
	private String status;

	public void setEndModified(Date endModified) {
		this.endModified = endModified;
	}
	public Date getEndModified() {
		return this.endModified;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getNick() {
		return this.nick;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public Long getPageNo() {
		return this.pageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize() {
		return this.pageSize;
	}

	public void setStartModified(Date startModified) {
		this.startModified = startModified;
	}
	public Date getStartModified() {
		return this.startModified;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return this.status;
	}
	private Map<String,String> headerMap=new TaobaoHashMap();
	
	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.increment.items.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("end_modified", this.endModified);
		txtParams.put("nick", this.nick);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("start_modified", this.startModified);
		txtParams.put("status", this.status);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new TaobaoHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Class<IncrementItemsGetResponse> getResponseClass() {
		return IncrementItemsGetResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkMinValue(pageNo,1L,"pageNo");
		RequestCheckUtils.checkMaxValue(pageSize,200L,"pageSize");
		RequestCheckUtils.checkMinValue(pageSize,1L,"pageSize");
	}
	
	public Map<String,String> getHeaderMap() {
		return headerMap;
	}
}
