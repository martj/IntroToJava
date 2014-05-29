public class Student {
	static int count=0;
	private String fName = new String();
	private String sName = new String();
	private String lName = new String();
	private String speciality = new String();
	private String university = new String();
	private String mail = new String();
	private int year;
	private int telNumb;

	
	public void studentInfo(Student student){
		System.out.println(student.getfName());
		System.out.println(student.getsName());
		System.out.println(student.getlName());
		System.out.println(student.getSpeciality());
		System.out.println(student.getUniversity());
		System.out.println(student.getMail());
		System.out.println(student.getYear());
		System.out.println(student.getTelNumb());
		
	}
	
	public Student(String fName, String sName, String lName, String speciality, String university,
			String mail, int year, int telNumb){
		this.setfName(fName);
		this.setsName(sName);
		this.setlName(lName);
		this.setSpeciality(speciality);
		this.setUniversity(university);
		this.setMail(mail);
		this.setYear(year);
		this.setTelNumb(telNumb);
		count ++;
	}
	
	public Student(String fName, String sName, String lName, int telNumb){
		this.setfName(fName);
		this.setsName(sName);
		this.setlName(lName);
		this.setSpeciality(null);
		this.setUniversity(null);
		this.setMail(null);
		this.setYear(0);
		this.setTelNumb(telNumb);
		count ++;
	}
	public Student(){
		this.setfName(null);
		this.setsName(null);
		this.setlName(null);
		this.setSpeciality(null);
		this.setUniversity(null);
		this.setMail(null);
		this.setYear(0);
		this.setTelNumb(0);
		count ++;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTelNumb() {
		return telNumb;
	}

	public void setTelNumb(int telNumb) {
		this.telNumb = telNumb;
	}
}
