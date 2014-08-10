package cn.ldns.weixin.rep.msg;

import cn.ldns.weixin.rep.BaseMessage;

public class TextMessage extends BaseMessage {
	private String Content;

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}
	
}
