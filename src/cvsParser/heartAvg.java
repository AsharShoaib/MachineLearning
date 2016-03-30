package cvsParser;

public class heartAvg {
	
	Double age;

	Double gender;

	Double cp;

	Double trestbps;

	Double chol;

	Double fbs;

	Double restecg;

	Double thalach;

	Double exang;

	Double oldpeak;

	Double dlope;

	Double ca;

	Double thal;
	
	/**
	 * @param age
	 * @param gender
	 * @param cp
	 * @param trestbps
	 * @param chol
	 * @param fbs
	 * @param restecg
	 * @param thalach
	 * @param exang
	 * @param oldpeak
	 * @param dlope
	 * @param ca
	 * @param thal
	 */
	public heartAvg(Double age, Double gender, Double cp, Double trestbps, Double chol, Double fbs, Double restecg,
			Double thalach, Double exang, Double oldpeak, Double dlope, Double ca, Double thal) {
		super();
		this.age = age;
		this.gender = gender;
		this.cp = cp;
		this.trestbps = trestbps;
		this.chol = chol;
		this.fbs = fbs;
		this.restecg = restecg;
		this.thalach = thalach;
		this.exang = exang;
		this.oldpeak = oldpeak;
		this.dlope = dlope;
		this.ca = ca;
		this.thal = thal;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "heartAvg [age=" + age + ", gender=" + gender + ", cp=" + cp + ", trestbps=" + trestbps + ", chol="
				+ chol + ", fbs=" + fbs + ", restecg=" + restecg + ", thalach=" + thalach + ", exang=" + exang
				+ ", oldpeak=" + oldpeak + ", dlope=" + dlope + ", ca=" + ca + ", thal=" + thal + "]";
	}


}
