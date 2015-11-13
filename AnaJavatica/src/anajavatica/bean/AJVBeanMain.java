package anajavatica.bean;

import java.awt.Color;
import java.beans.PropertyVetoException;

public class AJVBeanMain {

	public static void main(String[] args) throws PropertyVetoException {

		AJVBean bean = new AJVBean();
		bean.addPropertyChangeListener(bean);
		bean.addVetoableChangeListener(bean);

		bean.setBeanColor(Color.BLUE);
		bean.setBeanColor(Color.BLACK);

		bean.setWidth(150);
		bean.setWidth(12);

	}

}
