
public abstract class Animal {
    public abstract String toString();
    public void help(Animal o) {
        System.out.println(this + " helps " + o);
    }
    
    public static void main(String[] args) {
    	Animal c = new Cat();
    	Animal k = new Kitten();
    	c.help(k);
	}
}




