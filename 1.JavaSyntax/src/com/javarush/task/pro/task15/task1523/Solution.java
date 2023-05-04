package com.javarush.task.pro.task15.task1523;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/* 
Получение информации по API
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://httpbin.org/post");
        URLConnection urlConnection = url.openConnection();
        urlConnection.setDoOutput(true);
        try(OutputStream output = urlConnection.getOutputStream())
        {
            PrintStream sender = new PrintStream(output);
            sender.println(1);

        }catch (Exception e) {

        }
        try(InputStream input = urlConnection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input)))
        {
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }

        } catch(Exception e) {

        }
    }
}

