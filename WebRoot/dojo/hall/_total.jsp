<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%
	String applicationDataKey = "room" + request.getParameter("id");
	Map gameInformation = (Map) application
			.getAttribute(applicationDataKey);
	List retail = null;
	List wholesale = null;
	List producer = null;
	if (gameInformation != null) {
		retail = (List) gameInformation.get("retail");
		wholesale = (List) gameInformation.get("wholesale");
		producer = (List) gameInformation.get("producer");
		if (retail != null && wholesale != null && producer != null)
			out.print(retail.size() + wholesale.size() + producer.size());
	}
%>