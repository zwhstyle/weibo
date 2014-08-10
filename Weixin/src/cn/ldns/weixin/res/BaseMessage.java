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

	private String ToUserName = "";// ���շ��ʺţ��յ���OpenID��
	private String FromUserName = "";// ������΢�ź�
	private long CreateTime = 0L;// ��Ϣ����ʱ��
	private String MsgType = "";// text
	private int FuncFlag = 0x0001;// λ0x0001����־ʱ���Ǳ���յ�����Ϣ��
}
