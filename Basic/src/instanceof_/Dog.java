package instanceof_;

public class Dog extends Animal {

	String talk;

	public Dog() {

	}

	public Dog(String talk) {
		this.talk = talk;
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, String talk) {
		super(name);
		this.talk = talk;
	}

	public String getTalk() {
		return talk;
	}

	public void setTalk(String talk) {
		this.talk = talk;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

}
