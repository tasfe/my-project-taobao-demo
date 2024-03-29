package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.CampaignArea;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.simba.campaign.area.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaCampaignAreaGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3651488288813647897L;

	/** 
	 * 推广计划的投放地域配置
	 */
	@ApiField("campaign_area")
	private CampaignArea campaignArea;

	public void setCampaignArea(CampaignArea campaignArea) {
		this.campaignArea = campaignArea;
	}
	public CampaignArea getCampaignArea( ) {
		return this.campaignArea;
	}

}
