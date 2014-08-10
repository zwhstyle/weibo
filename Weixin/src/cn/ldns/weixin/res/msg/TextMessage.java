package cn.ldns.weixin.res.msg;

import cn.ldns.weixin.res.BaseMessage;

public class TextMessage extends BaseMessage{
	
	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	private String Content="";

}
