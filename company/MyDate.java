    package com.company;

    public class MyDate {
        private int year;
        private int month;
        private int day;
        private final String[] months={"Farvardin", "Ordibehesht", "Khordad", "Tir", "Mordad", "Shahrivar", "Mehr", "Aban", "Azar", "Dey", "Bahman", "Esfand"};

        public MyDate() {
            this.year = year;
            this.month = month;
            this.day = day;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public static boolean isValidDate(int year, int month, int day) {
                if (year>=1 && year<=9999) {
                if (month>=1 && month<=12) {{
                    if (month>=1 && month<=6) {
                        if (day>=1 && day<=30) {
                            return true;
                        }
                        }
                        if (month >= 7 && month <= 12) {
                            if (day>=1 && day<=31) {
                                return true;
                            }
                        }
                    }
                }
                }
                return false;
                }

        public String toString(int year,int month,int day) {
            return "Date{ " + " Day=" + day + ", Month= " + months[month - 1] + ", Year=" + year + " }";
        }
    }











