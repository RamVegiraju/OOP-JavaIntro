
public class Cat extends Animal {
    public String toString() {
        return "Cat";
    }
    public void help(Animal o) {
        System.out.println(this + " ignores " + o);
    }
    
    public static void main(String[] args) {
    	Cat c = new Kitten();
    	c.play();
	}
}
