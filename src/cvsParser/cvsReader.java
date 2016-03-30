package cvsParser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

import org.jsefa.Deserializer;
import org.jsefa.common.lowlevel.filter.HeaderAndFooterFilter;
import org.jsefa.csv.CsvIOFactory;
import org.jsefa.csv.config.CsvConfiguration;

import model.DoubleConverter;

public class cvsReader {

	public final String heartDisease = "heartDisease.csv";
	public final String iris = "iris.csv";
	public final String wine = "wine.csv";
	public String file;
	private ArrayList<model.heartDisease> data;

	public void run() throws FileNotFoundException, IOException {
		file = heartDisease;
		data = new ArrayList<model.heartDisease>();
		CsvConfiguration config = new CsvConfiguration();
		config.setLineFilter(new HeaderAndFooterFilter(0, false, true));
		config.setFieldDelimiter(',');

		config.getSimpleTypeConverterProvider().registerConverterType(Double.class, DoubleConverter.class);

		Deserializer deserializer = CsvIOFactory.createFactory(config, model.heartDisease.class).createDeserializer();
		deserializer.open(createFileReader(file));
		while (deserializer.hasNext()) {
			data.add(deserializer.next());
			System.out.println(data.get(data.size()-1).toString());
		}

	}

	private Reader createFileReader(String file) {
		return new InputStreamReader(this.getClass().getResourceAsStream(file));
	}

	/**
	 * @return the data
	 */
	@SuppressWarnings("rawtypes")
	public ArrayList getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	@SuppressWarnings("unchecked")
	public void setData(@SuppressWarnings("rawtypes") ArrayList data) {
		this.data = data;
	}
}
