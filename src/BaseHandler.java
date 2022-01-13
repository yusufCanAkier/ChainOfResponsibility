

public abstract class BaseHandler {
	protected BaseHandler _nextHandler;
	public void setNextHandler(BaseHandler nextHandler)
	{
		this._nextHandler = nextHandler;
	}

	public abstract void handleRequest(Image image);
}
