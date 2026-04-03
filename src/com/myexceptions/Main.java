/**
 *  Java program to demonstrate  catching multiple exceptions.
 */

package com.myexceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *  MAin class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Try-catch block.
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String urlString = br.readLine();
            URL url = new URL(urlString);
            br = new BufferedReader(new InputStreamReader(url.openStream()));
            System.out.println("" + br.readLine());

        } catch (MalformedURLException ex) {

            System.out.println("MalformedURLException block.");

        } catch (IOException ex) {

            System.out.println("IOException block.");

        } catch (Exception ex) {

            System.out.println("Exception block.");

        } finally {

            System.out.println("Finally block.");

        }
    }
}