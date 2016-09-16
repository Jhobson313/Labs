
public class BootCampStudents {

		private String name;
		private String bootcamp;
		private int ID;
		
		public BootCampStudents(String name, String bootcamp,int ID) {
			this.name = name;
			this.bootcamp = bootcamp;
			this.ID = ID;
		}
		public void setbootcamp(String bootcamp) {
			this.bootcamp = bootcamp;
		}
		public void setname(String name) {
			this.name = name;
		}
		public void setID(int ID) {
			this.ID = ID;
		}
		public String getname() {
			return name;
		}
		public String getbootcamp() {
			return bootcamp;
		}
		public int getID() {
			return ID;
		}
	}


