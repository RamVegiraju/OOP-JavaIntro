import java.util.TreeMap;

public class Zoo {
	
	TreeMap<String, Integer> myZoo = new TreeMap<String, Integer>(); 
    public Zoo(TreeMap<String, Integer> myZoo) {
           this.myZoo = myZoo;
    }
    public String toString() {
           String ret = "";
           for(String key : myZoo.keySet()) {
                 ret = ret + myZoo.get(key) + " ";
           }
           return ret;
    } 

	public static void main(String[] args) {
		TreeMap<String, Integer> zooAnimals = new TreeMap<String, Integer>();
		zooAnimals.put("Tiger", 5);
		zooAnimals.put("Zebra", 12);
		zooAnimals.put("Elephant", 8);
		Zoo virginiaZoo = new Zoo(zooAnimals);
		System.out.println(virginiaZoo);

	}

}
