package com.wangchaoyue;

/**
 * @author 王超越
 *
 * 2019年11月8日
 */
public class StringUtils01 {
	
	/**
	 * 判断字符串是否为空
	 * @param str
	 * @return
	 */
	public static boolean isBlank(String str) {
		return (str==null || str.trim().equals(""));
	}
}
