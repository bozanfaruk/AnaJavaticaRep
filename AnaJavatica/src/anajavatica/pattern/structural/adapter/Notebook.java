package anajavatica.pattern.structural.adapter;

public class Notebook {

	private IUsb usb = null;

	public void plugUsb(IUsb usb) {
		this.usb = usb;
	}

	public IUsb getUsb() {
		return usb;
	}
}
