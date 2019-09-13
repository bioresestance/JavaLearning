package bromma.aaron;

public class TestingClass {
	
	
	/**
	 * @param testVar
	 * @param testVar1
	 * @param testVar2
	 * @param testVar3
	 */
	public TestingClass(int testVar, int testVar1, int testVar2, int testVar3) {
		super();
		this.testVar = testVar;
		this.testVar1 = testVar1;
		this.testVar2 = testVar2;
		this.testVar3 = testVar3;
	}

	public TestingClass(int testVar) {
		super();
		this.testVar = testVar;
	}

	private int testVar;
	private int testVar1;
	private int testVar2;
	private int testVar3;

	/**
	 * @return the testVar1
	 */
	public int getTestVar1() {
		return testVar1;
	}

	/**
	 * @param testVar1 the testVar1 to set
	 */
	public void setTestVar1(int testVar1) {
		this.testVar1 = testVar1;
	}

	/**
	 * @return the testVar2
	 */
	public int getTestVar2() {
		return testVar2;
	}

	/**
	 * @param testVar2 the testVar2 to set
	 */
	public void setTestVar2(int testVar2) {
		this.testVar2 = testVar2;
	}

	/**
	 * @return the testVar3
	 */
	public int getTestVar3() {
		return testVar3;
	}

	/**
	 * @param testVar3 the testVar3 to set
	 */
	public void setTestVar3(int testVar3) {
		this.testVar3 = testVar3;
	}

	public int getTestVar() {
		return testVar;
	}

	public void setTestVar(int testVar) {
		this.testVar = testVar;
	}

}
