package model;

import org.jsefa.csv.annotation.CsvDataType;
import org.jsefa.csv.annotation.CsvField;

@CsvDataType()
public class iris extends inputData{

	@CsvField(pos = 1)
	float sepalLength;

	@CsvField(pos = 2)
	float sepalWidth;

	@CsvField(pos = 3)
	float petalLength;

	@CsvField(pos = 4)
	float petalWidth;
	
	@CsvField(pos = 5)
	String classCondition;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "iris [sepalLength=" + sepalLength + ", sepalWidth=" + sepalWidth + ", petalLength=" + petalLength
				+ ", petalWidth=" + petalWidth + ", classCondition=" + classCondition + "]";
	}
}
