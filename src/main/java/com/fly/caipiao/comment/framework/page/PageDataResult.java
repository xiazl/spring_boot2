package com.fly.caipiao.comment.framework.page;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 分页查询返回bean
 *
 * @author baidu
 */
public class PageDataResult<T> {
	/**
	 * query parameters
	 */
	private Map filter;
	/**
	 * page parameter
	 */
	private PageBean pager;
	/**
	 * An array that contains the actual objects
	 */
	private List<T> dataList = null;

	public Map getFilter() {
		return filter;
	}

	public void setFilter(Map filter) {
		this.filter = filter;
	}

	public PageBean getPager() {
		return pager;
	}

	public void setPager(PageBean pager) {
		this.pager = pager;
	}

	public List<T> getDataList() {
		return dataList;
	}

	public void setDataList(List<T> dataList) {
		this.dataList = dataList;
	}

	public <C> PageDataResult<C> convert(Function<? super T, ? extends C> mapper){
		PageDataResult<C> response = new PageDataResult<C>();
		response.setFilter(this.getFilter());
		response.setPager(this.getPager());
		response.setDataList(this.getDataList().stream().map(mapper)
				.collect(Collectors.toList()));
		return response;
	}

}
