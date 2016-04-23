
public class Master {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.setName("Íú²Æ");
		d.setAge(4); 
		d.sleep();
		String dz = d.bark();
        System.out.println(dz);
        d.eat(5);

        Cat cat = new Cat();
        
        Master m = new Master();
        String userName = "ÕÅÈý";
        m.sayHello(userName);
        System.out.println(userName);
	}

	public  String sayHello(String name){
		name = "hello" + name;
		return name;
	}
}
