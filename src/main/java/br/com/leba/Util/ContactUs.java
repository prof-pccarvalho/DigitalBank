package br.com.leba.Util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ContactUs {

        public static void main(String[] args) throws IOException {
            InputStream is = System.in;
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            System.out.println("Type your Message:");
            String line = br.readLine(); // primeira linha

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
                 }
             }
}
