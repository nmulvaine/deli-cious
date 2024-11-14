package com.pluralsight.capstone2.utilities;


import java.util.Scanner;

// Gets input options from the user userInput/userChoice, possibly Swing input
// Making class for potential of Swing interface
public class UserChoice<T>
{
    Scanner scan = new Scanner(System.in);
    public T choice;

    public UserChoice(T choice)
    {
        this.choice = choice;
    }


    public T getChoice()
    {
        return choice;
    }

    public void setChoice(T choice)
    {
        this.choice = choice;
    }

    public Scanner getScan()
    {
        return scan;
    }


    @Override
    public String toString()
    {
        return "UserChoice{" +
               "choice=" + choice +
               ", scan=" + scan +
               '}';
    }
}