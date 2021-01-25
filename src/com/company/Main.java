package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Assigment1


            short x = 22;
            short y = 109;

            Scanner inputx = new Scanner(System.in);
            System.out.println("Write x:");
            x = inputx.nextShort();
            System.out.println("X:" + x);

            Scanner inputy = new Scanner(System.in);
            System.out.println("Write y:");
            y = inputy.nextShort();
            System.out.println("Y:" + y);

            System.out.println("Max value:" + Math.max(x, y));
            System.out.println("Min value:" + Math.min(x, y));
            if (x == y) {
                System.out.println("Both variables are equals");
            } else {
                System.out.println("Both variables are not equal");
            }
            if (x % 2 == 0) {
                System.out.println("variable x is even");
            } else {
                System.out.println("variable x is ood");
            }

            if (y % 2 == 0) {
                System.out.println("variable y is even");
            } else {
                System.out.println("variable y is ood");
            }

            if ((x < 0) || (y < 0)) {
                System.out.println("There is  negative variable");
            } else {
                System.out.println("There is positive variable");

            }
            if (x < 100) {
                System.out.println("Variable x is less then 100");
            } else {
                System.out.println("Variable x is more then 100");
            }

            if (y < 100) {
                System.out.println("Variable y is less then 100");
            } else {
                System.out.println("Variable y is more then 100");
            }


        //Assigment2


            int time = 2;
            Scanner inputtime = new Scanner(System.in);
            System.out.println("Write time hour");
            time = inputtime.nextInt();

            if ((time <= 12) && (time > 0)) {
                System.out.println("Good Morning Sunshine!");
            }
            if ((time <= 19) && (time >= 13)) {
                System.out.println("Good Afternoon. Work Hard!");
            }
            if ((time >= 20) && (time <= 24)) {
                System.out.println("Good Evening. Get some rest!");
            }
            if ((time > 24) || (time < 0)) {
                System.out.println("Please wake up and check the time");
            }

        //Assigment3


            int day = 23;
            int month = 10;
            int year = 2021;
            if ((month >= 1) && (month <= 12) && (day >= 1) && (day <= 31)) {
                System.out.println(year + "/" + month + "/" + day);
            } else {
                System.out.println("Please check data");
            }

            Scanner input = new Scanner(System.in);
            System.out.println("Please write the day:");
            day = input.nextInt();

            System.out.println("Day: " + (day < 10 ? ("0" + day) : day));

            Scanner input1 = new Scanner(System.in);
            System.out.println("Please write the month:");
            month = input1.nextInt();
            System.out.println("Month: " + (month < 10 ? String.format("%02d", month) : month));

            Scanner input2 = new Scanner(System.in);
            System.out.println("Please write the year:");
            year = input2.nextInt();
            System.out.println("Year: " + year);

            Scanner input3 = new Scanner(System.in);
            System.out.println("Please select the date formatting. 1 - YYYY/MM/DD, 2- YYYY.MM.DD:");
            int date = input3.nextInt();
            System.out.println("Your date is: " + (date == 1 ? (year + "/" + (month < 10 ? ("0" + month) : month) + "/" + (day < 10 ? ("0" + day) : day)) : (year + "." + (month < 10 ? ("0" + month) : month) + "." + (day < 10 ? ("0" + day) : day))));

        // Assigment4

            // Task 4.2

            int year4 = 2021;
            int month4 = 5;
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter month and year");
            month4 = sc.nextInt();
            year4 = sc.nextInt();

            if ((month4 == 1) || (month4 == 3) || (month4 == 5) || (month4 == 7) || (month4 == 8) || (month4 == 10) || (month4 == 12)) {
                System.out.println("Number of days is 31");
            } else if ((month == 2) && ((year4 % 400 == 0) || (year4 % 4 == 0 && year4 % 100 != 0))) {
                System.out.println("Number of days is 29");
            } else if (month4 == 2) {
                System.out.println("Number of days is 28");
            } else {
                System.out.println("Number of days is 30");
            }

            //task 4.1
            int day4 = 4;
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Please enter day number from 1 to 365");
            day4 = sc2.nextInt();

            if ((day4 >= 1) && (day4 <= 31)) {
                System.out.println("January");
            } else if ((day4 >= 32) && (day4 <= 60) && ((year4 % 400 == 0) || (year4 % 4 == 0 && year4 % 100 != 0))) {
                System.out.println("February");
            } else if ((day4 >= 32) && (day4 <= 59)) {
                System.out.println("February");
            } else if ((day4 >= 60) && (day4 <= 90)) {
                System.out.println("March");
            } else if ((day4 >= 91) && (day4 <= 120)) {
                System.out.println("April");
            } else if ((day4 >= 121) && (day4 <= 151)) {
                System.out.println("May");
            } else if ((day4 >= 152) && (day4 <= 181)) {
                System.out.println("June");
            } else if ((day4 >= 182) && (day4 <= 212)) {
                System.out.println("July");
            } else if ((day4 >= 213) && (day4 <= 243)) {
                System.out.println("August");
            } else if ((day4 >= 244) && (day4 <= 273)) {
                System.out.println("September");
            } else if ((day4 >= 274) && (day4 <= 303)) {
                System.out.println("October");
            } else if ((day4 >= 304) && (day4 <= 333)) {
                System.out.println("November");
            } else if ((day4 >= 334) && (day4 <= 365)) {
                System.out.println("December");
            }

        // Assigment5



            int workingHoursInDay = 8;
            Scanner workh = new Scanner(System.in);
            System.out.println("Please enter working hours in day:");
            workingHoursInDay = workh.nextInt();
            if (workingHoursInDay < 0) {
                System.out.println("Please check data");
            } else if (workingHoursInDay <= 8) {
                int hourlyrate = 10;
                System.out.println("Salary is: " + (workingHoursInDay * hourlyrate) + "eur");
            } else if (workingHoursInDay > 8) {
                System.out.println("Salary is: " + (80 + (workingHoursInDay - 8) * 15) + "eur");
            }
        }

    }

























