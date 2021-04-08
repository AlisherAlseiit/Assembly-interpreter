package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    public static Map<String, String> DB = new HashMap();


    public static Map<String, String> DW = new HashMap();


    public static Map<String, String> DD = new HashMap();

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        System.out.println("PRESS 1 TO STOP ");
        while (true) {
            System.out.println("Enter the operation or declare the variable: ");
            String line = read.readLine();
            if (line.equals("1")) break;

            System.out.println("print out: 2 for DB, for DW enter 20, for DD enter 21");
            System.out.println("move: 3");
            System.out.println("exchange: 4");
            System.out.println("ADD, SUB, MUL, DIV, INC, DEC: 5");
            int c = in.nextInt();
            String key = line.substring(0, line.indexOf(' ')).toUpperCase();


            if (line.toUpperCase().contains("DB")
                    && line.toUpperCase().substring(line.indexOf("DB") - 1, line.indexOf("DB")).equals(" ")
                    && line.toUpperCase().substring(line.indexOf("DB") + 2, line.indexOf("DB") + 3).equals(" ")) {


                String db = line.substring(line.indexOf("DB") + 3);
                if (!Methods.checks(db) && c != 3 && c != 5 && c != 4) {
                    System.out.println("The variable name's not valid!");
                    break;
                } else if (c != 5) {

                    DB.put(key, db);
                }

                if (c == 2) {
                    System.out.println(DB.get(key));

                } else if (c == 3) {

                    String line2 = read.readLine();
                    String key2 = line2.substring(0, line2.indexOf(' ')).toUpperCase();
                    DB.put(key2, line2.substring(line2.indexOf("DB") + 3));

                    String moveLine = read.readLine();

                    if (moveLine.substring(moveLine.indexOf(key2)).equals(key2)) {
                        Methods.move(DB, key, key2);
                    } else
                        Methods.move(DB, key2, key);


                } else if (c == 4) {
                    String line2 = read.readLine();
                    String key2 = line2.substring(0, line2.indexOf(' ')).toUpperCase();
                    DB.put(key2, line2.substring(line2.indexOf("DB") + 3));

                    String moveLine = read.readLine();

                    if (moveLine.substring(moveLine.indexOf(key2)).equals(key2)) {
                        Methods.exchange(DB, key, key2);
                    } else
                        Methods.exchange(DB, key2, key);


                } else if (c == 5) {

                    String line2 = read.readLine();
                    String key2 = line2.substring(0, line2.indexOf(' ')).toUpperCase();


                    if (line2.contains("h")) {
                        DB.put(key, line.substring(line.indexOf("DB") + 3, line.indexOf("h")));
                        DB.put(key2, line2.substring(line2.indexOf("DB") + 3, line2.indexOf("h")));
                    } else if (line2.contains("b")) {
                        DB.put(key, line.substring(line.indexOf("DB") + 3, line.indexOf("h")));
                        DB.put(key2, line2.substring(line2.indexOf("DB") + 3, line2.indexOf("b")));
                    } else if (line2.contains("d")) {
                        DB.put(key, line.substring(line.indexOf("DB") + 3, line.indexOf("h")));
                        DB.put(key2, line2.substring(line2.indexOf("DB") + 3, line2.indexOf("d")));
                    } else if (line2.contains("q")) {
                        DB.put(key, line.substring(line.indexOf("DB") + 3, line.indexOf("h")));
                        DB.put(key2, line2.substring(line2.indexOf("DB") + 3, line2.indexOf("q")));
                    } else {
                        DB.put(key, db);
                        DB.put(key2, line2.substring(line2.indexOf("DB") + 3));
                    }

                    String moveLine = read.readLine();

                    if (moveLine.substring(0, 5).toUpperCase().contains("ADD ")) {

                        String method = "ADD";
                        String type;

                        if (line2.contains("d")) {
                            type = "decimal";

                            System.out.println(Methods.add(DB, key, key2, type, method));
                        } else if (line2.contains("h")) {
                            type = "hex";
                            System.out.println(Methods.add(DB, key, key2, type, method));
                        } else if (line2.contains("b")) {
                            type = "binary";
                            System.out.println(Methods.add(DB, key, key2, type, method));
                        } else if (line2.contains("q")) {
                            type = "octal";
                            System.out.println(Methods.add(DB, key, key2, type, method));
                        } else {
                            type = "number";
                            System.out.println(Methods.add(DB, key, key2, type, method));
                        }
                    } else if (moveLine.substring(0, 5).toUpperCase().contains("SUB ")) {
                        System.out.println("Subbing");
                        String type;
                        String method = "SUB";

                        if (line2.contains("d")) {
                            type = "decimal";

                            System.out.println(Methods.add(DB, key, key2, type, method));
                        } else if (line2.contains("h")) {
                            type = "hex";
                            System.out.println(Methods.add(DB, key, key2, type, method));
                        } else if (line2.contains("b")) {
                            type = "binary";
                            System.out.println(Methods.add(DB, key, key2, type, method));
                        } else if (line2.contains("q")) {
                            type = "octal";
                            System.out.println(Methods.add(DB, key, key2, type, method));
                        } else {
                            type = "number";
                            System.out.println(Methods.add(DB, key, key2, type, method));
                            ;
                        }
                    } else if (moveLine.substring(0, 5).toUpperCase().contains("MUL ")) {

                        String type;
                        String method = "MUL";

                        if (line2.contains("d")) {
                            type = "decimal";

                            System.out.println(Methods.add(DB, key, key2, type, method));
                        } else if (line2.contains("h")) {
                            type = "hex";
                            System.out.println(Methods.add(DB, key, key2, type, method));
                        } else if (line2.contains("b")) {
                            type = "binary";
                            System.out.println(Methods.add(DB, key, key2, type, method));
                        } else if (line2.contains("q")) {
                            type = "octal";
                            System.out.println(Methods.add(DB, key, key2, type, method));
                        } else {
                            type = "number";
                            System.out.println(Methods.add(DB, key, key2, type, method));
                            ;
                        }
                    } else if (moveLine.substring(0, 5).toUpperCase().contains("DIV ")) {

                        String type;
                        String method = "DIV";

                        if (line2.contains("d")) {
                            type = "decimal";

                            System.out.println(Methods.add(DB, key, key2, type, method));
                        } else if (line2.contains("h")) {
                            type = "hex";
                            System.out.println(Methods.add(DB, key, key2, type, method));
                        } else if (line2.contains("b")) {
                            type = "binary";
                            System.out.println(Methods.add(DB, key, key2, type, method));
                        } else if (line2.contains("q")) {
                            type = "octal";
                            System.out.println(Methods.add(DB, key, key2, type, method));
                        } else {
                            type = "number";
                            System.out.println(Methods.add(DB, key, key2, type, method));
                            ;
                        }
                    } else if (moveLine.substring(0, 5).toUpperCase().contains("INC ")) {

                        String type;
                        String method = "INC";

                        if (line2.contains("d")) {
                            type = "decimal";

                            System.out.println(Methods.add(DB, key, key2, type, method));
                        } else if (line2.contains("h")) {
                            type = "hex";
                            System.out.println(Methods.add(DB, key, key2, type, method));
                        } else if (line2.contains("b")) {
                            type = "binary";
                            System.out.println(Methods.add(DB, key, key2, type, method));
                        } else if (line2.contains("q")) {
                            type = "octal";
                            System.out.println(Methods.add(DB, key, key2, type, method));
                        } else {
                            type = "number";
                            System.out.println(Methods.add(DB, key, key2, type, method));
                            ;
                        }
                    } else if (moveLine.substring(0, 5).toUpperCase().contains("DEC ")) {

                        String type;
                        String method = "DEC";

                        if (line2.contains("d")) {
                            type = "decimal";

                            System.out.println(Methods.add(DB, key, key2, type, method));
                        } else if (line2.contains("h")) {
                            type = "hex";
                            System.out.println(Methods.add(DB, key, key2, type, method));
                        } else if (line2.contains("b")) {
                            type = "binary";
                            System.out.println(Methods.add(DB, key, key2, type, method));
                        } else if (line2.contains("q")) {
                            type = "octal";
                            System.out.println(Methods.add(DB, key, key2, type, method));
                        } else {
                            type = "number";
                            System.out.println(Methods.add(DB, key, key2, type, method));
                            ;
                        }
                    }

                }


            } else if (line.toUpperCase().contains("DW")
                    && line.toUpperCase().substring(line.indexOf("DW") - 1, line.indexOf("DW")).equals(" ")
                    && line.toUpperCase().substring(line.indexOf("DW") + 2, line.indexOf("DW") + 3).equals(" ")) {

                String dw = line.substring(line.indexOf("DW") + 3);

                if (!Methods.checks(dw)) {
                    System.out.println("The variable name's not valid!");
                    break;
                } else {

                    DW.put(key, dw);

                }

                if (c == 20) {
                    System.out.println(DW.get(key));
                    break;
                }

            } else if (line.toUpperCase().contains("DD")
                    && line.toUpperCase().substring(line.indexOf("DD") - 1, line.indexOf("DD")).equals(" ")
                    && line.toUpperCase().substring(line.indexOf("DD") + 2, line.indexOf("DD") + 3).equals(" ")) {
                String dd = line.substring(line.indexOf("DD") + 3);
                System.out.println("im here");
                if (!Methods.checks(dd)) {
                    System.out.println("The variable name's not valid!");
                    break;
                } else {
                    System.out.println("here");
                    DD.put(key, dd);
                }
                if (c == 21) {
                    System.out.println(DD.get(key));

                }
            }
        }


    }
}
