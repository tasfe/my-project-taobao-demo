package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.DistributorArchive;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.fenxiao.distributor.archives.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class FenxiaoDistributorArchivesGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1783387565846457534L;

	/** 
	 * 分销商档案
	 */
	@ApiField("distributor_archive")
	private DistributorArchive distributorArchive;

	/** 
	 * 接口执行结果，true表示执行成功；false表示执行失败。
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	public void setDistributorArchive(DistributorArchive distributorArchive) {
		this.distributorArchive = distributorArchive;
	}
	public DistributorArchive getDistributorArchive( ) {
		return this.distributorArchive;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}

}
