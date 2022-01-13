
public class JPEGHandler extends BaseHandler {

	public void handleRequest(Image image) {

		if (image.extension == "JPEG") {
			System.out.println("JPEG to PNG");
		}
		else
		{
			_nextHandler.handleRequest(image);
		}
		
	}
	

}
