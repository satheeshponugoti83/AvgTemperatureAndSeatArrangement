
public class AvgTemperatureTest {

	public static void main(String args[]) {
		AvgTemperatureTest AVT = new AvgTemperatureTest();
		AVT.testAndPrintAvgTemp();
	}

	public void testAndPrintAvgTemp() {
		AvgTemperatureCalc atc = new AvgTemperatureCalc();
		int[][] temps = { { 1, 10000, 40 }, { 1, 10002, 45 }, { 1, 11015, 50 }, { 2, 10005, 42 }, { 2, 11051, 45 },
				{ 2, 12064, 42 }, { 2, 13161, 42 } };
		int sec = 1;
		int min = 10000;
		int max = 10999;

		atc.CalculateAvgTemp(temps, sec, min, max);

		int sec1 = 1;
		int min1 = 11000;
		int max1 = 11999;

		atc.CalculateAvgTemp(temps, sec1, min1, max1);

		int sec2 = 2;
		int min2 = 10000;
		int max2 = 10999;

		atc.CalculateAvgTemp(temps, sec2, min2, max2);

		int sec3 = 2;
		int min3 = 11000;
		int max3 = 11999;

		atc.CalculateAvgTemp(temps, sec3, min3, max3);

		int sec4 = 2;
		int min4 = 12000;
		int max4 = 12999;

		atc.CalculateAvgTemp(temps, sec4, min4, max4);

		int sec5 = 2;
		int min5 = 13000;
		int max5 = 13999;

		atc.CalculateAvgTemp(temps, sec5, min5, max5);

	}

}
