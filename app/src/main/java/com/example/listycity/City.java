package com.example.listycity;

import java.util.Objects;

/**
 * This is a class that keeps track of a city object
 */
public class City implements Comparable<City>{
    private String city;
    private String province;

    /**
     * This is the constructor for the City class
     * @param city This is the name of the city
     * @param province This is the name of the province
     */
    public City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * This returns the city name
     * @return Returns the name of the city
     */
    String getCityName(){
        return this.city;
    }

    /**
     * This returns the province  name
     * @return Returns the name of the province
     */

    String getProvinceName(){
        return this.province;
    }

    /**
     * This compares two cities based on their name
     * @param city This is the city to compare to
     * @return Returns 0 if equal, or a non-zero integer if different
     */

    @Override
    public int compareTo(City city) {
        return this.city.compareTo(city.getCityName());
    }
}