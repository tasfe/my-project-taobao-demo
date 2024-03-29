package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 国内机票航段信息数据结构，【订单优化】
 *
 * @author auto create
 * @since 1.0, null
 */
public class SegmentInfo extends TaobaoObject {

	private static final long serialVersionUID = 7824457626189419612L;

	/**
	 * 航班航空公司二字码
	 */
	@ApiField("airline_code")
	private String airlineCode;

	/**
	 * 航班到达机场三字码
	 */
	@ApiField("arr_airport_code")
	private String arrAirportCode;

	/**
	 * 航班到达城市三字码
	 */
	@ApiField("arr_city_code")
	private String arrCityCode;

	/**
	 * 航班到达时间，格式yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("arr_time")
	private String arrTime;

	/**
	 * 出票状态: 0，初始状态；1，hk成功；2，hk失败；3，出票（RR）成功；4，出票（RR）失败；5，取消hk成功 6:取消hk失败
	 */
	@ApiField("book_status")
	private Long bookStatus;

	/**
	 * 舱位等级：0，头等舱(F)；1，商务舱(C)；2，经济舱(Y)
	 */
	@ApiField("cabin_class")
	private Long cabinClass;

	/**
	 * 航班舱位代码
	 */
	@ApiField("cabin_code")
	private String cabinCode;

	/**
	 * 航班舱位id，淘宝系统唯一键
	 */
	@ApiField("cabin_id")
	private Long cabinId;

	/**
	 * 航班实际承运航班号
	 */
	@ApiField("carrier")
	private String carrier;

	/**
	 * 航班儿童机建费用，单位：分
	 */
	@ApiField("child_fee")
	private Long childFee;

	/**
	 * 儿童销售价格，单位：分
	 */
	@ApiField("child_price")
	private Long childPrice;

	/**
	 * 航班儿童燃油税，单位：分
	 */
	@ApiField("child_tax")
	private Long childTax;

	/**
	 * 航班出发机场三字码
	 */
	@ApiField("dep_airport_code")
	private String depAirportCode;

	/**
	 * 航班出发城市三字码
	 */
	@ApiField("dep_city_code")
	private String depCityCode;

	/**
	 * 航班起飞时间，格式yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("dep_time")
	private String depTime;

	/**
	 * 扩展信息
	 */
	@ApiField("extra")
	private String extra;

	/**
	 * 航班成人机建费，单位：分
	 */
	@ApiField("fee")
	private Long fee;

	/**
	 * 淘宝系统航班id唯一键
	 */
	@ApiField("flight_id")
	private Long flightId;

	/**
	 * 航班号
	 */
	@ApiField("flight_no")
	private String flightNo;

	/**
	 * 航班机型
	 */
	@ApiField("flight_type")
	private String flightType;

	/**
	 * 备注信息，政策中的备注信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 乘机人信息列表
	 */
	@ApiListField("passengers")
	@ApiField("passerger")
	private List<Passerger> passengers;

	/**
	 * 政策id，淘宝系统政策唯一键
	 */
	@ApiField("policy_id")
	private Long policyId;

	/**
	 * 机票政策类型：6，特价；8，让利；10，特殊
	 */
	@ApiField("policy_type")
	private Long policyType;

	/**
	 * 销售价格，单位：分
	 */
	@ApiField("price")
	private Long price;

	/**
	 * 航段类型：1，去程；2，回程
	 */
	@ApiField("segment_type")
	private Long segmentType;

	/**
	 * 特殊说明
	 */
	@ApiField("special_rule")
	private String specialRule;

	/**
	 * 航班成人燃油税，单位：分
	 */
	@ApiField("tax")
	private Long tax;

	/**
	 * 当前航段票面价格，单位：分
	 */
	@ApiField("ticket_price")
	private Long ticketPrice;

	public String getAirlineCode() {
		return this.airlineCode;
	}
	public void setAirlineCode(String airlineCode) {
		this.airlineCode = airlineCode;
	}

	public String getArrAirportCode() {
		return this.arrAirportCode;
	}
	public void setArrAirportCode(String arrAirportCode) {
		this.arrAirportCode = arrAirportCode;
	}

	public String getArrCityCode() {
		return this.arrCityCode;
	}
	public void setArrCityCode(String arrCityCode) {
		this.arrCityCode = arrCityCode;
	}

	public String getArrTime() {
		return this.arrTime;
	}
	public void setArrTime(String arrTime) {
		this.arrTime = arrTime;
	}

	public Long getBookStatus() {
		return this.bookStatus;
	}
	public void setBookStatus(Long bookStatus) {
		this.bookStatus = bookStatus;
	}

	public Long getCabinClass() {
		return this.cabinClass;
	}
	public void setCabinClass(Long cabinClass) {
		this.cabinClass = cabinClass;
	}

	public String getCabinCode() {
		return this.cabinCode;
	}
	public void setCabinCode(String cabinCode) {
		this.cabinCode = cabinCode;
	}

	public Long getCabinId() {
		return this.cabinId;
	}
	public void setCabinId(Long cabinId) {
		this.cabinId = cabinId;
	}

	public String getCarrier() {
		return this.carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public Long getChildFee() {
		return this.childFee;
	}
	public void setChildFee(Long childFee) {
		this.childFee = childFee;
	}

	public Long getChildPrice() {
		return this.childPrice;
	}
	public void setChildPrice(Long childPrice) {
		this.childPrice = childPrice;
	}

	public Long getChildTax() {
		return this.childTax;
	}
	public void setChildTax(Long childTax) {
		this.childTax = childTax;
	}

	public String getDepAirportCode() {
		return this.depAirportCode;
	}
	public void setDepAirportCode(String depAirportCode) {
		this.depAirportCode = depAirportCode;
	}

	public String getDepCityCode() {
		return this.depCityCode;
	}
	public void setDepCityCode(String depCityCode) {
		this.depCityCode = depCityCode;
	}

	public String getDepTime() {
		return this.depTime;
	}
	public void setDepTime(String depTime) {
		this.depTime = depTime;
	}

	public String getExtra() {
		return this.extra;
	}
	public void setExtra(String extra) {
		this.extra = extra;
	}

	public Long getFee() {
		return this.fee;
	}
	public void setFee(Long fee) {
		this.fee = fee;
	}

	public Long getFlightId() {
		return this.flightId;
	}
	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}

	public String getFlightNo() {
		return this.flightNo;
	}
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public String getFlightType() {
		return this.flightType;
	}
	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public List<Passerger> getPassengers() {
		return this.passengers;
	}
	public void setPassengers(List<Passerger> passengers) {
		this.passengers = passengers;
	}

	public Long getPolicyId() {
		return this.policyId;
	}
	public void setPolicyId(Long policyId) {
		this.policyId = policyId;
	}

	public Long getPolicyType() {
		return this.policyType;
	}
	public void setPolicyType(Long policyType) {
		this.policyType = policyType;
	}

	public Long getPrice() {
		return this.price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

	public Long getSegmentType() {
		return this.segmentType;
	}
	public void setSegmentType(Long segmentType) {
		this.segmentType = segmentType;
	}

	public String getSpecialRule() {
		return this.specialRule;
	}
	public void setSpecialRule(String specialRule) {
		this.specialRule = specialRule;
	}

	public Long getTax() {
		return this.tax;
	}
	public void setTax(Long tax) {
		this.tax = tax;
	}

	public Long getTicketPrice() {
		return this.ticketPrice;
	}
	public void setTicketPrice(Long ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

}
