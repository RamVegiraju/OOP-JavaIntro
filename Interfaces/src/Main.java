
public class Main {

	public static void main(String[] args) {
		//cannot do
		// ITelephone timsPhone = new ITelephone(123456);
		//interface is at an abstract level to say what methods are valid
		//cannot instantiate a ITelephone
		ITelephone timsPhone;
		timsPhone = new DeskPhone(123456);
		timsPhone.powerOn();
		timsPhone.callPhone(123456);
		timsPhone.answer();
		
		//set same instance as a completely different classes
		timsPhone = new MobilePhone(24565);
		timsPhone.callPhone(24565);
		timsPhone.answer();

	}

}
