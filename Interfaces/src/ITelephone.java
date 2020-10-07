
public interface ITelephone {
	
	//defining the methods that a class has to implement
	//the code is written in the class
	//do not need to specify the access modifier for public vs private
	void powerOn();
	void dial(int phoneNumber);
	void answer();
	boolean callPhone(int phoneNumber);
	boolean isRinging();

}
