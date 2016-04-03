package cvsParser;
public class heartAvg {
	
	private Double age;

	private Double gender;

	private Double cp;

	private Double trestbps;

	private Double chol;

	private Double fbs;

	private Double restecg;

	private Double thalach;

	private Double exang;

	private Double oldpeak;

	private Double dlope;

	private Double ca;

	private Double thal;
	
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

	/**
	 * @return the age
	 */
	public Double getAge() {
		return age;
	}

	/**
	 * @return the gender
	 */
	public Double getGender() {
		return gender;
	}

	/**
	 * @return the cp
	 */
	public Double getCp() {
		return cp;
	}

	/**
	 * @return the trestbps
	 */
	public Double getTrestbps() {
		return trestbps;
	}

	/**
	 * @return the chol
	 */
	public Double getChol() {
		return chol;
	}

	/**
	 * @return the fbs
	 */
	public Double getFbs() {
		return fbs;
	}

	/**
	 * @return the restecg
	 */
	public Double getRestecg() {
		return restecg;
	}

	/**
	 * @return the thalach
	 */
	public Double getThalach() {
		return thalach;
	}

	/**
	 * @return the exang
	 */
	public Double getExang() {
		return exang;
	}

	/**
	 * @return the oldpeak
	 */
	public Double getOldpeak() {
		return oldpeak;
	}

	/**
	 * @return the dlope
	 */
	public Double getDlope() {
		return dlope;
	}

	/**
	 * @return the ca
	 */
	public Double getCa() {
		return ca;
	}

	/**
	 * @return the thal
	 */
	public Double getThal() {
		return thal;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Double age) {
		this.age = age;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(Double gender) {
		this.gender = gender;
	}

	/**
	 * @param cp the cp to set
	 */
	public void setCp(Double cp) {
		this.cp = cp;
	}

	/**
	 * @param trestbps the trestbps to set
	 */
	public void setTrestbps(Double trestbps) {
		this.trestbps = trestbps;
	}

	/**
	 * @param chol the chol to set
	 */
	public void setChol(Double chol) {
		this.chol = chol;
	}

	/**
	 * @param fbs the fbs to set
	 */
	public void setFbs(Double fbs) {
		this.fbs = fbs;
	}

	/**
	 * @param restecg the restecg to set
	 */
	public void setRestecg(Double restecg) {
		this.restecg = restecg;
	}

	/**
	 * @param thalach the thalach to set
	 */
	public void setThalach(Double thalach) {
		this.thalach = thalach;
	}

	/**
	 * @param exang the exang to set
	 */
	public void setExang(Double exang) {
		this.exang = exang;
	}

	/**
	 * @param oldpeak the oldpeak to set
	 */
	public void setOldpeak(Double oldpeak) {
		this.oldpeak = oldpeak;
	}

	/**
	 * @param dlope the dlope to set
	 */
	public void setDlope(Double dlope) {
		this.dlope = dlope;
	}

	/**
	 * @param ca the ca to set
	 */
	public void setCa(Double ca) {
		this.ca = ca;
	}

	/**
	 * @param thal the thal to set
	 */
	public void setThal(Double thal) {
		this.thal = thal;
	}


}
