// DSAA Week 1 Day 3-4, 7/16/2024

package Week1Day4.calculator_JAVA;

public class functions 
{
    // Fahrenheit to Celsius
    static double f_c (double fTemp)
    {
        double result = (fTemp - 32) * (5/9);
        return result;
    }

    // Fahrenheit to Kelvin
    static double f_k(double fTemp)
    {
        double result = (fTemp - 32) * (5/9) + 273.15;
        return result;
    }

    // Celsius to Fahrenheit
    static double c_f(double cTemp)
    {
        double result = (cTemp * (9/5)) + 32;
        return result;
    }

    // Celsius to Kelvin
    static double c_k(double cTemp)
    {
        double result = cTemp + 273.15;
        return result;
    }

    // Kelvin to Fahrenheit
    static double k_f(double kTemp)
    {
        double result = (kTemp - 273.15) * (9/5) + 32;
        return result;
    }

    // Kelvin to Celsius
    static double k_c(double kTemp)
    {
        double result = kTemp - 273.15;
        return result;
    }
}
