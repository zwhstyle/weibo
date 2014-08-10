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
	 * 验证url和token
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 微信加密签名
		String signature = request.getParameter("signature");
		// 时间戮
		String timestamp = request.getParameter("timestamp");
		// 随机数
		String nonce = request.getParameter("nonce");
		// 随机字符串
		String echostr = request.getParameter("echostr");

		PrintWriter out = response.getWriter();
		// 通过检验 signature 对请求进行校验，若校验成功则原样返回 echostr，表示接入成功，否则接入失败
		if (SignUtil.checkSignature(signature, timestamp, nonce)) {
			out.print(echostr);
		}

		out.close();
		out = null;
	}

	/**
	 * 用户向公众平台发信息并自动返回信息
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// request中封装了请求相关的所有内容，可以从request中取出微信服务器发来的消息；
		// 而通过response我们可以对接收到的消息进行响应，即发送消息。
		// 将请求、响应的编码均设置为UTF-8（防止中文乱码）
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");

		// 调用核心业务类接收消息、处理消息
		String respMessage = CoreService.processRequest(request);

		// 响应消息
		PrintWriter out = response.getWriter();
		out.print(respMessage);
		out.close();
	}

	public void init() throws ServletException {
	}
}
