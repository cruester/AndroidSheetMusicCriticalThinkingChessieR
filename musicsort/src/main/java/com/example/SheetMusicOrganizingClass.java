package com.example;

public class SheetMusicOrganizingClass {
    public static void main(String args[])
    {
        String titles[] = {"Poem", "Concertino", "Concerto in D Major", "Sonata in e minor",
                           "Serenade", "Analouse"};
        int duration[] = {7, 4, 9, 11, 3, 2};

        String era[] = {"Modern", "Romantic", "Classical", "Baroque", "Modern", "Romantic"};
        int temp = 0;
        String tempTitle = "";
        int tempPageNum = 0;
        String tempEra = "";
        int titleCounter = 0;
        int modernCounter = 0;
        int romanticCounter = 0;
        int classicalCounter = 0;
        int baroqueCounter = 0;
        String modernTitles[] = new String[2];
        String romanticTitles[] = new String[2];
        String classicalTitles[] = new String[1];
        String baroqueTitles[] = new String[1];
        int w = 0; //Modern title index incrementer
        int x = 0; //romantic title index incrementer
        int y = 0; //classical title index incrementer
        int z = 0; //baroque title index incrementer

        //List pieces in order of length
        //Sort in ascending order
        for (int i = 0; i < duration.length; i++)
        {
            for (int n = 0; n < (duration.length) - 1; n++)
            {
                if (duration[n] > duration[n+1])
                {
                    tempTitle = titles[n];
                    tempPageNum = duration[n];
                    tempEra = era[n];

                   titles[n] = titles[n+1];
                    duration[n] = duration[n+1];
                    era[n] = era[n+1];

                    titles[n+1] = tempTitle;
                    duration[n+1] = tempPageNum;
                    era[n+1] = tempEra;

                }
            }
        }

        System.out.println("Pieces sorted in order from least number of pages to greatest:");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < duration.length; i++)
        {
            System.out.println(titles[i] + ": " + duration[i]);
        }
        System.out.println("");



        for ( int i =0; i < era.length; i++)
        {
            if (era[i] == "Modern")
            {
                modernTitles[w] = titles[i];
                w++;
            }
            else if (era[i] == "Romantic")
            {
                romanticTitles[x] = titles[i];
                x++;
            }
            else if (era[i] == "Classical")
            {
                classicalTitles[y] = titles[i];
                y++;
            }
            else if (era[i] == "Baroque")
            {
                baroqueTitles[z] = titles[i];
                z++;
            }
            else
            {
                System.out.println("There was a problem");
            }

        }

        System.out.println("If you're looking for a Modern piece: ");
        for (int i = 0; i < modernTitles.length; i++)
        {
            System.out.println(modernTitles[i]);
        }
        System.out.println("");

        System.out.println("If you're looking for a Romantic piece: ");
        for (int i = 0; i < romanticTitles.length; i++)
        {
            System.out.println(romanticTitles[i]);
        }
        System.out.println("");

        System.out.println("If you're looking for a Classical piece: ");
        for (int i = 0; i < classicalTitles.length; i++)
        {
            System.out.println(classicalTitles[i]);
        }
        System.out.println("");

        System.out.println("If you're looking for a Baroque piece: ");
        for (int i = 0; i < baroqueTitles.length; i++)
        {
            System.out.println(baroqueTitles[i]);
        }
        System.out.println("");

    }
}
