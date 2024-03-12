package day_62_collection_4;

import java.util.*;
import java.nio.file.*;
import java.io.*; //

public class CVSDataToMap {
    public static void main(String[] args) throws Exception {
        Map<String, String> countryCode = new HashMap<>();
        String fileName = "countryCodes.csv";
        File dataFile = new File(fileName);
        System.out.println(dataFile.exists());
        Scanner scan = new Scanner(dataFile);
        //System.out.println(scan.nextLine());
        // System.out.println(scan.nextLine());
        // System.out.println(scan.nextLine());
        ArrayList<String> FileDataList = new ArrayList<>();
        while (scan.hasNextLine()) {
            String row = scan.nextLine();
            // FileDataList.add(scan.nextLine());
            FileDataList.add(row);
            //System.out.println(counter+" . "+scan.nextLine());
            // System.out.println(row);
        }
        scan.close();
        System.out.println(fileName + " contains " + FileDataList.size() + " row.");
        // System.out.println(FileDataList.toString());
        System.out.println("Read form CSV fila using new way");
        List<String> countryCodeList = Files.readAllLines(Paths.get(fileName));
        System.out.println(countryCodeList.toString() + " - " + countryCodeList.size());
        //how to retrieve unique-non duplicate country codes
        Set<String> countryCodeSet = new HashSet<>();
        countryCodeSet.addAll(countryCodeList);
        System.out.println(countryCodeSet + " - " + countryCodeSet.size());
        System.out.println("----------JAN JAN JAN JAN");
        //Store each country code and country name into HashMap
        //Key-country code   Value-country name

        HashMap<String, String> HashCountry = new HashMap<>();
        //loop through the countryCodeSet
        countryCodeList.remove(0); //remove column name
        for (String eachLine : countryCodeSet) {
            //System.out.println(eachLine);
            //split each value with comma
            String[] arr = eachLine.split(",");

            //store index 0 to as a key, and index 1 as a value to the map
            HashCountry.put(arr[0], arr[1]);

        }
        System.out.println(HashCountry.size());
        System.out.println(HashCountry.toString());
        if (HashCountry.containsValue("Mongolia")){
            System.out.println("Mongoia is in the map");

        }else {
            System.out.println("Keep coding Java");
        }
        //BE
        System.out.println(HashCountry.get("BE"));
        System.out.println("PRINT ALL VALUES USING FOREACH METHOD+LAMBDA");
        HashCountry.forEach((k,v)-> System.out.println(k+"---"+v));

        System.out.println("PRINT ALL KEYS USING FOREACH LOOP");
        for(String eachKey:HashCountry.keySet()){
            System.out.println(eachKey+"--"+HashCountry.get(eachKey));
        }
        System.out.println("PRINT ALL VALUES USING ENTRYSET");
        for(Map.Entry<String,String>entry:HashCountry.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }


    }
}
