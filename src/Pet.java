
public class Pet {

	private int age;
	private String name;
	
	public void sleep(){
		System.out.println(name+"˯��");
	}
	public  String bark(){
		return "����";
	}
	public void eat(int num){
		System.out.println(name+"����"+num+"����");
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>20||age<0){
			System.out.println("��������");
		}else
		this.age = age;
	}
	public String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	
	

}
