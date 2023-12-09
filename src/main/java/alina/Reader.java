package alina;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Reader {

    ArrayList<Person> people;

    public Reader(String csvFilePath) {
        people = new ArrayList<>();

        int division_id;
        Division division;
        try {
            CSVParser parser = new CSVParserBuilder().withSeparator(';').build();

            CSVReader csvReader = new CSVReaderBuilder(new FileReader(csvFilePath)).withCSVParser(parser).build();

            List<String[]> allData = csvReader.readAll();

            for (String[] row : allData.subList(1, allData.size())) {
                people.add(new Person(Integer.parseInt(row[0]), row[1], Sex.valueOf(row[2]), row[3], new Division(row[4].charAt(0), row[4].charAt(0)), Integer.parseInt(row[5])));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void print() {
        for (Person person : people) person.print();
    }
}
