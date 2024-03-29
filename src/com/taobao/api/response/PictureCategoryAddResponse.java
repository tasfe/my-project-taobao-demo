package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.PictureCategory;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.picture.category.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class PictureCategoryAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2252456564569929444L;

	/** 
	 * 图片分类信息
	 */
	@ApiField("picture_category")
	private PictureCategory pictureCategory;

	public void setPictureCategory(PictureCategory pictureCategory) {
		this.pictureCategory = pictureCategory;
	}
	public PictureCategory getPictureCategory( ) {
		return this.pictureCategory;
	}

}
