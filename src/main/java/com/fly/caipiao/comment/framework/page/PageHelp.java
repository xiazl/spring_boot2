package com.fly.caipiao.comment.framework.page;

import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

/**
 *  分页返回参数封装
 *
 * @author baidu
 */
public class PageHelp {
	public final static <T> PageDataResult<T> getDataResult(List<T> data) {
		return getDataResult(data, null);
	}
	public final static <T> PageDataResult<T> getDataResult(List<T> data,Map filter) {
		PageDataResult<T> dataResult = new PageDataResult<>();
		PageBean pager = new PageBean();
		dataResult.setDataList(data);

		PageInfo<T> page = new PageInfo<T>(data);
		pager.setCurrent(page.getPageNum());//当前页
		pager.setTotal(page.getTotal());//总记录数
		pager.setPageSize(page.getPageSize());//每页条数
		dataResult.setPager(pager);

		dataResult.setFilter(filter);
		return dataResult;
	}
	
	public final static <T> PageDataResult<T> getDataResult(List<T> data, PageBean pageBean, Map filter) {
		PageDataResult<T> dataResult = new PageDataResult<>();
		dataResult.setDataList(data);
		dataResult.setPager(pageBean);
		dataResult.setFilter(filter);
		return dataResult;
	}
}
