package cn.ldns.weixin.rep.msg;

import cn.ldns.weixin.rep.BaseMessage;

public class ImageMessage extends BaseMessage{

	public String getPicUrl() {
		return PicUrl;
	}

	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}

	private String PicUrl;
}
