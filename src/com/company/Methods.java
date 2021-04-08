package com.company;

import java.io.Serializable;
import java.util.Map;

public class Methods {

    public static void exchange(Map<String, String> map, String first, String second) {
        String temp = "";
        temp = map.get(first);
        map.put(second, map.get(first));
        map.put(first, temp);
        System.out.println(first + ": " + map.get(first));
        System.out.println(second + ": " + map.get(second));
    }

    public static void move(Map<String, String> map, String first, String second) {

        map.put(first, map.get(second));
        System.out.println(map.get(first));
    }

    public static Boolean checks(String str) {
        return str.length() >= 1 && str.length() <= 31 && !Character.isDigit(str.charAt(0))
                && (!str.contains(".") || str.charAt(0) == '.') && (!str.contains("@") || str.charAt(0) == '@') && !str.contains("&");
    }

    public static Serializable add(Map<String, String> map, String first, String second, String type, String method) {
        if (method.equals("ADD")) {
            if (type.equals("decimal")) {
                int firstNumber = Integer.parseInt(map.get(first));
                int secondNumber = Integer.parseInt(map.get(second));
                int result = firstNumber + secondNumber;
                return result;
            } else if (type.equals("hex")) {

                System.out.println(" map.get(first)" + map.get(first));
                System.out.println(" map.get(second)" + map.get(second));

                int firstHexadecimalNumber = Integer.parseInt(map.get(first), 16);

                int secondHexadecimalNumber = Integer.parseInt(map.get(second), 16);

                int sum = firstHexadecimalNumber + secondHexadecimalNumber;

                return Integer.toHexString(sum);

            } else if (type.equals("octal")) {
                if (map.get(first).contains("8") || map.get(first).contains("9") && map.get(second).contains("9") || map.get(second).contains("8"))
                    return 0;

                int firstOctalNumber = Integer.parseInt(map.get(first), 8);
                int secondOctalNumber = Integer.parseInt(map.get(second), 8);

                int sum = firstOctalNumber + secondOctalNumber;

                return Integer.toOctalString(sum);

            } else if (type.equals("binary")) {

                int firstBinaryNumber = Integer.parseInt(map.get(first), 2);
                int secondBinaryNumber = Integer.parseInt(map.get(second), 2);

                int result = firstBinaryNumber + secondBinaryNumber;

                return Integer.toBinaryString(result);
            } else if (type.equals("number")) {

                int firstNumber = Integer.parseInt(map.get(first));
                int secondNumber = Integer.parseInt(map.get(second));

                return secondNumber + firstNumber;
            } else {

                return 0;
            }
        } else if (method.equals("SUB")) {

            if (type.equals("decimal")) {
                int firstNumber = Integer.parseInt(map.get(first));
                int secondNumber = Integer.parseInt(map.get(second));
                int result = firstNumber - secondNumber;
                return result;
            } else if (type.equals("hex")) {


                int firstHexadecimalNumber = Integer.parseInt(map.get(first), 16);

                int secondHexadecimalNumber = Integer.parseInt(map.get(second), 16);

                int sum = firstHexadecimalNumber - secondHexadecimalNumber;

                return Integer.toHexString(sum);

            } else if (type.equals("octal")) {
                if (map.get(first).contains("8") || map.get(first).contains("9") && map.get(second).contains("9") || map.get(second).contains("8"))
                    return 0;

                int firstOctalNumber = Integer.parseInt(map.get(first), 8);
                int secondOctalNumber = Integer.parseInt(map.get(second), 8);

                int sum = firstOctalNumber - secondOctalNumber;

                return Integer.toOctalString(sum);

            } else if (type.equals("binary")) {

                int firstBinaryNumber = Integer.parseInt(map.get(first), 2);
                int secondBinaryNumber = Integer.parseInt(map.get(second), 2);

                int result = firstBinaryNumber - secondBinaryNumber;

                return Integer.toBinaryString(result);
            } else if (type.equals("number")) {

                int firstNumber = Integer.parseInt(map.get(first));
                int secondNumber = Integer.parseInt(map.get(second));

                return secondNumber - firstNumber;
            } else {

                return 0;
            }
        } else if (method.equals("MUL")) {

            if (type.equals("decimal")) {
                int firstNumber = Integer.parseInt(map.get(first));
                int secondNumber = Integer.parseInt(map.get(second));
                int result = firstNumber * secondNumber;
                return result;
            } else if (type.equals("hex")) {


                int firstHexadecimalNumber = Integer.parseInt(map.get(first), 16);

                int secondHexadecimalNumber = Integer.parseInt(map.get(second), 16);

                int sum = firstHexadecimalNumber * secondHexadecimalNumber;

                return Integer.toHexString(sum);

            } else if (type.equals("octal")) {
                if (map.get(first).contains("8") || map.get(first).contains("9") && map.get(second).contains("9") || map.get(second).contains("8"))
                    return 0;

                int firstOctalNumber = Integer.parseInt(map.get(first), 8);
                int secondOctalNumber = Integer.parseInt(map.get(second), 8);

                int sum = firstOctalNumber * secondOctalNumber;

                return Integer.toOctalString(sum);

            } else if (type.equals("binary")) {

                int firstBinaryNumber = Integer.parseInt(map.get(first), 2);
                int secondBinaryNumber = Integer.parseInt(map.get(second), 2);

                int result = firstBinaryNumber * secondBinaryNumber;

                return Integer.toBinaryString(result);
            } else if (type.equals("number")) {

                int firstNumber = Integer.parseInt(map.get(first));
                int secondNumber = Integer.parseInt(map.get(second));

                return secondNumber * firstNumber;
            } else {

                return 0;
            }
        } else if (method.equals("DIV")) {

            if (type.equals("decimal")) {
                int firstNumber = Integer.parseInt(map.get(first));
                int secondNumber = Integer.parseInt(map.get(second));
                int result = firstNumber / secondNumber;
                return result;
            } else if (type.equals("hex")) {


                int firstHexadecimalNumber = Integer.parseInt(map.get(first), 16);

                int secondHexadecimalNumber = Integer.parseInt(map.get(second), 16);

                int sum = firstHexadecimalNumber / secondHexadecimalNumber;

                return Integer.toHexString(sum);

            } else if (type.equals("octal")) {
                if (map.get(first).contains("8") || map.get(first).contains("9") && map.get(second).contains("9") || map.get(second).contains("8"))
                    return 0;

                int firstOctalNumber = Integer.parseInt(map.get(first), 8);
                int secondOctalNumber = Integer.parseInt(map.get(second), 8);

                int sum = firstOctalNumber / secondOctalNumber;

                return Integer.toOctalString(sum);

            } else if (type.equals("binary")) {

                int firstBinaryNumber = Integer.parseInt(map.get(first), 2);
                int secondBinaryNumber = Integer.parseInt(map.get(second), 2);

                int result = firstBinaryNumber / secondBinaryNumber;

                return Integer.toBinaryString(result);
            } else if (type.equals("number")) {

                int firstNumber = Integer.parseInt(map.get(first));
                int secondNumber = Integer.parseInt(map.get(second));

                return secondNumber / firstNumber;
            } else {

                return 0;
            }
        } else if (method.equals("INC")) {

            if (map.get(first) != null) {
                if (type.equals("decimal")) {
                    int firstNumber = Integer.parseInt(map.get(first));
                    int result = firstNumber + 1;
                    return result;
                } else if (type.equals("hex")) {


                    int firstHexadecimalNumber = Integer.parseInt(map.get(first), 16);


                    int sum = firstHexadecimalNumber + 1;

                    return Integer.toHexString(sum);

                } else if (type.equals("octal")) {
                    if (map.get(first).contains("8") || map.get(first).contains("9") && map.get(second).contains("9") || map.get(second).contains("8"))
                        return 0;

                    int firstOctalNumber = Integer.parseInt(map.get(first), 8);


                    int sum = firstOctalNumber + 1;

                    return Integer.toOctalString(sum);

                } else if (type.equals("binary")) {

                    int firstBinaryNumber = Integer.parseInt(map.get(first), 2);


                    int result = firstBinaryNumber + 1;

                    return Integer.toBinaryString(result);
                } else if (type.equals("number")) {

                    int firstNumber = Integer.parseInt(map.get(first));


                    return firstNumber + 1;
                } else {

                    return 0;
                }

            }
        } else if (method.equals("DEC")) {

            if (map.get(first) != null) {
                if (type.equals("decimal")) {
                    int firstNumber = Integer.parseInt(map.get(first));
                    int result = firstNumber - 1;
                    return result;
                } else if (type.equals("hex")) {


                    int firstHexadecimalNumber = Integer.parseInt(map.get(first), 16);


                    int sum = firstHexadecimalNumber - 1;

                    return Integer.toHexString(sum);

                } else if (type.equals("octal")) {
                    if (map.get(first).contains("8") || map.get(first).contains("9") && map.get(second).contains("9") || map.get(second).contains("8"))
                        return 0;

                    int firstOctalNumber = Integer.parseInt(map.get(first), 8);


                    int sum = firstOctalNumber - 1;

                    return Integer.toOctalString(sum);

                } else if (type.equals("binary")) {

                    int firstBinaryNumber = Integer.parseInt(map.get(first), 2);


                    int result = firstBinaryNumber - 1;

                    return Integer.toBinaryString(result);
                } else if (type.equals("number")) {

                    int firstNumber = Integer.parseInt(map.get(first));


                    return firstNumber - 1;
                } else {

                    return 0;
                }

            }
        }


        return 0;
    }

}
