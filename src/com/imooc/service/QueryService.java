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
		List<Message> messageList = dao.queryMessage(command, null);
		if (messageList.size() > 0) {
			return messageList.get(0).getContent();
		}
		return com.imooc.util.Iconst.NO_MACTHING__CONTENT;
	}
	
}