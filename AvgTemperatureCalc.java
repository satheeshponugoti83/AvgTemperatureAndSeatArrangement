
public class AvgTemperatureCalc {
	
 public AvgTemperatureCalc() {
	 
 }
 
 public void CalculateAvgTemp(int[][] temps, int sec, int min, int max) {
		double sum = 0;
		int devide = 0;
		for (int i = 0; i < temps.length; i++) {
			int[] values = temps[i];
			if (sec == values[0] && (values[1] >= min && values[1] <= max)) {
				sum += values[2];
				devide++;
			}

		}
		System.out.println(sec + " " + min + "-" + max + " " + sum / devide);
		System.out.println();
	}


}
