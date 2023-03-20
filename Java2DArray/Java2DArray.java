package Java2DArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Java2DArray {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(
										new InputStreamReader(System.in));
		List<List<Integer>> arr = new ArrayList<>();
		for(int i = 0; i<6;i++) {
			String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split("");
			List<Integer> arrRowItemps = new ArrayList<>();
			for(int j =0; j<6;j++) {
				int arrItem = Integer.parseInt(arrRowTempItems[j]);
				arrRowItemps.add(arrItem);
			}
			arr.add(arrRowItemps);
		}
		bufferedReader.close();
	}
}
