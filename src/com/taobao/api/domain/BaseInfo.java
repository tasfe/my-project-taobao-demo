package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 国内机票，订单基本信息数据结构【top订单优化】
 *
 * @author auto create
 * @since 1.0, null
 */
public class BaseInfo extends TaobaoObject {

	private static final long serialVersionUID = 2312254165673316485L;

	/**
	 * 买家支付宝帐号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 支付宝交易号
	 */
	@ApiField("alipay_trade_no")
	private String alipayTradeNo;

	/**
	 * 订单出票方式==> 1:手工hk;2:自动出票;3:自动hk手工出票
	 */
	@ApiField("book_way")
	private Long bookWay;

	/**
	 * 佣金，单位：分
	 */
	@ApiField("commission")
	private String commission;

	/**
	 * 佣金比率
	 */
	@ApiField("commission_discount")
	private String commissionDiscount;

	/**
	 * 订单创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 扩展信息
	 */
	@ApiField("extra")
	private String extra;

	/**
	 * 订单表最近一次修改时间
	 */
	@ApiField("modify_time")
	private Date modifyTime;

	/**
	 * 订单淘宝唯一主键
	 */
	@ApiField("order_id")
	private Long orderId;

	/**
	 * 订单最晚支付时间
	 */
	@ApiField("pay_latest_time")
	private Date payLatestTime;

	/**
	 * 订单支付状态==> 0:未付款;1:已付款，冻结买家定金;2:付款给卖家;3:解冻定金给买家;4:已扣佣;5:交易关闭;6:确认可支付;7:确认不可支付
	 */
	@ApiField("pay_status")
	private Long payStatus;

	/**
	 * 联系人邮箱
	 */
	@ApiField("relation_email")
	private String relationEmail;

	/**
	 * 联系人手机号
	 */
	@ApiField("relation_mobile")
	private String relationMobile;

	/**
	 * 联系人姓名
	 */
	@ApiField("relation_name")
	private String relationName;

	/**
	 * 联系人备用电话
	 */
	@ApiField("relation_phone_bak")
	private String relationPhoneBak;

	/**
	 * 关联订单号，普通往返另一程订单号，仅两程订单为同一个代理商时提供
	 */
	@ApiField("relative_order_id")
	private Long relativeOrderId;

	/**
	 * 订单状态定义==> 0:未付款;1:处理中;2:确定出票;3:预定成功;4:预定失败;5:处理中超时失效;6:支付超时失效;7:买家取消
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 总金额，所有乘机人加机建燃油，单位：分
	 */
	@ApiField("total_price")
	private Long totalPrice;

	/**
	 * 航程类型：0，单程；1，普通往返；2，多程（暂时没有使用）；3，特价往返
	 */
	@ApiField("trip_type")
	private Long tripType;

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAlipayTradeNo() {
		return this.alipayTradeNo;
	}
	public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
	}

	public Long getBookWay() {
		return this.bookWay;
	}
	public void setBookWay(Long bookWay) {
		this.bookWay = bookWay;
	}

	public String getCommission() {
		return this.commission;
	}
	public void setCommission(String commission) {
		this.commission = commission;
	}

	public String getCommissionDiscount() {
		return this.commissionDiscount;
	}
	public void setCommissionDiscount(String commissionDiscount) {
		this.commissionDiscount = commissionDiscount;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getExtra() {
		return this.extra;
	}
	public void setExtra(String extra) {
		this.extra = extra;
	}

	public Date getModifyTime() {
		return this.modifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Long getOrderId() {
		return this.orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Date getPayLatestTime() {
		return this.payLatestTime;
	}
	public void setPayLatestTime(Date payLatestTime) {
		this.payLatestTime = payLatestTime;
	}

	public Long getPayStatus() {
		return this.payStatus;
	}
	public void setPayStatus(Long payStatus) {
		this.payStatus = payStatus;
	}

	public String getRelationEmail() {
		return this.relationEmail;
	}
	public void setRelationEmail(String relationEmail) {
		this.relationEmail = relationEmail;
	}

	public String getRelationMobile() {
		return this.relationMobile;
	}
	public void setRelationMobile(String relationMobile) {
		this.relationMobile = relationMobile;
	}

	public String getRelationName() {
		return this.relationName;
	}
	public void setRelationName(String relationName) {
		this.relationName = relationName;
	}

	public String getRelationPhoneBak() {
		return this.relationPhoneBak;
	}
	public void setRelationPhoneBak(String relationPhoneBak) {
		this.relationPhoneBak = relationPhoneBak;
	}

	public Long getRelativeOrderId() {
		return this.relativeOrderId;
	}
	public void setRelativeOrderId(Long relativeOrderId) {
		this.relativeOrderId = relativeOrderId;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public Long getTotalPrice() {
		return this.totalPrice;
	}
	public void setTotalPrice(Long totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Long getTripType() {
		return this.tripType;
	}
	public void setTripType(Long tripType) {
		this.tripType = tripType;
	}

}
