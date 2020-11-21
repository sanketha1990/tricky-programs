package com.hacker.earth;

public class Solution {
	
	package sample.com;

	import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.hacker.earth.Solution.RatingStatisticsCollector;
import com.hacker.earth.Solution.RatingStatisticsCollectorImpl;

	public class Solution {
	    public static class RatingStatisticsCollectorImpl implements RatingStatisticsCollector {
	        public Map<String, Double> map = new HashMap<>();
	        public Map<String, Integer> mapCount = new HashMap<>();
	        @Override
	        public void putNewRating(String app, int rating){
	            if(map.containsKey(app)){
	                if(mapCount.containsKey(app)){
	                    mapCount.put(app, mapCount.get(app)+1);
	                }
	                Double newRating = (map.get(app) + rating);
	                map.put(app, newRating);
	            }else{
	                map.put(app, Double.valueOf(rating));
	                mapCount.put(app, 1);
	            }
	            // YOUR CODE HERE
	        }

	        @Override
	        public double getAverageRating(String app){
	            // YOUR CODE HERE
	            Double value =0.0;
	           if(map.containsKey(app)){
	               value = Double.valueOf((map.get(app))/(mapCount.get(app)));
	           }
	           return value;
	        }

	        @Override
	        public int getRatingsCount(String app){
	            // YOUR CODE HERE
	            int count =0;
	            if(mapCount.containsKey(app)){
	                count = mapCount.get(app);
	            }
	            return count;
	        }
	    }

	    ////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

	    public interface RatingStatisticsCollector {
	        // Ratings feed will call this method when new app rating information is received. This is input to your class. ratings is a non negative integer between 0 to 10.
	        public void putNewRating(String app, int rating);

	        // Report the average rating of the app.
	        public double getAverageRating(String app);

	        // Report the total number of rating for an app.
	        public int getRatingsCount(String app);
	    }

	    public static void main(String[] args) {
	        System.out.println("output");
	        Scanner scanner = new Scanner(System.in);
	        int numLines = Integer.parseInt(scanner.nextLine());
	        int currentLine = 0;
	        while (currentLine++ < numLines) {
	            final RatingStatisticsCollector stats = new RatingStatisticsCollectorImpl();
	            final Set<String> apps = new TreeSet<>();

	            String line = scanner.nextLine();
	            String[] inputs = line.split(",");
	            for (int i = 0; i < inputs.length; ++i) {
	                String[] tokens = inputs[i].split(" ");
	                final String app = tokens[0];
	                apps.add(app);
	                final int runs = Integer.parseInt(tokens[1]);

	                stats.putNewRating(app, runs);

	            }

	            for (String app : apps) {
	                System.out.println(
	                        String.format("%s %.2f %d", app, stats.getAverageRating(app), stats.getRatingsCount(app)));
	            }

	        }
	        scanner.close();

	    }
	}

}
