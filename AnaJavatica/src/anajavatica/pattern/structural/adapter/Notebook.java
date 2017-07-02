package anajavatica.pattern.structural.adapter;

@SuppressWarnings("javadoc")
public class Notebook {

	private IUsb usb = null;

	public void plugUsb(IUsb usb) {
		this.usb = usb;
	}

	public IUsb getUsb() {
		return usb;
	}
}
