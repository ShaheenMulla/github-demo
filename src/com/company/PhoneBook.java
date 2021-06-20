package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class PhoneBook {

    public static List<Employees> EmpAtoFList = new LinkedList<>();
    public static List<Employees> EmpGtoKList = new LinkedList<>();
    public static List<Employees> EmpLtoPList = new LinkedList<>();
    public static List<Employees> EmpQtoUList = new LinkedList<>();
    public static List<Employees> EmpVtoZList = new LinkedList<>();

    public static void main(String[] args) {

        //user input month and city
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Month");

        int empMonth = sc.nextInt();
        sc.nextLine();

        //validating month and city
        if (empMonth > 12 && empMonth != 0) {
            System.out.println("Please enter month range with in 1 to 12");
            System.exit(0);
        }
        System.out.println("Please enter User city");
        String empCity = sc.nextLine().toLowerCase();

        String path = "/home/costrategix/Downloads/Records.csv";
        String nextLine = "";
        String firstName = null;

        String AtoF = "ABCDEF";
        String GtoK = "GHIJK";
        String LtoP = "LMNOP";
        String QtoU = "QRSTU";
        String VtoZ = "VWXYZ";


        try {
            //Reading the csv file content using BufferedReader
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((nextLine = br.readLine()) != null) {
                String[] employee = nextLine.split(",");


                firstName = employee[2];
                if (firstName != null) {

                    Employees emp = new Employees();

                    emp.setFirstName(employee[2]);
                    emp.setLastName(employee[4]);
                    emp.setDob(employee[10]);
                    emp.setCity(employee[31]);

                    //comparing the index of the firstname
                    if (AtoF.indexOf(firstName.toUpperCase().charAt(0)) != -1) {
                        EmpAtoFList.add(emp);
                    } else if (GtoK.indexOf(firstName.toUpperCase().charAt(0)) != -1) {
                        EmpGtoKList.add(emp);
                    } else if (LtoP.indexOf(firstName.toUpperCase().charAt(0)) != -1) {
                        EmpLtoPList.add(emp);
                    } else if (QtoU.indexOf(firstName.toUpperCase().charAt(0)) != -1) {
                        EmpQtoUList.add(emp);

                    } else if (VtoZ.indexOf(firstName.toUpperCase().charAt(0)) != -1) {
                        EmpVtoZList.add(emp);

                    }

                }

            }

            //Getting the details from the list employees from A to F
            for (Employees emp : EmpAtoFList) {
                String month = null;
                String s1 = emp.getDob().trim();
                if (s1.length() > 9) {
                    month = s1.substring(0, 2);
                } else {
                    month = s1.substring(0, 1);
                }
                if (!month.trim().equals("Da")) {
                    if ((empMonth == Integer.parseInt(month)) && (emp.getCity().toLowerCase().equals(empCity))) {
                        System.out.println("Employee" + " " + emp.getFirstName()
                                + " " + emp.getLastName() + " from City  "
                                + emp.getCity() + " Have the birthday please wish on "
                                + emp.getDob());

                    }
                }
            }
            //Getting the details from the list employees from G to K
            for (Employees emp : EmpGtoKList) {
                String month = null;
                String s1 = emp.getDob().trim();
                if (s1.length() > 9) {
                    month = s1.substring(0, 2);
                } else {
                    month = s1.substring(0, 1);
                }
                if (!month.trim().equals("Da")) {
                    if ((empMonth == Integer.parseInt(month)) && (emp.getCity().toLowerCase().equals(empCity))) {
                        System.out.println("Employee" + " " + emp.getFirstName()
                                + " " + emp.getLastName() + " from City "
                                + emp.getCity() + " Have the birthday please wish  on "
                                + emp.getDob());

                    }
                }
            }
            //Getting the details from the list employees from L to P
            for (Employees emp : EmpLtoPList) {
                String month = null;
                String s1 = emp.getDob().trim();
                if (s1.length() > 9) {
                    month = s1.substring(0, 2);
                } else {
                    month = s1.substring(0, 1);
                }
                if (!month.trim().equals("Da")) {
                    if ((empMonth == Integer.parseInt(month)) && (emp.getCity().toLowerCase().equals(empCity))) {
                        System.out.println("Employee" + " " + emp.getFirstName()
                                + " " + emp.getLastName() + "  from City  "
                                + emp.getCity() + " Have the birthday please wish  on "
                                + emp.getDob());

                    }
                }
            }
            //Getting the details from the list employees from Q to U
            for (Employees emp : EmpQtoUList) {
                String month = null;
                String s1 = emp.getDob().trim();
                if (s1.length() > 9) {
                    month = s1.substring(0, 2);
                } else {
                    month = s1.substring(0, 1);
                }
                if (!month.trim().equals("Da")) {
                    if ((empMonth == Integer.parseInt(month)) && (emp.getCity().toLowerCase().equals(empCity))) {
                        System.out.println("Employee" + " " + emp.getFirstName()
                                + " " + emp.getLastName() + " from City  "
                                + emp.getCity() + " Have the birthday please wish  on "
                                + emp.getDob());

                    }
                }
            }
            //Getting the details from the list employees from V to Z
            for (Employees emp : EmpVtoZList) {
                String month = null;
                String s1 = emp.getDob().trim();
                if (s1.length() > 9) {
                    month = s1.substring(0, 2);
                } else {
                    month = s1.substring(0, 1);
                }
                if (!month.trim().equals("Da")) {
                    if ((empMonth == Integer.parseInt(month)) && (emp.getCity().toLowerCase().equals(empCity))) {
                        System.out.println("Employee" + " " + emp.getFirstName()
                                + " " + emp.getLastName() + " from City  "
                                + emp.getCity() + " Have the birthday please wish  on "
                                + emp.getDob());

                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}