package cvsParser;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import model.heartDisease;
import model.inputData;

public class machineLearning {
	public static cvsReader reader;
	private static ArrayList<heartDisease> data;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		try {
			reader = new cvsReader();
			reader.run();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		;
		data = reader.getData();
		findAvg(data);
		findVar(findAvg(data), data);

	}

	private static heartAvg findVar(heartAvg heartAvg, ArrayList<heartDisease> data2) {
		Double age = 0.0, gender = 0.0, cp = 0.0, trestbps = 0.0, chol = 0.0, fbs = 0.0, restecg = 0.0, thalach = 0.0,
				exang = 0.0, oldpeak = 0.0, dlope = 0.0, ca = 0.0, thal = 0.0;
		for (heartDisease i : data2) {
			age = i.getAge() - heartAvg.age;
			gender += i.getGender() - heartAvg.gender;
			cp += i.getCp() - heartAvg.cp;
			trestbps += i.getTrestbps() - heartAvg.trestbps;
			chol += i.getChol() - heartAvg.chol;
			fbs += i.getFbs() - heartAvg.fbs;
			restecg += i.getRestecg() - heartAvg.restecg;
			thalach += i.getThalach() - heartAvg.thalach;
			exang += i.getExang() - heartAvg.exang;
			oldpeak += i.getOldpeak() - heartAvg.oldpeak;
			dlope += i.getDlope() - heartAvg.dlope;
			ca += i.getCa() - heartAvg.ca;
			thal += i.getThal() - heartAvg.thal;
		}
		return new heartAvg(age / data2.size(), gender / data2.size(), cp / data2.size(), trestbps / data2.size(),
				chol / data2.size(), fbs / data2.size(), restecg / data2.size(), thalach / data2.size(),
				exang / data2.size(), oldpeak / data2.size(), dlope / data2.size(), ca / data2.size(),
				thal / data2.size());

	}

	private static heartAvg findAvg(ArrayList<heartDisease> data2) {
		Double age = 0.0, gender = 0.0, cp = 0.0, trestbps = 0.0, chol = 0.0, fbs = 0.0, restecg = 0.0, thalach = 0.0,
				exang = 0.0, oldpeak = 0.0, dlope = 0.0, ca = 0.0, thal = 0.0;
		for (heartDisease i : data2) {
			age = i.getAge();
			gender += i.getGender();
			cp += i.getCp();
			trestbps += i.getTrestbps();
			chol += i.getChol();
			fbs += i.getFbs();
			restecg += i.getRestecg();
			thalach += i.getThalach();
			exang += i.getExang();
			oldpeak += i.getOldpeak();
			dlope += i.getDlope();
			ca += i.getCa();
			thal += i.getThal();
		}
		return new heartAvg(age / data2.size(), gender / data2.size(), cp / data2.size(), trestbps / data2.size(),
				chol / data2.size(), fbs / data2.size(), restecg / data2.size(), thalach / data2.size(),
				exang / data2.size(), oldpeak / data2.size(), dlope / data2.size(), ca / data2.size(),
				thal / data2.size());

	}
}
