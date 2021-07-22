package com.zhanghua.model;

public class Page {
	/**
	 * 默认请求第一页
	 */
	private Integer pageNum = 1;

	/**
	 * 默认每页大小
	 */
	private Integer pageSize = 5;

	/**
	 * 开始行数
	 */
	private Integer startRow;

	/**
	 * 数据库中总行数
	 */
	private Integer total;

	/**
	 * 实际获取到的行数
	 * 暂时还没用到，未来可能用到
	 */
	private Integer resultSize;

	public Page() {
		startRow = (pageNum - 1) * pageSize;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
		updateStartRow();
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		updateStartRow();
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public Integer getStartRow() {
		return startRow;
	}

	public void updateStartRow() {
		setStartRow((pageNum - 1) * pageSize);
	}

	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getResultSize() {
		return resultSize;
	}

	public void setResultSize(Integer resultSize) {
		this.resultSize = resultSize;
	}

	@Override
	public String toString() {
		return "Page{" +
				"pageNum=" + pageNum +
				", pageSize=" + pageSize +
				", startRow=" + startRow +
				", total=" + total +
				", resultSize=" + resultSize +
				'}';
	}

}
