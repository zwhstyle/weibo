package cn.ldns.weixin.util;

public class StringUtils {
	/**
	 * 计算字符串的长度
	 * @param content 计算字符串
	 * @return 字符串长度
	 */
	public static int getContentSize(String content) {
		int size = 0;
		if (null != content) {
			try{
				size = content.getBytes("utf-8").length;
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
		return size;
	}
}