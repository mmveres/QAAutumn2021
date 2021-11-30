package ua.univer.lesson13.kmda;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class KmdaHelper {
    public static void readTextFromFile(String x) throws IOException {
        System.out.println(x);
        BufferedReader file_txt = new BufferedReader(new FileReader(x, Charset.forName("WINDOWS-1251")));
        while (file_txt.ready()) {
            System.out.println(file_txt.readLine());
        }
    }

    public static List<UserKmda> getUsersKmdaFromURL(String url_link) throws IOException {
        URL url = new URL(url_link);
        InputStreamReader in = new InputStreamReader(url.openStream(),  Charset.forName("WINDOWS-1251"));
        List<UserKmda> users= new ArrayList<>();
        BufferedReader file_txt = new BufferedReader(in);
        file_txt.readLine();
        while (file_txt.ready()) {
            String text_row = file_txt.readLine();
            String [] text_cell = text_row.split(";");
            users.add(new UserKmda(
                    text_cell[0],
                    text_cell[1],
                    Double.parseDouble(text_cell[2].replace(",", ".")))
            );
        }
        return users;
    }

    public static List<UserKmda> getUsersKmdaFromFile(String x) throws IOException {
        List<UserKmda> users= new ArrayList<>();
        BufferedReader file_txt = new BufferedReader(new FileReader(x, Charset.forName("WINDOWS-1251")));
        file_txt.readLine();
        while (file_txt.ready()) {
          String text_row = file_txt.readLine();
          String [] text_cell = text_row.split(";");
          users.add(new UserKmda(
                  text_cell[0],
                  text_cell[1],
                  Double.parseDouble(text_cell[2].replace(",", ".")))
          );
        }
        return users;
    }

    public static List<UserKmda> getUserWithMaxSalary(List<UserKmda> users){
        List<UserKmda> usersWithMaxSalary = new ArrayList<>();
        UserKmda userMaxSalary = users.get(0);
        for (var user: users) {
            if (user.getSalary() > userMaxSalary.getSalary()){
                userMaxSalary = user;
            }
        }
        for (var user: users) {
            if(user.getSalary()== userMaxSalary.getSalary())
                usersWithMaxSalary.add(user);
        }
        return usersWithMaxSalary;
    }
}
