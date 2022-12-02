package ru.mirea.twelvthpart;

import java.sql.SQLOutput;
import java.util.StringTokenizer;

public class FullAdress {
    private String country, region, city, street, house, building, apartment;

    public FullAdress(String address, boolean isTokenizer) {
        String[] s;
        if (isTokenizer) {
            StringTokenizer tokenizer = new StringTokenizer(address, ",.;");
            s = new String[tokenizer.countTokens()];

            int i = 0;
            while (tokenizer.hasMoreTokens()) {
                s[i++] = tokenizer.nextToken();
            }
        } else {
            s = address.split(",");
        }

        if (s.length < 7) {
            throw new IllegalArgumentException("Строка содержит недостаточно данных!");
        }
        country = s[0].trim();
        region = s[1].trim();
        city = s[2].trim();
        street = s[3].trim();
        house = s[4].trim();
        building = s[5].trim();
        apartment = s[6].trim();
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", building='" + building + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }

    public static void main(String[] args) {
        FullAdress address3 = new FullAdress("Russia ; HMAO; Nizhnevartovsk; 60 years of october; 8; 1; 17", true);
        System.out.println(address3);
    }
}