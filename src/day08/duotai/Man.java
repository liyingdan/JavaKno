package day08.duotai;

public class Man extends Person{
	 boolean smoking;
	 int id = 1002;
	public Man() {
		super();
	}
	
	public Man(boolean smoking) {
		super();
		this.smoking = smoking;
	}

	public boolean isSmoking() {
		return smoking;
	}

	public void setSmoking(boolean smoking) {
		this.smoking = smoking;
	}
	
	public void walk(){
		System.out.println("���˱�ͦ����·");
	}
	public void eat(){
		System.out.println("����Ӧ�ö���⣡");
	}
	
	public void entertainment(){
		System.out.println("�������");
	}
}
