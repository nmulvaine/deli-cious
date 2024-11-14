package com.pluralsight.capstone2.utilities;


import java.util.Scanner;

// Gets input options from the user userInput/userChoice, possibly Swing input
// Making class for potential of Swing interface
public class UserChoice<UC>
{
    Scanner scan = new Scanner(System.in);
    public UC choice;

    public UserChoice(UC choice)
    {
        this.choice = choice;
    }


    public UC getChoice()
    {
        return choice;
    }

    public void setChoice(UC choice)
    {
        this.choice = choice;
    }

    public Scanner getScan()
    {
        return scan;
    }

    public void setScan(Scanner scan)
    {
        this.scan = scan;
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

