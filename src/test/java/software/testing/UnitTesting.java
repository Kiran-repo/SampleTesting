package software.testing;

public class UnitTesting {

	// Public method accessible from anywhere
	public void popularFrameworks() {
		System.out.println("Popular unit testing frameworks: JUnit, NUnit, TestNG.");
	}

	// Protected method accessible within the package and subclasses
	protected void assertions() {
		System.out.println("Common assertions used: assertEquals, assertTrue, assertFalse.");
	}

	// Default access method (package-private) accessible only within the package
	void mockingLibraries() {
		System.out.println("Popular mocking libraries: Mockito, JMock, EasyMock.");
	}

	// Private method accessible only within this class
	private void testDrivenDevelopment() {
		System.out.println("Test-Driven Development (TDD) emphasizes writing tests before code.");
	}

	// Public method
	public void continuousIntegration() {
		System.out.println("Integrate unit tests in CI/CD pipelines using tools like Jenkins, Travis CI.");
	}

	// Protected method
	protected void codeCoverage() {
		System.out.println("Code coverage tools: JaCoCo, Cobertura, Istanbul.");
	}

	// Default access method
	void refactoring() {
		System.out.println("Refactoring unit tests for maintainability and readability.");
	}

	// Private method
	private void bestPractices() {
		System.out.println("Best practices include testing edge cases and writing meaningful test names.");
	}

	// Public method
	public void performanceConsiderations() {
		System.out.println("Ensure unit tests run quickly to maintain development speed.");
	}

	// Public method
	public void integratingWithBuildTools() {
		System.out.println("Integrate unit tests with build tools like Maven and Gradle.");
	}
}
