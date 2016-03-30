package model;

import org.jsefa.csv.annotation.CsvDataType;
import org.jsefa.csv.annotation.CsvField;

@CsvDataType()
public class wine extends inputData{
	
	@CsvField(pos = 1)
	int classCondition;
	
	@CsvField(pos = 2)
	float alcohol;
	
	@CsvField(pos = 3)
	float malicAcid;
	
	@CsvField(pos = 4)
	float ash;
	
	@CsvField(pos = 5)
	float alcalinity;
	
	@CsvField(pos = 6)
	float magnesium;
	
	@CsvField(pos = 7)
	float totalPhenols;
	
	@CsvField(pos = 8)
	float flavanoids;
	
	@CsvField(pos = 9)
	float nonflavnoid;
	
	@CsvField(pos = 10)
	float proanthocyanins;
	
	@CsvField(pos = 11)
	float colorIntensity;
	
	@CsvField(pos = 12)
	float hue;
	
	@CsvField(pos = 13)
	float od280;
	
	@CsvField(pos = 14)
	float proline;
}
