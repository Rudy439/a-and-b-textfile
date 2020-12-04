package sk.kosickaakademia.matorudolf.fileread;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader;
        try {
            FileReader filea=new FileReader("resource\\a.txt");
            Scanner scan = new Scanner(new File("resource\\a.txt"));
            ArrayList<Integer> values = new ArrayList<>();
            Collections.sort(values);
            while(scan.hasNextInt()) values.add(scan.nextInt());

            FileReader fileb=new FileReader("resource\\b.txt");
            scan = new Scanner(new File("resource\\b.txt"));
            values = new ArrayList<>();
            Collections.sort(values);
            while(scan.hasNextInt()) values.add(scan.nextInt());

            BufferedReader bra = new BufferedReader (filea);
            BufferedReader brb = new BufferedReader(fileb);

            String a = "";
            String b = "";


            while(bra.readLine() !=null)
            {
                a=bra.readLine()+a;
            }
            while(bra.readLine()!=null)
            {
                b=brb.readLine()+b;
            }
            String c = a + b;

            FileWriter filec=new FileWriter("resource\\c.txt");
            char bf []=new char[c.length()];
            c.getChars(0,c.length(),bf,0);
            filec.write(bf);
            filea.close();
            fileb.close();
            filec.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
