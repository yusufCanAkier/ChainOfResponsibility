
class JPGHandler extends BaseHandler {

	public void handleRequest(Image image) {
		if(image.extension == "JPG") {
			System.out.println("JPG to PNG");
		}
		else
		{
			_nextHandler.handleRequest(image);
		}
		
	}

}
