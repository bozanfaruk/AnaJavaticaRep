package anajavatica.pattern.structural.adapter;

public class SdAdapter implements IUsb {

	private ISd sdCard = null;

	public SdAdapter(String sdType) {
		initializeSdCard(sdType);
	}

	private void initializeSdCard(String sdType) {
		switch (sdType) {
		case ISd.MICRO_SD:
			sdCard = new MicroSD();
			break;
		case ISd.SD:
			sdCard = new Sd();
			break;
		}
	}

	public ISd getSdCard() {
		return sdCard;
	}

	@Override
	public String getData() {
		if (getSdCard() != null)
			return getSdCard().readData();
		else
			return "Indalid sd type";
	}

}
