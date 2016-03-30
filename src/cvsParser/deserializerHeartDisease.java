package cvsParser;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

import org.jsefa.common.lowlevel.filter.HeaderAndFooterFilter;
import org.jsefa.csv.CsvDeserializer;
import org.jsefa.csv.CsvIOFactory;
import org.jsefa.csv.config.CsvConfiguration;

import model.heartDisease;

public class deserializerHeartDisease {
	
	public static ArrayList<heartDisease> list;

    void start() {
    	list = new ArrayList<heartDisease>();
        CsvConfiguration config = new CsvConfiguration();
        // header of size 0, no footer, store the filtered lines
        config.setLineFilter(new HeaderAndFooterFilter(0, false, true));
        CsvDeserializer deserializer = CsvIOFactory.createFactory(config, heartDisease.class).createDeserializer();
        deserializer.open(createFileReader());
        while (deserializer.hasNext()) {
            heartDisease hd = deserializer.next();
            print(hd);
            list.add(hd);
        }
        String header = deserializer.getStoredLines().get(0).getContent();
        printHeader(header);
        deserializer.close(true);
    }

    private void printHeader(String header) {
        System.out.println("HEADER: " + header);
    }

    private void print(heartDisease hd) {
        System.out.println("---------------------------");
        System.out.println(hd.toString());
    }

    private Reader createFileReader() {
        return new InputStreamReader(this.getClass().getResourceAsStream("person.csv"));
    }

	/**
	 * @return the list
	 */
	public static ArrayList<heartDisease> getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public static void setList(ArrayList<heartDisease> list) {
		deserializerHeartDisease.list = list;
	}

}
