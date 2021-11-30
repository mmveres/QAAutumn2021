package ua.univer.lesson13.kmda;

import ua.univer.lesson13.FileConst;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.List;

public class Program {

    public static void main(String[] args) throws IOException {


      //  KmdaHelper.readTextFromFile(FileConst.PATH_KMDA+"lipen-2019.csv");
     //   List<UserKmda> users = KmdaHelper.getUsersKmdaFromFile(FileConst.PATH_KMDA+"lipen-2019.csv");
        List<UserKmda> users = KmdaHelper.getUsersKmdaFromURL("https://data.gov.ua/dataset/770cc750-4333-424f-b6e9-6e6c5c76aec9/resource/59cb6066-1fac-41ed-a571-811db551c75b/download/zp-lupen-2019.csv");
        for (var user: users ) {
            System.out.println(user);
        }

        System.out.println(KmdaHelper.getUserWithMaxSalary(users));

    }
}
