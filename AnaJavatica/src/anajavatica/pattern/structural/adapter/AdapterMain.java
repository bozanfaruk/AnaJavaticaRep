package anajavatica.pattern.structural.adapter;

@SuppressWarnings("javadoc")
public class AdapterMain {

	public static void main(String[] args) {

		IUsb microSd = new SdAdapter(ISd.MICRO_SD);
		IUsb sd = new SdAdapter(ISd.SD);
		IUsb invalid = new SdAdapter("Invalid");

		Notebook notebook = new Notebook();
		notebook.plugUsb(microSd);
		System.out.println(notebook.getUsb().getData());

		notebook.plugUsb(sd);
		System.out.println(notebook.getUsb().getData());

		notebook.plugUsb(invalid);
		System.out.println(notebook.getUsb().getData());

	}

}
