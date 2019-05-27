package day08.duotai;

public class Woman extends Person{
	private boolean isBeauty;

	public boolean isBeauty() {
		return isBeauty;
	}

	public void setBeauty(boolean isBeauty) {
		this.isBeauty = isBeauty;
	}

	public Woman() {
		super();
	}

	public Woman(boolean isBeauty) {
		super();
		this.isBeauty = isBeauty;
	}
	public void walk(){
		System.out.println("Ů�������·������");
	}
	
	public void eat(){
		System.out.println("Ů��Ӧ���ٳԣ�����");
	}
	public void shopping(){
		System.out.println("Ů�˰�����");
	}
	
}
