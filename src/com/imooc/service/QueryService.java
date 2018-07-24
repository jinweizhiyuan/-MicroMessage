/**
 * 
 */
/**
 * @author hqlip
 *
 */
package com.imooc.service;

import java.util.List;

import com.imooc.bean.Message;
import com.imooc.dao.MessageDao;
import com.imooc.util.Iconst;

public class QueryService {
	
	public List<Message> queryMessageList(String command, String description) {
		MessageDao dao = new MessageDao();
		return dao.queryMessage(command, description);
	}
	
	public List<Message> queryMessageList2(String command, String description) {
		MessageDao dao = new MessageDao();
		return dao.queryMessage2(command, description);
	}
	
	public String queryByCommand(String command) {
		MessageDao dao = new MessageDao();
		List<Message> messageList;
		if (Iconst.HELP_COMMAND.equals(command)) {
			messageList = dao.queryMessage(null, null);
			StringBuilder result = new StringBuilder();
			for (int i = 0; i < messageList.size(); i++) {
				result.append("回复：[" + messageList.get(i).getCommand() + "]可能查看" + messageList.get(i).getContent() + "<br />");
			}
			return result.toString();
		}
		messageList = dao.queryMessage(command, null);
		if (messageList.size() > 0) {
			return messageList.get(0).getContent();
		}
		return com.imooc.util.Iconst.NO_MACTHING__CONTENT;
	}
	
}