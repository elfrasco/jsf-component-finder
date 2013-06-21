package ar.com.blogspot.elblogdelfrasco.jsf.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;

import ar.com.blogspot.elblogdelfrasco.jsf.util.JSFComponentFinder;

@ManagedBean(name = "componentFinder")
@RequestScoped
public class ComponentFinder implements Serializable {

	private static final long serialVersionUID = 8027702880781827447L;

	private String componentId;
	
	private String result;
	
	public void find() {
		UIComponent component = JSFComponentFinder.findComponentInRoot(componentId);
		result = (component == null) ? "Component not found. Try again!" : component.getClientId();
	}

	public String getComponentId() {
		return componentId;
	}

	public void setComponentId(String componentId) {
		this.componentId = componentId;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
}
