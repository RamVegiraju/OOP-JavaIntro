
public class SimpleCalculator {
	
	private double firstNumber;
	private double secondNumber;
	
	/**
	 * @return the firstNumber
	 */
	public double getFirstNumber() {
		return firstNumber;
	}
	/**
	 * @param firstNumber the firstNumber to set
	 */
	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}
	/**
	 * @return the secondNumber
	 */
	public double getSecondNumber() {
		return secondNumber;
	}
	/**
	 * @param secondNumber the secondNumber to set
	 */
	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	public double getAdditionResult() {
		return (this.firstNumber + this.secondNumber);
	}
	
	public double getSubtractionResult() {
		return (this.firstNumber - this.secondNumber);
	}
	
	public double getMultiplicationResult() {
		return (this.firstNumber * this.secondNumber);
	}
	
	public double getDivisionResult() {
		if (this.secondNumber == 0.0) {
			return 0.0;
		}else
			return (this.firstNumber/this.secondNumber);
	}
	
	

}
