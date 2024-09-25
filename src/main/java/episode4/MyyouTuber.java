package episode4;

public class MyyouTuber {

	public static void main(String[] args) {
		
		Youtube yt = new Youtube();
		yt.createvideo();
		String shared = yt.sharevideo();
		System.out.println(shared);
		
				

	}

}
