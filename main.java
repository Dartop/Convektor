//1234

package com.company;
import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        char us_dollar_sym = 36;
        char pound_sym = 163;
        char yen_sym = 165;
        char euro_sym = 8364;
        char poland_sym = 7;
        char Franks_sym  = 35 ;
        char inr_sym  = 76 ;



        String us_dollar = "Dollars";
        String pound = "Pounds";
        String yen = "Yen";
        String euro = "Euros";
        String poland = "zloties";
        String Franks = "Franks";
        String Inr = "inr";
        double rate = 0;

        // Interface
        System.out.println("Welcome to the Currency Converter Program \n");
        System.out
                .println("Use the following codes to input your currency choices: \n 1 - US dollars \n 2 - Euros \n 3 - British Pounds \n 4 - Japanese Yen \n 5 - Poland zloty \n 6 - Switzerland Franks \n7 - India" + " \n" );

        //
        System.out.println("Please choose the input currency:");
        Scanner in = new Scanner(System.in);
        byte choice = in.nextByte();

        String inType = null;
        switch (choice) {
            case 1:
                inType = "US Dollars >> " + us_dollar_sym;
                break;
            case 2:
                inType = "Euros >> " + euro_sym;
                break;
            case 3:
                inType = "British Pounds >> " + pound_sym;
                break;
            case 4:
                inType = "Japanese Yen >> " + yen_sym;
                break;
            case 5:
                inType = "Poland zloty >> " + poland_sym;
                break;
            case 6:
                inType = "Switzerland Franks >> " + Franks_sym ;
                break;
            case 7:
                inType = "inr >> " + inr_sym ;
                break;

            default:
                System.out
                        .println("Please restart the program & enter a number from the list.");
                return;
        }

        System.out.println("Please choose the output currency");
        byte output = in.nextByte();

        System.out.printf("Now enter the input in " + inType);
        double input = in.nextDouble();

        if (choice == output)
            System.out.println("Same currency no need to convert");

        if (choice == 1 && output == 2) {
            double dollar_euro_rate = 0.78391;
            rate = input * dollar_euro_rate;
            System.out.printf("%s" + input + " at a conversion rate of "
                            + dollar_euro_rate + " Dollars to %s = %.2f\n",
                    (char) us_dollar_sym, euro, rate);
        } else if (choice == 1 && output == 3) {
            double dollar_pound_rate = 0.621484;
            rate = input * dollar_pound_rate;
            System.out.printf("%s" + input + " at a conversion rate of "
                            + dollar_pound_rate + " Dollars to %s = %.2f\n",
                    (char) us_dollar_sym, pound, rate);
        } else if (choice == 1 && output == 4) {
            double dollar_yen_rate = 107.174;
            rate = input * dollar_yen_rate;
            System.out.printf("%s" + input + " at a conversion rate of "
                            + dollar_yen_rate + " Dollars to %s = %.2f\n",
                    (char) us_dollar_sym, yen, rate);
        }
        if (choice == 2 && output == 1) {
            double euro_dollar_rate = 1.27579;
            rate = input * euro_dollar_rate;
            System.out.printf("%s" + input + " at a conversion rate of "
                            + euro_dollar_rate + " Euros to %s = %.2f\n",
                    (char) euro_sym, us_dollar, rate);
        } else if (choice == 2 && output == 3) {
            double euro_pound_rate = 0.792648;
            rate = input * euro_pound_rate;
            System.out.printf("%s" + input + " at a conversion rate of "
                            + euro_pound_rate + " Euros to %s = %.2f\n",
                    (char) euro_sym, pound, rate);
        } else if (choice == 2 && output == 4) {
            double euro_yen_rate = 136.708;
            rate = input * euro_yen_rate;
            System.out.printf("%s" + input + " at a conversion rate of "
                            + euro_yen_rate + " Euros to %s = %.2f\n", (char) euro_sym,
                    yen, rate);
        }
        if (choice == 3 && output == 1) {
            double pound_dollar_rate = 1.60972;
            rate = input * pound_dollar_rate;
            System.out.printf("%s" + input + " at a conversion rate of "
                            + pound_dollar_rate + " Pounds to %s = %.2f\n",
                    (char) pound_sym, us_dollar, rate);
        } else if (choice == 3 && output == 2) {
            double pound_euro_rate = 1.26161;
            rate = input * pound_euro_rate;
            System.out.printf("%s" + input + " at a conversion rate of "
                            + pound_euro_rate + " Pounds to %s = %.2f\n",
                    (char) pound_sym, euro, rate);
        } else if (choice == 3 && output == 4) {
            double pound_yen_rate = 172.511;
            rate = input * pound_yen_rate;
            System.out.printf("%s" + input + " at a conversion rate of "
                            + pound_yen_rate + " Pounds to %s = %.2f\n",
                    (char) pound_sym, yen, rate);
        }
        if (choice == 4 && output == 1) {
            double yen_dollar_rate = 0.00932574;
            rate = input * yen_dollar_rate;
            System.out.printf("%s" + input + " at a conversion rate of "
                            + yen_dollar_rate + " Yen to %s = %.2f\n", (char) yen_sym,
                    us_dollar, rate);
        } else if (choice == 4 && output == 2) {
            double yen_euro_rate = 0.00730615;
            rate = input * yen_euro_rate;
            System.out.printf("%s" + input + " at a conversion rate of "
                            + yen_euro_rate + " Yen to %s = %.2f\n", (char) yen_sym,
                    euro, rate);
        } else if (choice == 4 && output == 3) {

            double yen_pound_rate = 0.00579135;
            rate = input * yen_pound_rate;
            System.out.printf("%s" + input + " at a conversion rate of "
                            + yen_pound_rate + " Yen to %s = %.2f\n", (char) yen_sym,
                    pound, rate);
        }else if (choice == 5 && output == 4) {

            double poland_yen_sym = 0.00579135;
            rate = input *  poland_yen_sym;
            System.out.printf("%s" + input + " at a conversion rate of "
                            + poland_yen_sym + " Zloties to %s = %.2f\n", (char) poland_sym,
                    yen, rate);
        }else if (choice == 4 && output == 5) {

            double yen_poland_sym = 0.00579135;
            rate = input *  yen_poland_sym ;
            System.out.printf("%s" + input + " at a conversion rate of "
                            + yen_poland_sym  + " Zloties to %s = %.2f\n", (char) yen_sym,
                    poland, rate);
        }else if (choice == 5 && output == 3) {

            double poland_pound_sym = 0.00579135;
            rate = input *  poland_pound_sym ;
            System.out.printf("%s" + input + " at a conversion rate of "
                            + poland_pound_sym  + " Zloties to %s = %.2f\n", (char) poland_sym,
                    pound, rate);
        }else if (choice == 3 && output == 5) {

            double pound_poland_sym = 0.00579135;
            rate = input *  pound_poland_sym  ;
            System.out.printf("%s" + input + " at a conversion rate of "
                            + poland  + " pound to %s = %.2f\n", (char) pound_sym,
                    poland, rate);
        }else if (choice == 5 && output == 2) {

            double poland_euro_sym = 0.00579135;
            rate = input *  poland_euro_sym  ;
            System.out.printf("%s" + input + " at a conversion rate of "
                            +  poland + "poland to %s = %.2f\n", (char) poland_sym,
                    euro, rate);
        }else if (choice == 2 && output == 5) {

            double euro_poland_sym = 0.00579135;
            rate = input *  euro_poland_sym  ;
            System.out.printf("%s" + input + " at a conversion rate of "
                            + poland  + " euro to %s = %.2f\n", (char) euro_sym,
                    poland, rate);

        }else if (choice == 6 && output == 5) {

            double Franks_poland_sym = 0.00579135;
            rate = input * Franks_poland_sym  ;
            System.out.printf("%s" + input + " at a conversion rate of "
                            +  poland + "Franks to %s = %.2f\n", (char) Franks_sym,
                    poland, rate);
        }else if (choice == 5 && output == 6) {

            double poland_Franks_sym = 0.00579135;
            rate = input *  poland_Franks_sym  ;
            System.out.printf("%s" + input + " at a conversion rate of "
                            +  Franks + "poland to %s = %.2f\n", (char) poland_sym,
                    Franks, rate);
        }else if (choice == 2 && output == 6) {

            double euro_Franks_sym = 0.00579135;
            rate = input *  euro_Franks_sym;
            System.out.printf("%s" + input + " at a conversion rate of "
                            +  euro + "Franks to %s = %.2f\n", (char) euro_sym,
                    Franks, rate);
        }else if (choice == 6 && output == 2) {

            double Franks_euro_sym = 0.00579135;
            rate = input *  Franks_euro_sym;
            System.out.printf("%s" + input + " at a conversion rate of "
                            +  Franks + "euro to %s = %.2f\n", (char) Franks_sym,
                    euro, rate);
        }else if (choice == 6 && output == 4) {

            double Franks_yen_sym = 0.00579135;
            rate = input * Franks_yen_sym ;
            System.out.printf("%s" + input + " at a conversion rate of "
                            +  yen + " Franks to %s = %.2f\n", (char) Franks_sym,
                    yen, rate);
        }else if (choice == 4 && output == 6) {

            double yen_Franks_sym = 0.00579135;
            rate = input *  yen_Franks_sym  ;
            System.out.printf("%s" + input + " at a conversion rate of "
                            +  Franks + "yen to %s = %.2f\n", (char)  yen_sym,
                    Franks, rate);
        }else if (choice == 6 && output == 3) {

            double Franks_pound_sym = 0.00579135;
            rate = input *  Franks_pound_sym  ;
            System.out.printf("%s" + input + " at a conversion rate of "
                            +  pound+ "Franks to %s = %.2f\n", (char) Franks_sym,
                    pound, rate);
        }else if (choice == 3 && output == 6) {

            double pound_Franks_sym = 0.00579135;
            rate = input *  pound_Franks_sym ;
            System.out.printf("%s" + input + " at a conversion rate of "
                            +  Franks + "pound to %s = %.2f\n", (char) pound_sym,
                    Franks, rate);
        }else if (choice == 1 && output == 6) {

            double dollars_Franks_sym = 0.00579135;
            rate = input *  dollars_Franks_sym ;
            System.out.printf("%s" + input + " at a conversion rate of "
                            +  Franks + "dollars to %s = %.2f\n", (char) us_dollar_sym,
                    Franks, rate);
        }else if (choice == 6 && output == 1) {
            double Franks_dollars_sym =   0.00579135;
            rate = input *  Franks_dollars_sym;
            System.out.printf("%s" + input + " at a conversion rate of "
                            +  us_dollar  + "Franks to %s = %.2f\n", (char) us_dollar_sym,
                    Franks, rate);
        }else if (choice == 6 && output == 7) {

            double Franks_inr_sym = 0.0129;
            rate = input *  Franks_inr_sym;
            System.out.printf("%s" + input + " at a conversion rate of "
                            +  Inr  + "Franks to %s = %.2f\n", (char) inr_sym,
                    Franks, rate);
        }else if (choice == 7 && output == 6) {

            double inr_Franks_sym = 0.0129;
            rate = input *  inr_Franks_sym;
            System.out.printf("%s" + input + " at a conversion rate of "
                            +  Inr  + "Franks to %s = %.2f\n", (char) Franks_sym,
                    Inr, rate);
        }else if (choice == 7 && output ==1) {

            double inr_dollars_sym = 0.01189;
            rate = input *  inr_dollars_sym;
            System.out.printf("%s" + input + " at a conversion rate of "
                            +  Inr  + " dollars  to %s = %.2f\n", (char) us_dollar_sym,
                    Inr, rate);
        }else if (choice == 1 && output == 7) {

            double  dollars_inr_sym = 0.01315;
            rate = input *  dollars_inr_sym;
            System.out.printf("%s" + input + " at a conversion rate of "
                            +  Inr  + " dollars  to %s = %.2f\n", (char) inr_sym,
                    us_dollar, rate);
        }else if (choice == 2 && output ==7) {

            double  euro_inr_sym = 84.1075;
            rate = input * euro_inr_sym;
            System.out.printf("%s" + input + " at a conversion rate of "
                            +  Inr  + "euro  to %s = %.2f\n", (char) inr_sym,
                    euro, rate);
        }else if (choice == 7 && output ==2) {

            double  inr_euro_sym = 84.1075;
            rate = input * inr_euro_sym;
            System.out.printf("%s" + input + " at a conversion rate of "
                            +  Inr  + " euro  to %s = %.2f\n", (char) euro_sym,
                    Inr, rate);
        }else if (choice == 7 && output ==4) {

            double  inr_yen_sym = 1.567;
            rate = input * inr_yen_sym;
            System.out.printf("%s" + input + " at a conversion rate of "
                            +  Inr  + " inr  to %s = %.2f\n", (char) yen_sym,
                    Inr, rate);
        }else if (choice == 4 && output ==7) {

            double  yen_inr_sym = 1.567;
            rate = input * yen_inr_sym;
            System.out.printf("%s" + input + " at a conversion rate of "
                            +  Inr  + " dollars  to %s = %.2f\n", (char) inr_sym,
                    yen, rate);
        }else if (choice == 3 && output ==7) {

            double  pound_inr_sym = 100.61;
            rate = input *  pound_inr_sym;
            System.out.printf("%s" + input + " at a conversion rate of "
                            +  Inr  + " dollars  to %s = %.2f\n", (char)  pound_sym,
                    Inr, rate);
        }else if (choice == 7 && output ==3) {

            double  inr_pound_sym = 100.61;
            rate = input * inr_pound_sym;
            System.out.printf("%s" + input + " at a conversion rate of "
                            +  Inr  + " dollars  to %s = %.2f\n", (char) inr_sym,
                    pound, rate);
        }else if (choice == 7 && output ==5) {

            double  inr_pound_sym =0.058 ;
            rate = input * inr_pound_sym;
            System.out.printf("%s" + input + " at a conversion rate of "
                            +  Inr  + " dollars  to %s = %.2f\n", (char) inr_sym,
                    pound, rate);
        }else if (choice == 5 && output ==7) {

            double  pound_inr_sym =0.058 ;
            rate = input * pound_inr_sym;
            System.out.printf("%s" + input + " at a conversion rate of "
                            +  Inr  + " dollars  to %s = %.2f\n", (char) pound_sym,
                    Inr, rate);





        }
        System.out.println("Thank you for using the currency converter");
        System.out.println("ctoby prodolzit obmen nazmite 1 a ctopi zaconcit nacmite ");
        Scanner in1 = new Scanner(System.in);
        byte choice1 = in.nextByte();
        if (choice1 == 1){
            System.out.println("Menat valutu dalhe");
        }
       else{ System.out.println("ostanoviti prigramu");}

        byte i = 0 ;
        for (i = 0;i < 7; i++){
            main2();
        
        }

            
        }
        public static int main2(){
            char us_dollar_sym = 36;
            char pound_sym = 163;
            char yen_sym = 165;
            char euro_sym = 8364;
            char poland_sym = 7;
            char Franks_sym  = 35 ;
            char inr_sym  = 76 ;



            String us_dollar = "Dollars";
            String pound = "Pounds";
            String yen = "Yen";
            String euro = "Euros";
            String poland = "zloties";
            String Franks = "Franks";
            String Inr = "inr";
            double rate = 0;

            // Interface
            System.out.println("Welcome to the Currency Converter Program \n");
            System.out
                    .println("Use the following codes to input your currency choices: \n 1 - US dollars \n 2 - Euros \n 3 - British Pounds \n 4 - Japanese Yen \n 5 - Poland zloty \n 6 - Switzerland Franks \n7 - India" + " \n" );

            //
            System.out.println("Please choose the input currency:");
            Scanner in = new Scanner(System.in);
            byte choice = in.nextByte();

            String inType = null;
            switch (choice) {
                case 1:
                    inType = "US Dollars >> " + us_dollar_sym;
                    break;
                case 2:
                    inType = "Euros >> " + euro_sym;
                    break;
                case 3:
                    inType = "British Pounds >> " + pound_sym;
                    break;
                case 4:
                    inType = "Japanese Yen >> " + yen_sym;
                    break;
                case 5:
                    inType = "Poland zloty >> " + poland_sym;
                    break;
                case 6:
                    inType = "Switzerland Franks >> " + Franks_sym ;
                    break;
                case 7:
                    inType = "inr >> " + inr_sym ;
                    break;

                default:
                    System.out
                            .println("Please restart the program & enter a number from the list.");

            }

            System.out.println("Please choose the output currency");
            byte output = in.nextByte();

            System.out.printf("Now enter the input in " + inType);
            double input = in.nextDouble();

            if (choice == output)
                System.out.println("Same currency no need to convert");

            if (choice == 1 && output == 2) {
                double dollar_euro_rate = 0.78391;
                rate = input * dollar_euro_rate;
                System.out.printf("%s" + input + " at a conversion rate of "
                                + dollar_euro_rate + " Dollars to %s = %.2f\n",
                        (char) us_dollar_sym, euro, rate);
            } else if (choice == 1 && output == 3) {
                double dollar_pound_rate = 0.621484;
                rate = input * dollar_pound_rate;
                System.out.printf("%s" + input + " at a conversion rate of "
                                + dollar_pound_rate + " Dollars to %s = %.2f\n",
                        (char) us_dollar_sym, pound, rate);
            } else if (choice == 1 && output == 4) {
                double dollar_yen_rate = 107.174;
                rate = input * dollar_yen_rate;
                System.out.printf("%s" + input + " at a conversion rate of "
                                + dollar_yen_rate + " Dollars to %s = %.2f\n",
                        (char) us_dollar_sym, yen, rate);
            }
            if (choice == 2 && output == 1) {
                double euro_dollar_rate = 1.27579;
                rate = input * euro_dollar_rate;
                System.out.printf("%s" + input + " at a conversion rate of "
                                + euro_dollar_rate + " Euros to %s = %.2f\n",
                        (char) euro_sym, us_dollar, rate);
            } else if (choice == 2 && output == 3) {
                double euro_pound_rate = 0.792648;
                rate = input * euro_pound_rate;
                System.out.printf("%s" + input + " at a conversion rate of "
                                + euro_pound_rate + " Euros to %s = %.2f\n",
                        (char) euro_sym, pound, rate);
            } else if (choice == 2 && output == 4) {
                double euro_yen_rate = 136.708;
                rate = input * euro_yen_rate;
                System.out.printf("%s" + input + " at a conversion rate of "
                                + euro_yen_rate + " Euros to %s = %.2f\n", (char) euro_sym,
                        yen, rate);
            }
            if (choice == 3 && output == 1) {
                double pound_dollar_rate = 1.60972;
                rate = input * pound_dollar_rate;
                System.out.printf("%s" + input + " at a conversion rate of "
                                + pound_dollar_rate + " Pounds to %s = %.2f\n",
                        (char) pound_sym, us_dollar, rate);
            } else if (choice == 3 && output == 2) {
                double pound_euro_rate = 1.26161;
                rate = input * pound_euro_rate;
                System.out.printf("%s" + input + " at a conversion rate of "
                                + pound_euro_rate + " Pounds to %s = %.2f\n",
                        (char) pound_sym, euro, rate);
            } else if (choice == 3 && output == 4) {
                double pound_yen_rate = 172.511;
                rate = input * pound_yen_rate;
                System.out.printf("%s" + input + " at a conversion rate of "
                                + pound_yen_rate + " Pounds to %s = %.2f\n",
                        (char) pound_sym, yen, rate);
            }
            if (choice == 4 && output == 1) {
                double yen_dollar_rate = 0.00932574;
                rate = input * yen_dollar_rate;
                System.out.printf("%s" + input + " at a conversion rate of "
                                + yen_dollar_rate + " Yen to %s = %.2f\n", (char) yen_sym,
                        us_dollar, rate);
            } else if (choice == 4 && output == 2) {
                double yen_euro_rate = 0.00730615;
                rate = input * yen_euro_rate;
                System.out.printf("%s" + input + " at a conversion rate of "
                                + yen_euro_rate + " Yen to %s = %.2f\n", (char) yen_sym,
                        euro, rate);
            } else if (choice == 4 && output == 3) {

                double yen_pound_rate = 0.00579135;
                rate = input * yen_pound_rate;
                System.out.printf("%s" + input + " at a conversion rate of "
                                + yen_pound_rate + " Yen to %s = %.2f\n", (char) yen_sym,
                        pound, rate);
            }else if (choice == 5 && output == 4) {

                double poland_yen_sym = 0.00579135;
                rate = input *  poland_yen_sym;
                System.out.printf("%s" + input + " at a conversion rate of "
                                + poland_yen_sym + " Zloties to %s = %.2f\n", (char) poland_sym,
                        yen, rate);
            }else if (choice == 4 && output == 5) {

                double yen_poland_sym = 0.00579135;
                rate = input *  yen_poland_sym ;
                System.out.printf("%s" + input + " at a conversion rate of "
                                + yen_poland_sym  + " Zloties to %s = %.2f\n", (char) yen_sym,
                        poland, rate);
            }else if (choice == 5 && output == 3) {

                double poland_pound_sym = 0.00579135;
                rate = input *  poland_pound_sym ;
                System.out.printf("%s" + input + " at a conversion rate of "
                                + poland_pound_sym  + " Zloties to %s = %.2f\n", (char) poland_sym,
                        pound, rate);
            }else if (choice == 3 && output == 5) {

                double pound_poland_sym = 0.00579135;
                rate = input *  pound_poland_sym  ;
                System.out.printf("%s" + input + " at a conversion rate of "
                                + poland  + " pound to %s = %.2f\n", (char) pound_sym,
                        poland, rate);
            }else if (choice == 5 && output == 2) {

                double poland_euro_sym = 0.00579135;
                rate = input *  poland_euro_sym  ;
                System.out.printf("%s" + input + " at a conversion rate of "
                                +  poland + "poland to %s = %.2f\n", (char) poland_sym,
                        euro, rate);
            }else if (choice == 2 && output == 5) {

                double euro_poland_sym = 0.00579135;
                rate = input *  euro_poland_sym  ;
                System.out.printf("%s" + input + " at a conversion rate of "
                                + poland  + " euro to %s = %.2f\n", (char) euro_sym,
                        poland, rate);

            }else if (choice == 6 && output == 5) {

                double Franks_poland_sym = 0.00579135;
                rate = input * Franks_poland_sym  ;
                System.out.printf("%s" + input + " at a conversion rate of "
                                +  poland + "Franks to %s = %.2f\n", (char) Franks_sym,
                        poland, rate);
            }else if (choice == 5 && output == 6) {

                double poland_Franks_sym = 0.00579135;
                rate = input *  poland_Franks_sym  ;
                System.out.printf("%s" + input + " at a conversion rate of "
                                +  Franks + "poland to %s = %.2f\n", (char) poland_sym,
                        Franks, rate);
            }else if (choice == 2 && output == 6) {

                double euro_Franks_sym = 0.00579135;
                rate = input *  euro_Franks_sym;
                System.out.printf("%s" + input + " at a conversion rate of "
                                +  euro + "Franks to %s = %.2f\n", (char) euro_sym,
                        Franks, rate);
            }else if (choice == 6 && output == 2) {

                double Franks_euro_sym = 0.00579135;
                rate = input *  Franks_euro_sym;
                System.out.printf("%s" + input + " at a conversion rate of "
                                +  Franks + "euro to %s = %.2f\n", (char) Franks_sym,
                        euro, rate);
            }else if (choice == 6 && output == 4) {

                double Franks_yen_sym = 0.00579135;
                rate = input * Franks_yen_sym ;
                System.out.printf("%s" + input + " at a conversion rate of "
                                +  yen + " Franks to %s = %.2f\n", (char) Franks_sym,
                        yen, rate);
            }else if (choice == 4 && output == 6) {

                double yen_Franks_sym = 0.00579135;
                rate = input *  yen_Franks_sym  ;
                System.out.printf("%s" + input + " at a conversion rate of "
                                +  Franks + "yen to %s = %.2f\n", (char)  yen_sym,
                        Franks, rate);
            }else if (choice == 6 && output == 3) {

                double Franks_pound_sym = 0.00579135;
                rate = input *  Franks_pound_sym  ;
                System.out.printf("%s" + input + " at a conversion rate of "
                                +  pound+ "Franks to %s = %.2f\n", (char) Franks_sym,
                        pound, rate);
            }else if (choice == 3 && output == 6) {

                double pound_Franks_sym = 0.00579135;
                rate = input *  pound_Franks_sym ;
                System.out.printf("%s" + input + " at a conversion rate of "
                                +  Franks + "pound to %s = %.2f\n", (char) pound_sym,
                        Franks, rate);
            }else if (choice == 1 && output == 6) {

                double dollars_Franks_sym = 0.00579135;
                rate = input *  dollars_Franks_sym ;
                System.out.printf("%s" + input + " at a conversion rate of "
                                +  Franks + "dollars to %s = %.2f\n", (char) us_dollar_sym,
                        Franks, rate);
            }else if (choice == 6 && output == 1) {
                double Franks_dollars_sym =   0.00579135;
                rate = input *  Franks_dollars_sym;
                System.out.printf("%s" + input + " at a conversion rate of "
                                +  us_dollar  + "Franks to %s = %.2f\n", (char) us_dollar_sym,
                        Franks, rate);
            }else if (choice == 6 && output == 7) {

                double Franks_inr_sym = 0.0129;
                rate = input *  Franks_inr_sym;
                System.out.printf("%s" + input + " at a conversion rate of "
                                +  Inr  + "Franks to %s = %.2f\n", (char) inr_sym,
                        Franks, rate);
            }else if (choice == 7 && output == 6) {

                double inr_Franks_sym = 0.0129;
                rate = input *  inr_Franks_sym;
                System.out.printf("%s" + input + " at a conversion rate of "
                                +  Inr  + "Franks to %s = %.2f\n", (char) Franks_sym,
                        Inr, rate);
            }else if (choice == 7 && output ==1) {

                double inr_dollars_sym = 0.01189;
                rate = input *  inr_dollars_sym;
                System.out.printf("%s" + input + " at a conversion rate of "
                                +  Inr  + " dollars  to %s = %.2f\n", (char) us_dollar_sym,
                        Inr, rate);
            }else if (choice == 1 && output == 7) {

                double  dollars_inr_sym = 0.01315;
                rate = input *  dollars_inr_sym;
                System.out.printf("%s" + input + " at a conversion rate of "
                                +  Inr  + " dollars  to %s = %.2f\n", (char) inr_sym,
                        us_dollar, rate);
            }else if (choice == 2 && output ==7) {

                double  euro_inr_sym = 84.1075;
                rate = input * euro_inr_sym;
                System.out.printf("%s" + input + " at a conversion rate of "
                                +  Inr  + "euro  to %s = %.2f\n", (char) inr_sym,
                        euro, rate);
            }else if (choice == 7 && output ==2) {

                double  inr_euro_sym = 84.1075;
                rate = input * inr_euro_sym;
                System.out.printf("%s" + input + " at a conversion rate of "
                                +  Inr  + " euro  to %s = %.2f\n", (char) euro_sym,
                        Inr, rate);
            }else if (choice == 7 && output ==4) {

                double  inr_yen_sym = 1.567;
                rate = input * inr_yen_sym;
                System.out.printf("%s" + input + " at a conversion rate of "
                                +  Inr  + " inr  to %s = %.2f\n", (char) yen_sym,
                        Inr, rate);
            }else if (choice == 4 && output ==7) {

                double  yen_inr_sym = 1.567;
                rate = input * yen_inr_sym;
                System.out.printf("%s" + input + " at a conversion rate of "
                                +  Inr  + " dollars  to %s = %.2f\n", (char) inr_sym,
                        yen, rate);
            }else if (choice == 3 && output ==7) {

                double  pound_inr_sym = 100.61;
                rate = input *  pound_inr_sym;
                System.out.printf("%s" + input + " at a conversion rate of "
                                +  Inr  + " dollars  to %s = %.2f\n", (char)  pound_sym,
                        Inr, rate);
            }else if (choice == 7 && output ==3) {

                double  inr_pound_sym = 100.61;
                rate = input * inr_pound_sym;
                System.out.printf("%s" + input + " at a conversion rate of "
                                +  Inr  + " dollars  to %s = %.2f\n", (char) inr_sym,
                        pound, rate);
            }else if (choice == 7 && output ==5) {

                double  inr_pound_sym =0.058 ;
                rate = input * inr_pound_sym;
                System.out.printf("%s" + input + " at a conversion rate of "
                                +  Inr  + " dollars  to %s = %.2f\n", (char) inr_sym,
                        pound, rate);
            }else if (choice == 5 && output ==7) {

                double  pound_inr_sym =0.058 ;
                rate = input * pound_inr_sym;
                System.out.printf("%s" + input + " at a conversion rate of "
                                +  Inr  + " dollars  to %s = %.2f\n", (char) pound_sym,
                        Inr, rate);
            }
       return 123;
    }



