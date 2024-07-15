package com.google.tryit.ds.google;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.exit;

public class YoutubeIncomeCheck {

public static void main(String args[])
    {
        double total=0;
        double total100=0;
        double totalmore100=0;
        Scanner x=new Scanner(System.in);
        int numberOfvideos=x.nextInt();
        int subscriber=x.nextInt();
        int views[]=new int[numberOfvideos];
        int likes[]=new int[numberOfvideos];
        for(int i=0;i<numberOfvideos;i++)
        {
            views[i]=x.nextInt();
            likes[i]=x.nextInt();
        }
        int totalLikes = Arrays.stream(likes).sum();
        int totalviews = Arrays.stream(views).sum();
        int minAmount = 0;
        if(numberOfvideos>=3)
        {
            if(totalviews>totalLikes&& subscriber>=100 && totalLikes>100 && totalviews>=100)
            {
                minAmount = 1;
                int remainingview = totalviews-100;
                int remainingSubscriber = subscriber - 100;
                totalmore100=5*(remainingview/50);
                System.out.println("totalmore100="+totalmore100);
            }
            else
            {
                System.out.println("Invalid");
                exit(1);
            }
        }
        total=(totalmore100+minAmount)*74.80;
        //total=total*74.80;
        System.out.println(total);

    }
}

