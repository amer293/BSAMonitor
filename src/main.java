/**
/@Title: BSA Monitor
/@Author: Amer Zahirovic
/@Group: IS109 SQUAD D
/@Description: Via deze applicatie check je je eigen bsa status
*/

import java.util.Scanner;
public class main {

    public static void main(String[] args)
    {

        //The grade that sets a fail if you get below 5,5 you fail
        final float FAILED_AT = 5.4f;

        //All Classes
        final String MATH = "Wiskunde";
        final String FASTEN_YOUR_SEATBELTS = "FYS";
        final String PROGRAMMING = "Programming";
        final String PERSONAL_SKILLS = "Personal Skills";
        final String USER_INTERACTION = "User Interaction";

        //Points to be earned if class is passed
        final Integer MATH_EC = 4;
        final Integer FASTEN_YOUR_SEATBELTS_EC = 12;
        final Integer PROGRAMMING_EC = 3;
        final Integer PERSONAL_SKILLS_EC = 3;
        final Integer USER_INTERACTION_EC = 6;
        final Integer FAILED_CLASS_EC = 0;

        //Save earned points
        int mathPoints = 0;
        int fysPoints = 0;
        int programmingPoints = 0;
        int personalSkillsPoints = 0;
        int userInteractionPoints = 0;
        int myPoints = 0;

        Scanner input = new Scanner(System.in);
        //All points sum'd up
        int totalPoints = MATH_EC + FASTEN_YOUR_SEATBELTS_EC + PROGRAMMING_EC + PERSONAL_SKILLS_EC + USER_INTERACTION_EC;

        System.out.println("Voer hier je cijfers in: ");
        System.out.println("");

        //Here you input your earned grade
        System.out.print(MATH + " : ");
        float myMathGrade = input.nextFloat();

        System.out.print(FASTEN_YOUR_SEATBELTS + " : ");
        float myFastenYourSeatbeltsGrade = input.nextFloat();

        System.out.print(PROGRAMMING + " : ");
        float myProgrammingGrade = input.nextFloat();

        System.out.print(PERSONAL_SKILLS + " : ");
        float myPersonalSkillsGrade = input.nextFloat();

        System.out.print(USER_INTERACTION + " : ");
        float myUserInteractionGrade = input.nextFloat();

        System.out.println("");

        //Calculates total points + points earned in classes
        if (myMathGrade > FAILED_AT)
        {
            //Total earned points
            myPoints = myPoints + MATH_EC;
            //Points earned for the class it self
            mathPoints = mathPoints + MATH_EC;
        }

        if (myFastenYourSeatbeltsGrade > FAILED_AT)
        {
            myPoints = myPoints + FASTEN_YOUR_SEATBELTS_EC;
            fysPoints = fysPoints + FASTEN_YOUR_SEATBELTS_EC;
        }

        if (myProgrammingGrade > FAILED_AT)
        {
            myPoints = myPoints + PROGRAMMING_EC;
            programmingPoints = programmingPoints + PROGRAMMING_EC;
        }

        if (myPersonalSkillsGrade > FAILED_AT)
        {
            myPoints = myPoints + PERSONAL_SKILLS_EC;
            personalSkillsPoints = personalSkillsPoints + PERSONAL_SKILLS_EC;
        }

        if (myUserInteractionGrade > FAILED_AT)
        {
            myPoints = myPoints + USER_INTERACTION_EC;
            userInteractionPoints = userInteractionPoints + USER_INTERACTION_EC;
        }

        //Display results
        System.out.println("Vak/Project: "+ MATH + " Cijfer: " + myMathGrade + " Behaalde punten: "+ mathPoints);
        System.out.println("Vak/Project: "+ FASTEN_YOUR_SEATBELTS + " Cijfer: " + myFastenYourSeatbeltsGrade + " Behaalde punten: "+ fysPoints);
        System.out.println("Vak/Project: "+ PROGRAMMING + " Cijfer: " + myProgrammingGrade + " Behaalde punten: "+ programmingPoints);
        System.out.println("Vak/Project: "+ PERSONAL_SKILLS + " Cijfer: " + myPersonalSkillsGrade + " Behaalde punten: "+ personalSkillsPoints);
        System.out.println( "Vak/Project: "+ USER_INTERACTION + " Cijfer: " + myUserInteractionGrade + " Behaalde punten: "+ userInteractionPoints);

        System.out.println("");

        //Prints out how many points you have earned total
        System.out.println("Totaal behaalde studiepunten: " + myPoints + "/" + totalPoints);
        System.out.println("");

        //If you have less points than 28 you are doing bad
        //If your points are 28 you are doing wellW
        if (myPoints < totalPoints)
        {
            System.out.println("PAS OP: je ligt op schema voor een negatief BSA! ");
        } else {
            System.out.println("Je ligt op schema voor een positief advies! ");
        }
    }

}
