package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.FenxiaoGrade;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.fenxiao.grades.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class FenxiaoGradesGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2518229517945135743L;

	/** 
	 * 分销商等级信息
	 */
	@ApiListField("fenxiao_grades")
	@ApiField("fenxiao_grade")
	private List<FenxiaoGrade> fenxiaoGrades;

	/** 
	 * 记录数
	 */
	@ApiField("total_results")
	private Long totalResults;

	public void setFenxiaoGrades(List<FenxiaoGrade> fenxiaoGrades) {
		this.fenxiaoGrades = fenxiaoGrades;
	}
	public List<FenxiaoGrade> getFenxiaoGrades( ) {
		return this.fenxiaoGrades;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}
