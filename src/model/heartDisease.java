package model;

import org.jsefa.csv.annotation.CsvDataType;
import org.jsefa.csv.annotation.CsvField;

@CsvDataType()
public class heartDisease extends inputData {
	@CsvField(pos = 1)
	String age;

	@CsvField(pos = 2)
	String gender;

	@CsvField(pos = 3)
	String cp;

	@CsvField(pos = 4)
	String trestbps;

	@CsvField(pos = 5)
	String chol;

	@CsvField(pos = 6)
	String fbs;

	@CsvField(pos = 7)
	String restecg;

	@CsvField(pos = 8)
	String thalach;

	@CsvField(pos = 9)
	String exang;

	@CsvField(pos = 10)
	String oldpeak;

	@CsvField(pos = 11)
	String dlope;

	@CsvField(pos = 12)
	String ca;

	@CsvField(pos = 13)
	String thal;

	@CsvField(pos = 14)
	String classCondition;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "heartDisease [age=" + age + ", gender=" + gender + ", cp=" + cp + ", trestbps=" + trestbps + ", chol="
				+ chol + ", fbs=" + fbs + ", restecg=" + restecg + ", thalach=" + thalach + ", exang=" + exang
				+ ", oldpeak=" + oldpeak + ", dlope=" + dlope + ", ca=" + ca + ", thal=" + thal + ", classCondition="
				+ classCondition + "]";
	}

	/**
	 * @return the age
	 */
	public Double getAge() {
		return stringToDouble(age);
	}

	/**
	 * @return the gender
	 */
	public Double getGender() {
		return stringToDouble(gender);
	}

	/**
	 * @return the cp
	 */
	public Double getCp() {
		return stringToDouble(cp);
	}

	/**
	 * @return the trestbps
	 */
	public Double getTrestbps() {
		return stringToDouble(trestbps);
	}

	/**
	 * @return the chol
	 */
	public Double getChol() {
		return stringToDouble(chol);
	}

	/**
	 * @return the fbs
	 */
	public Double getFbs() {
		return stringToDouble(fbs);
	}

	/**
	 * @return the restecg
	 */
	public Double getRestecg() {
		return stringToDouble(restecg);
	}

	/**
	 * @return the thalach
	 */
	public Double getThalach() {
		return stringToDouble(thalach);
	}

	/**
	 * @return the exang
	 */
	public Double getExang() {
		return stringToDouble(exang);
	}

	/**
	 * @return the oldpeak
	 */
	public Double getOldpeak() {
		return stringToDouble(oldpeak);
	}

	/**
	 * @return the dlope
	 */
	public Double getDlope() {
		return stringToDouble(dlope);
	}

	/**
	 * @return the ca
	 */
	public Double getCa() {
		return stringToDouble(ca);
	}

	/**
	 * @return the thal
	 */
	public Double getThal() {
		return stringToDouble(thal);
	}

	/**
	 * @return the classCondition
	 */
	public Double getClassCondition() {
		return stringToDouble(classCondition);
	}
}