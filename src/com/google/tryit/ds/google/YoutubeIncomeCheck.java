package com.google.tryit.ds.google;
import java.util.*;

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
            System.out.println("views="+views[i]);
            likes[i]=x.nextInt();
            System.out.println("likes="+likes[i]);
        }
        for(int i=0;i<numberOfvideos;i++)
        {
            if(numberOfvideos>=3 && views[i]>likes[i])
            {
                if(views[i]<=100 || likes[i]<=100)
                {
                    total100+=1*((views[i]));
                }
                else if(views[i]>100 || likes[i]>100)
                {
                    totalmore100+=5*(views[i]/50);
                }
            }
            else
            {
                System.out.println("Invalid");
                exit(1);
            }
        }
        total=(totalmore100+total100)*74.80;
        //total=total*74.80;
        System.out.println(total);

    }
}

