package com.zhanghua;

import com.zhanghua.model.Page;

public class BluePageHelper {

	private static ThreadLocal<Page> LOCAL_PAGE = new ThreadLocal<>();

	public static void startPage(int pageNum, int pageSize) {
		Page page = new Page();
		page.setPageNum(pageNum);
		page.setPageSize(pageSize);
		setLocalPage(page);
	}

	public static void setLocalPage(Page page) {
		LOCAL_PAGE.set(page);
	}

	public static Page getLocalPage() {
		return LOCAL_PAGE.get();
	}

	/**
	 * 移除本地变量
	 */
	public static void clearLocalPage() {
		LOCAL_PAGE.remove();
	}


}
