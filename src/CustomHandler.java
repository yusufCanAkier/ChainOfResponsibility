
public class CustomHandler extends BaseHandler {

	@Override
	public void handleRequest(Image image) {
		if(image.extension == "OtherExtension") {
			System.out.println("OtherExtension to PNG");
		}
	}

}
