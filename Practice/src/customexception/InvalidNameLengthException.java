package customexception;

public class InvalidNameLengthException extends RuntimeException
{
	
	private static final long serialVersionUID = 1L;

	public InvalidNameLengthException()
	{
		
	}
	
	public InvalidNameLengthException(String msg)
	{
		super(msg);
	}
}
