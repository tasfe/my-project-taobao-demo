package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.InventoryAuthorizeInfo;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.inventory.authorize.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class InventoryAuthorizeGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8315964292662474652L;

	/** 
	 * 返回的是该商品的授权明细，参考
InventoryAuthorizeInfo结构
	 */
	@ApiListField("authorize_list")
	@ApiField("inventory_authorize_info")
	private List<InventoryAuthorizeInfo> authorizeList;

	public void setAuthorizeList(List<InventoryAuthorizeInfo> authorizeList) {
		this.authorizeList = authorizeList;
	}
	public List<InventoryAuthorizeInfo> getAuthorizeList( ) {
		return this.authorizeList;
	}

}
