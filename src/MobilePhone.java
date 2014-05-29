public class MobilePhone {
	private Battery battery = new Battery();
	private Screen screen = new Screen();
	private String model = new String();
	private String producer = new String();
	private int price;
	private String owner = new String();

	/* ........................................................................ */

	public MobilePhone(String model, String producer, int price, String owner) {
		this.setModel(model);
		this.setOwner(owner);
		this.setPrice(price);
		this.setProducer(producer);
		this.setScreen(null);
		this.setBattery(null);
	}

	public MobilePhone() {
	}

	/* ........................................................................ */
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Battery getBattery() {
		return battery;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	/* ............................................................... */
	public class Battery {
		private String battModel = new String();
		private int idleTime;
		private int hoursTalk;

		public Battery(String model, int idleTime, int hoursTalk) {
			this.battModel = model;
			this.idleTime = idleTime;
			this.hoursTalk = hoursTalk;
		}

		public Battery() {
			this.battModel = null;
			this.idleTime = 0;
			this.hoursTalk = 0;
		}

		public int getHoursTalk() {
			return hoursTalk;
		}

		public void setHoursTalk(int hoursTalk) {
			this.hoursTalk = hoursTalk;
		}

		public int getIdleTime() {
			return idleTime;
		}

		public void setIdleTime(int idleTime) {
			this.idleTime = idleTime;
		}

		public String getBattModel() {
			return battModel;
		}

		public void setBattModel(String battModel) {
			this.battModel = battModel;
		}

	}

	/*
	 * ...........................................................................
	 * ....
	 */
	public class Screen {
		private int screenSize;
		private int colours;

		public Screen(int size, int colours) {
			this.colours = colours;
			this.screenSize = size;
		}

		public Screen() {
			this.colours = 0;
			this.screenSize = 0;
		}

		public int getScreenSize() {
			return screenSize;
		}

		public void setScreenSize(int screenSize) {
			this.screenSize = screenSize;
		}

		public int getColours() {
			return colours;
		}

		public void setColours(int colours) {
			this.colours = colours;
		}
	}

	public static void main(String[] args) {
		MobilePhone test = new MobilePhone();
		System.out.println(test.getPrice());
	}
}
