public class Main {

	public static void main(String[] args) {
		Image image = new Image("aile-fotografim", "JPG");
		
		JPEGHandler jpegHandler = new JPEGHandler();
		JPGHandler jpgHandler = new JPGHandler();
		CustomHandler customHandler = new CustomHandler();
		
		
		jpegHandler.setNextHandler(jpgHandler);
		jpgHandler.setNextHandler(customHandler);
		
		jpegHandler.handleRequest(image);

	}

}
