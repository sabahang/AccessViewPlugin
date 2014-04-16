package com.sabahang.plugins;

/**
 * Created by hesamyou on 4/15/2014.
 */

import com.atlassian.confluence.core.ConfluenceActionSupport;
import com.atlassian.confluence.spaces.SpaceManager;

public class ViewAccessAction extends ConfluenceActionSupport {

    String myText = "show me";

    public String getMyText() {
        return myText;
    }

    @Override

    public String execute() throws Exception {
        return SUCCESS;
    }

}
