package com.company;

public class Main {

    public static void main(String[] args) {

        //Declare one 3 sided die, roll the die 10000 times and count each resulting the number
        //	Print out how many 1's, 2's, and 3's were rolled along with the percent of the total rolls
        //	Round off the percent output to the tenths place

        Dice3 d03 = new Dice3();
        d03.sides(3);
        int totalNumber = 0;
        int ones = 0;
        int twos = 0;
        int threes = 0;

        for (int i = 0; i == 1; i++)
        {
            d03.roll();
            totalNumber += d03.LastRoll();

            if(d03.LastRoll() == 1)
            {
                ones++;
            }
            if (d03.LastRoll() == 2)
            {
                twos++;
            }
            if(d03.LastRoll() == 3)
            {
                threes++;
            }
        }
    }
}
