
class Movie {
	private String name;
	
	public Movie(String name) {
		this.name = name;
	}
	
	public String plot() {
		return "No plot here";
	}
}


class Jaws extends Movie {
	public Jaws() {
		//initializing name field using inheritance
		super("Jaws");
	}
	
	public String plot() {
		return "A shark eats lots of people";
	}
}

class IndependenceDay extends Movie {
	
	public IndependenceDay() {
		super("Independence Day");
	}
	
	@Override
	public String plot() {
		return "Aliens attempt to take over planet earth";
	}
}

class MazeRunner extends Movie {
	public MazeRunner() {a
		super("Maze Runner");
	}
	
	@Override
	public String plot() {
		return "Kids try and escape a maze.";
	}
}

class StarWars extends Movie {
	public StarWars() {
		super("Star Wars");
	}
	
	@Override
	public String plot() {
		return "
	}
}


public class Main {
	
	
	public static void main(String[] args) {
		
	}

}
