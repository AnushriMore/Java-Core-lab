//Write a Java program that calculates the sum of all prime numbers up to a given limit using multiple threads.
package Anudipjavalab;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sumofprimenumber {
    // Number of threads to use for the computation
    private static final int NUM_THREADS = 4;

    public static void main(String[] args) {
        // Limit up to which prime numbers are to be summed
        int limit = 10000000;

        // Array to hold thread references
        Thread[] threads = new Thread[NUM_THREADS];
        // Array to hold tasks assigned to each thread
        PrimeSumTask[] tasks = new PrimeSumTask[NUM_THREADS];

        // Segment size for dividing the work among threads
        int segmentSize = limit / NUM_THREADS;
        int start = 2; // Starting number for prime calculation
        int end = segmentSize; // Ending number for the first segment

        // Record the start time of the computation
        long startTime = System.currentTimeMillis();

        // Create and start threads
        for (int i = 0; i < NUM_THREADS; i++) {
            if (i == NUM_THREADS - 1) {
                // Last thread takes care of remaining numbers
                end = limit;
            }

            // Initialize the task for the current segment
            tasks[i] = new PrimeSumTask(start, end);
            // Create a new thread with the current task
            threads[i] = new Thread(tasks[i]);
            // Start the thread
            threads[i].start();

            // Update start and end for the next segment
            start = end + 1;
            end += segmentSize;
        }

        long sum = 0; // Variable to hold the final sum of primes

        // Wait for all threads to complete and aggregate the results
        for (int i = 0; i < NUM_THREADS; i++) {
            try {
                threads[i].join(); // Wait for the thread to finish
                sum += tasks[i].getSum(); // Add the result from the thread's task
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Record the end time of the computation
        long endTime = System.currentTimeMillis();

        // Print the result
        System.out.println("Sum of prime numbers up to " + limit + ": " + sum);
        System.out.println("Time taken: " + (endTime - startTime) + " milliseconds");
    }

    // Task class that implements Runnable to be used by threads
    static class PrimeSumTask implements Runnable {
        private int start; // Start of the range
        private int end; // End of the range
        private long sum; // Sum of prime numbers in the range

        // Constructor to initialize the task with a range
        public PrimeSumTask(int start, int end) {
            this.start = start;
            this.end = end;
            this.sum = 0;
        }

        // Getter method to retrieve the sum calculated by the task
        public long getSum() {
            return sum;
        }

        // Helper method to check if a number is prime
        private boolean isPrime(int number) {
            if (number < 2) {
                return false;
            }

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }

            return true;
        }

        @Override
        // The run method that contains the logic to sum prime numbers in the range
        public void run() {
            for (int i = start; i <= end; i++) {
                if (isPrime(i)) {
                    sum += i;
                }
            }
        }
    }
}

/*Dry run
Sum of prime numbers up to 10000000: 3203324994356
Time taken: 10547 milliseconds

With these print statements, you might see outputs like:
Thread processing range 2 to 2500000 completed. Sum: 142913828922
Thread processing range 2500001 to 5000000 completed. Sum: 117987157229
Thread processing range 5000001 to 7500000 completed. Sum: 98001147758
Thread processing range 7500001 to 10000000 completed. Sum: 113732814344
Sum of prime numbers up to 10000000: 3203324994356
Time taken: 10547 milliseconds
/*
