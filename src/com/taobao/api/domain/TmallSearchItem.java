package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 天猫搜索结果数据结构
 *
 * @author auto create
 * @since 1.0, null
 */
public class TmallSearchItem extends TaobaoObject {

	private static final long serialVersionUID = 3888193582412791484L;

	/**
	 * 邮费
	 */
	@ApiField("fast_post_fee")
	private String fastPostFee;

	/**
	 * 是否货到付款
	 */
	@ApiField("is_cod")
	private Long isCod;

	/**
	 * 是否折扣
	 */
	@ApiField("is_promotion")
	private Boolean isPromotion;

	/**
	 * 搜索宝贝的数字id
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * 搜索宝贝的宝贝所在地
	 */
	@ApiField("location")
	private String location;

	/**
	 * 搜索宝贝的卖家昵称
	 */
	@ApiField("nick")
	private String nick;

	/**
	 * 搜索宝贝的图片url
	 */
	@ApiField("pic_path")
	private String picPath;

	/**
	 * 搜索宝贝的一口价
	 */
	@ApiField("price")
	private String price;

	/**
	 * 搜索宝贝的一口价折扣价
	 */
	@ApiField("price_with_rate")
	private String priceWithRate;

	/**
	 * 搜索宝贝的卖家所在地
	 */
	@ApiField("seller_loc")
	private String sellerLoc;

	/**
	 * 是否免邮
	 */
	@ApiField("shipping")
	private Long shipping;

	/**
	 * 搜索宝贝的已售数量
	 */
	@ApiField("sold")
	private String sold;

	/**
	 * 搜索宝贝的spuid
	 */
	@ApiField("spu_id")
	private Long spuId;

	/**
	 * 搜索宝贝的标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 搜索宝贝url
	 */
	@ApiField("url")
	private String url;

	/**
	 * 搜索宝贝的卖家数字id
	 */
	@ApiField("user_id")
	private Long userId;

	public String getFastPostFee() {
		return this.fastPostFee;
	}
	public void setFastPostFee(String fastPostFee) {
		this.fastPostFee = fastPostFee;
	}

	public Long getIsCod() {
		return this.isCod;
	}
	public void setIsCod(Long isCod) {
		this.isCod = isCod;
	}

	public Boolean getIsPromotion() {
		return this.isPromotion;
	}
	public void setIsPromotion(Boolean isPromotion) {
		this.isPromotion = isPromotion;
	}

	public Long getItemId() {
		return this.itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getLocation() {
		return this.location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getPicPath() {
		return this.picPath;
	}
	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getPriceWithRate() {
		return this.priceWithRate;
	}
	public void setPriceWithRate(String priceWithRate) {
		this.priceWithRate = priceWithRate;
	}

	public String getSellerLoc() {
		return this.sellerLoc;
	}
	public void setSellerLoc(String sellerLoc) {
		this.sellerLoc = sellerLoc;
	}

	public Long getShipping() {
		return this.shipping;
	}
	public void setShipping(Long shipping) {
		this.shipping = shipping;
	}

	public String getSold() {
		return this.sold;
	}
	public void setSold(String sold) {
		this.sold = sold;
	}

	public Long getSpuId() {
		return this.spuId;
	}
	public void setSpuId(Long spuId) {
		this.spuId = spuId;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
