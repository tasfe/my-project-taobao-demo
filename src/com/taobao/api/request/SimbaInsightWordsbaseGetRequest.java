package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaInsightWordsbaseGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.simba.insight.wordsbase.get request
 * 
 * @author auto create
 * @since 1.0, 2013-02-16 12:41:29
 */
public class SimbaInsightWordsbaseGetRequest implements TaobaoRequest<SimbaInsightWordsbaseGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 结果过滤。PV：返回展现量；CLICK：返回点击量；AVGCPC：返回平均出价；COMPETITION ：返回竞争宝贝数;CTR 点击率。filter可由,组合
	 */
	private String filter;

	/** 
	* 主人昵称
	 */
	private String nick;

	/** 
	* 时间格式(DAY: 最近一天； WEEK：最近一周。MONTH：最近一个月。3MONTH：最近三个月)
	 */
	private String time;

	/** 
	* 查询词组，最大长度170
	 */
	private String words;

	public void setFilter(String filter) {
		this.filter = filter;
	}
	public String getFilter() {
		return this.filter;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getNick() {
		return this.nick;
	}

	public void setTime(String time) {
		this.time = time;
	}
	public String getTime() {
		return this.time;
	}

	public void setWords(String words) {
		this.words = words;
	}
	public String getWords() {
		return this.words;
	}
	private Map<String,String> headerMap=new TaobaoHashMap();
	
	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.simba.insight.wordsbase.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("filter", this.filter);
		txtParams.put("nick", this.nick);
		txtParams.put("time", this.time);
		txtParams.put("words", this.words);
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

	public Class<SimbaInsightWordsbaseGetResponse> getResponseClass() {
		return SimbaInsightWordsbaseGetResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(filter,"filter");
		RequestCheckUtils.checkNotEmpty(time,"time");
		RequestCheckUtils.checkNotEmpty(words,"words");
		RequestCheckUtils.checkMaxListSize(words,170,"words");
	}
	
	public Map<String,String> getHeaderMap() {
		return headerMap;
	}
}
