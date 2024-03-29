package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 彩票赠送的统计数据DO
 *
 * @author auto create
 * @since 1.0, null
 */
public class LotteryWangcaiPresentStat extends TaobaoObject {

	private static final long serialVersionUID = 5258838655692628683L;

	/**
	 * 日期
	 */
	@ApiField("date_id")
	private Long dateId;

	/**
	 * 当日赠送彩票的金额
	 */
	@ApiField("present_fee")
	private Long presentFee;

	/**
	 * 当日赠送彩票的注数
	 */
	@ApiField("present_stake")
	private Long presentStake;

	/**
	 * 当日赠送用户数
	 */
	@ApiField("present_user")
	private Long presentUser;

	/**
	 * 送彩方的淘宝数字ID
	 */
	@ApiField("seller_id")
	private Long sellerId;

	public Long getDateId() {
		return this.dateId;
	}
	public void setDateId(Long dateId) {
		this.dateId = dateId;
	}

	public Long getPresentFee() {
		return this.presentFee;
	}
	public void setPresentFee(Long presentFee) {
		this.presentFee = presentFee;
	}

	public Long getPresentStake() {
		return this.presentStake;
	}
	public void setPresentStake(Long presentStake) {
		this.presentStake = presentStake;
	}

	public Long getPresentUser() {
		return this.presentUser;
	}
	public void setPresentUser(Long presentUser) {
		this.presentUser = presentUser;
	}

	public Long getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

}
