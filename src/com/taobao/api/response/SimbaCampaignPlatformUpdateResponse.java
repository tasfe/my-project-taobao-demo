package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.CampaignPlatform;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.simba.campaign.platform.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaCampaignPlatformUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6873346835639861818L;

	/** 
	 * 修改后的推广计划投放平台设置
	 */
	@ApiField("campaign_platform")
	private CampaignPlatform campaignPlatform;

	public void setCampaignPlatform(CampaignPlatform campaignPlatform) {
		this.campaignPlatform = campaignPlatform;
	}
	public CampaignPlatform getCampaignPlatform( ) {
		return this.campaignPlatform;
	}

}
