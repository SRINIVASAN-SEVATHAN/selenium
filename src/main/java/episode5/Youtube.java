package episode5;

public class Youtube 
{
public static void main(String[] args) {
Youtube dt = new Youtube();
dt.deletedvideo("srinivasan");
dt.deletedvideo(12345);

}
	
public void createvideo()
{
	System.out.println("video created");
}

private void deletedvideo(String videoID)
{ 
	System.out.println("Deleted Video - "  + videoID);
}

private void deletedvideo(int number)
{ 
	System.out.println("Number - "  + number);
}

private boolean uploadvideo()
{
	System.out.println("uploading");
	return true;
}

public String sharevideo()
{
	return "Facebook";
}

}