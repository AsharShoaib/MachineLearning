package cvsParser;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import Jama.Matrix;
import model.heartDisease;
import model.inputData;

public class machineLearning {
	public static cvsReader reader;
	private static ArrayList<heartDisease> data;
	private static ArrayList<heartDisease> condition0;
	private static ArrayList<heartDisease> condition1;
	private static heartAvg avgCondition0;
	private static heartAvg avgCondition1;
	private static heartAvg varianceCondition1;
	private static heartAvg varianceCondition0;
	private static double[] vector1;
	private static double[][] matrix1;
	private static double[] vector0;
	private static double[][] matrix0;

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
		classifyData(data);
		avgCondition0 = findAvg(condition0);
		varianceCondition0 = findVar(avgCondition0, condition0);
		avgCondition1 = findAvg(condition1);
		varianceCondition1 = findVar(avgCondition1, condition1);
		
		vector0 = buildVect(avgCondition0, condition0);
		matrix0 = buildMatrix(varianceCondition0, condition0	);
		vector1 = buildVect(avgCondition1, condition1);
		matrix1 = buildMatrix(varianceCondition1, condition1);
		Matrix a = new Matrix(matrix0);   
		Matrix b = new Matrix(vector0, 1);     
		Matrix c = b.minus(a);  
	}

	private static double[] buildVect(heartAvg avgCondition12, ArrayList<heartDisease> condition12) {
		double temp[] = new double[condition12.size()];
		temp[0] = avgCondition12.getAge();
		temp[1] += avgCondition12.getGender();
		temp[2] += avgCondition12.getCp();
		temp[3] += avgCondition12.getTrestbps();
		temp[4] += avgCondition12.getChol();
		temp[5] += avgCondition12.getFbs();
		temp[6] += avgCondition12.getRestecg();
		temp[7] += avgCondition12.getThalach();
		temp[8] += avgCondition12.getExang();
		temp[9] += avgCondition12.getOldpeak();
		temp[10] += avgCondition12.getDlope();
		temp[11] += avgCondition12.getCa();
		temp[12] += avgCondition12.getThal();
		return temp;
		
	}

	private static double[][] buildMatrix(heartAvg avgCondition12, ArrayList<heartDisease> condition12) {
		double temp[][] = new double[condition12.size()][condition12.size()];
		for(int i = 0 ; i<condition12.size(); i++){
			for(int k = 0; k<condition12.size(); k++){
				temp[i][k] = 0;
			}
		}
		
		temp[0][0] = avgCondition12.getAge();
		temp[1][1] += avgCondition12.getGender();
		temp[2][2] += avgCondition12.getCp();
		temp[3][3] += avgCondition12.getTrestbps();
		temp[4][4] += avgCondition12.getChol();
		temp[5][5] += avgCondition12.getFbs();
		temp[6][6] += avgCondition12.getRestecg();
		temp[7][7] += avgCondition12.getThalach();
		temp[8][8] += avgCondition12.getExang();
		temp[9][9] += avgCondition12.getOldpeak();
		temp[10][10] += avgCondition12.getDlope();
		temp[11][11] += avgCondition12.getCa();
		temp[12][12] += avgCondition12.getThal();
		return temp;
		
	}

	private static void classifyData(ArrayList<heartDisease> data2) {
		for(heartDisease i : data2){
			if(i.getClassCondition()==0){
				condition0.add(i);
			}else{
				condition1.add(i);
			}
		}
		
	}

	private static heartAvg findVar(heartAvg heartAvg, ArrayList<heartDisease> data2) {
		Double age = 0.0, gender = 0.0, cp = 0.0, trestbps = 0.0, chol = 0.0, fbs = 0.0, restecg = 0.0, thalach = 0.0,
				exang = 0.0, oldpeak = 0.0, dlope = 0.0, ca = 0.0, thal = 0.0;
		for (heartDisease i : data2) {
			age = i.getAge() - heartAvg.getAge();
			gender += i.getGender() - heartAvg.getGender();
			cp += i.getCp() - heartAvg.getCp();
			trestbps += i.getTrestbps() - heartAvg.getTrestbps();
			chol += i.getChol() - heartAvg.getChol();
			fbs += i.getFbs() - heartAvg.getFbs();
			restecg += i.getRestecg() - heartAvg.getRestecg();
			thalach += i.getThalach() - heartAvg.getThalach();
			exang += i.getExang() - heartAvg.getExang();
			oldpeak += i.getOldpeak() - heartAvg.getOldpeak();
			dlope += i.getDlope() - heartAvg.getDlope();
			ca += i.getCa() - heartAvg.getCa();
			thal += i.getThal() - heartAvg.getThal();
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
