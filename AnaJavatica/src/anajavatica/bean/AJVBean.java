package anajavatica.bean;

import java.awt.Color;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.beans.VetoableChangeSupport;
import java.io.Serializable;

public class AJVBean implements Serializable, PropertyChangeListener, VetoableChangeListener {

	private static final long serialVersionUID = 1L;
	private int width = 1024;
	private Color beanColor = null;
	private PropertyChangeSupport pcs = new PropertyChangeSupport(this);
	private VetoableChangeSupport vcs = new VetoableChangeSupport(this);

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) throws PropertyVetoException {
		vetoableChange(new PropertyChangeEvent(this, "Width", this.width, width));
		this.width = width;
	}

	public Color getBeanColor() {
		return beanColor;
	}

	public void setBeanColor(Color beanColor) {
		propertyChange(new PropertyChangeEvent(this, "BeanColor", this.beanColor, beanColor));
		this.beanColor = beanColor;
	}

	public void addPropertyChangeListener(PropertyChangeListener listener) {
		pcs.addPropertyChangeListener(listener);
	}

	public void addVetoableChangeListener(VetoableChangeListener listener) {
		vcs.addVetoableChangeListener(listener);
	}

	@Override
	public void vetoableChange(PropertyChangeEvent evt) throws PropertyVetoException {
		switch (evt.getPropertyName()) {
		case "Width":
			if ((Integer) evt.getNewValue() < 100)
				throw new PropertyVetoException("Width can not be less than 100", evt);
			break;
		}
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		switch (evt.getPropertyName()) {
		case "BeanColor":
			System.out.println("Bean color changed from " + evt.getOldValue() + " to " + evt.getNewValue());
			break;
		}
	}

}
