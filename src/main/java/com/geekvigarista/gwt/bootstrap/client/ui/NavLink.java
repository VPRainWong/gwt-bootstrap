package com.geekvigarista.gwt.bootstrap.client.ui;

import com.geekvigarista.gwt.bootstrap.client.ui.base.IconAnchor;
import com.geekvigarista.gwt.bootstrap.client.ui.resources.Bootstrap;
import com.google.gwt.user.client.ui.HasText;

/**
 * A Link in the Navbar.
 * 
 * @author Dominik Mayer
 */
public class NavLink extends ListItem implements HasText {

	private final IconAnchor anchor = new IconAnchor();

	public NavLink() {
		super.add(anchor);
	}
	
	public NavLink(String text) {
		this();
		anchor.setText(text);
	}

	public NavLink(String text, String href) {
		this();
		setText(text);
		setHref(href);
	}
	
	public void setHref(String href) {
		anchor.getElement().setAttribute("href", href);
	}
	
	public void setText(String text) {
		anchor.setText(text);
	}

	public String getText() {
		return anchor.getText();
	}
	
    public void setIcon(String iconname) {
    	anchor.setIcon(iconname);
    }
    
    public void setActive(boolean active) {
    	if (active)
    		addStyleName(Bootstrap.active);
    	else
    		removeStyleName(Bootstrap.active);
    }
    
    public void setDisabled(boolean disabled) {
    	if (disabled)
    		addStyleName(Bootstrap.disabled);
    	else
    		removeStyleName(Bootstrap.disabled);
    }
    
//    //TODO
//    public void setAlignment(String alignment) {
//    	if (alignment.equalsIgnoreCase("right")) {
//    		addStyleName(Bootstrap.pull_right);
//    		removeStyleName(Bootstrap.pull_left);
//    		
//    	} else if (alignment.equalsIgnoreCase("left")) {
//    		addStyleName(Bootstrap.pull_left);
//    		removeStyleName(Bootstrap.pull_right);
//    	}
//    }
}
