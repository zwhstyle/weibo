package cn.ldns.weixin.util;

public class StringUtils {
	/**
	 * �����ַ����ĳ���
	 * @param content �����ַ���
	 * @return �ַ�������
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