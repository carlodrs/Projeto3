package com.ssj.servlet.tiles;

import com.opensymphony.xwork2.ActionInvocation;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.ServletDispatcherResult;
import org.apache.tiles.TilesContainer;
import org.apache.tiles.access.TilesAccess;
import org.apache.tiles.request.ApplicationContext;
import org.apache.tiles.request.servlet.ServletRequest;
import org.apache.tiles.request.servlet.ServletUtil;

/**
 * Tiles result class used by jsp tiles directive on the struts.xml
 * Tiles 3 and Struts 2 not worked well because the container struts 2 look by
 * the old version (Tiles 2)
 * 
 * @author Carlos Silva
 * @since 2013
 * @see TilesResult, ServletDispatcherResult
 * @version 1.0
 * */
public class TilesResult extends ServletDispatcherResult {

    /**
	 * Version id
	 */
	private static final long serialVersionUID = 9063213160427886690L;

	public TilesResult() {
        super();
    }

    public TilesResult(String location) {
        super(location);
    }

    @Override
    public void doExecute(String location, ActionInvocation invocation) throws Exception {
        setLocation(location);
        ServletContext context = ServletActionContext.getServletContext();
        ApplicationContext applicationContext = ServletUtil.getApplicationContext(context);
        TilesContainer container = TilesAccess.getContainer(applicationContext);
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpServletResponse response = ServletActionContext.getResponse();
        ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
        container.render(location, servletRequest);
    }
}