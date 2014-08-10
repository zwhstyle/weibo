package cn.ldns.weixin.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.ldns.weixin.service.CoreService;
import cn.ldns.weixin.util.SignUtil;

@SuppressWarnings("serial")
public class CoreServlet extends HttpServlet {

	public CoreServlet() {
		super();
	}

	public void destroy() {
		super.destroy();
	}

	/**
	 * ��֤url��token
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ΢�ż���ǩ��
		String signature = request.getParameter("signature");
		// ʱ��¾
		String timestamp = request.getParameter("timestamp");
		// �����
		String nonce = request.getParameter("nonce");
		// ����ַ���
		String echostr = request.getParameter("echostr");

		PrintWriter out = response.getWriter();
		// ͨ������ signature ���������У�飬��У��ɹ���ԭ������ echostr����ʾ����ɹ����������ʧ��
		if (SignUtil.checkSignature(signature, timestamp, nonce)) {
			out.print(echostr);
		}

		out.close();
		out = null;
	}

	/**
	 * �û�����ƽ̨����Ϣ���Զ�������Ϣ
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// request�з�װ��������ص��������ݣ����Դ�request��ȡ��΢�ŷ�������������Ϣ��
		// ��ͨ��response���ǿ��ԶԽ��յ�����Ϣ������Ӧ����������Ϣ��
		// ��������Ӧ�ı��������ΪUTF-8����ֹ�������룩
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");

		// ���ú���ҵ���������Ϣ��������Ϣ
		String respMessage = CoreService.processRequest(request);

		// ��Ӧ��Ϣ
		PrintWriter out = response.getWriter();
		out.print(respMessage);
		out.close();
	}

	public void init() throws ServletException {
	}
}
