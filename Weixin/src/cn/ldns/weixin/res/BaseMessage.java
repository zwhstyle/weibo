package cn.ldns.weixin.res;

public class BaseMessage {
	public String getToUserName() {
		return ToUserName;
	}

	public void setToUserName(String toUserName) {
		ToUserName = toUserName;
	}

	public String getFromUserName() {
		return FromUserName;
	}

	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}

	public long getCreateTime() {
		return CreateTime;
	}

	public void setCreateTime(long createTime) {
		CreateTime = createTime;
	}

	public String getMsgType() {
		return MsgType;
	}

	public void setMsgType(String msgType) {
		MsgType = msgType;
	}

	public int getFuncFlag() {
		return FuncFlag;
	}

	public void setFuncFlag(int funcFlag) {
		FuncFlag = funcFlag;
	}

	private String ToUserName = "";// 接收方帐号（收到的OpenID）
	private String FromUserName = "";// 开发者微信号
	private long CreateTime = 0L;// 消息创建时间
	private String MsgType = "";// text
	private int FuncFlag = 0x0001;// 位0x0001被标志时，星标刚收到的消息。
}
