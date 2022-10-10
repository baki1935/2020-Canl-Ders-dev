
public class Plywood {
	
	
	public Plywood(int bigPlywoodWide, int bigPlywoodLong, int smallPlywoodWide, int smallPlywoodLong) {
		
		BigPlywoodWide = bigPlywoodWide;
		BigPlywoodLong = bigPlywoodLong;
		SmallPlywoodWide = smallPlywoodWide;
		SmallPlywoodLong = smallPlywoodLong;
	}
	
	public Plywood() {
		
	}

	int BigPlywoodWide = 250;
	int BigPlywoodLong = 300;
	int SmallPlywoodWide= 125;
	int SmallPlywoodLong= 200;
	
	public int getBigPlywoodWide() {
		return BigPlywoodWide;
	}

	public void setBigPlywoodWide(int bigPlywoodWide) {
		BigPlywoodWide = bigPlywoodWide;
	}

	public int getBigPlywoodLong() {
		return BigPlywoodLong;
	}

	public void setBigPlywoodLong(int bigPlywoodLong) {
		BigPlywoodLong = bigPlywoodLong;
	}

	public int getSmallPlywoodWide() {
		return SmallPlywoodWide;
	}

	public void setSmallPlywoodWide(int smallPlywoodWide) {
		SmallPlywoodWide = smallPlywoodWide;
	}

	public int getSmallPlywoodLong() {
		return SmallPlywoodLong;
	}

	public void setSmallPlywoodLong(int smallPlywoodLong) {
		SmallPlywoodLong = smallPlywoodLong;
	}

}
