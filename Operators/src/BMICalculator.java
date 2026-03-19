
public class BMICalculator {
	public static void main(String[] args) {
//		bmi = weight in kg / (height * height)

		double height = 5.6;
		double weight = 83;

		double heightInMeters = height * 0.4536;

		double bmi = weight / (heightInMeters * heightInMeters);

		System.out.printf("The BMI is: %.2f%n", bmi);
	}

}
