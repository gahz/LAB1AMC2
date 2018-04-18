package uni.amc.lab.benchmark;

public class Main {

    public static void main(String[] args)
    {
        /*Measure time*/
        long lStartTime = System.nanoTime();

        float Na;
        float CPIa = 2;
        float Fb = 3;
        float Nb = 4;
        float CPIb = 5;
        float Fa = 6;
        float nPercentAdividedB = 1;

        /*Find Na*/
        System.out.println("========= Finding Na With values:");
        System.out.println("========= CPIa:"+CPIa);
        System.out.println("========= Fb:"+Fb);
        System.out.println("========= Nb:"+Nb);
        System.out.println("========= CPIb:"+CPIb);
        System.out.println("========= Fa:"+Fb);
        System.out.println("========= n%a/b:"+nPercentAdividedB);

        Na = Math.round((((nPercentAdividedB/100)+1)*(Nb*CPIb*Fa)/(CPIa*Fb)));

        System.out.println("\nNa resulted:"+Na);


        /*Find CPIa*/
        System.out.println("\n\n========= Finding CPIa With values:");
        System.out.println("========= Na:"+Na);
        System.out.println("========= Fb:"+Fb);
        System.out.println("========= Nb:"+Nb);
        System.out.println("========= CPIb:"+CPIb);
        System.out.println("========= Fa:"+Fb);
        System.out.println("========= n%a/b:"+nPercentAdividedB);

        CPIa = Math.round((((nPercentAdividedB/100)+1)*(Nb*CPIb*Fa)/(Na*Fb)));

        System.out.println("\nCPIa resulted:"+CPIa);

        /*Find Fb*/
        System.out.println("\n\n========= Finding Fb With values:");
        System.out.println("========= Na:"+Na);
        System.out.println("========= CPIa:"+CPIa);
        System.out.println("========= Nb:"+Nb);
        System.out.println("========= CPIb:"+CPIb);
        System.out.println("========= Fa:"+Fb);
        System.out.println("========= n%a/b:"+nPercentAdividedB);

        Fb = Math.round((((nPercentAdividedB/100)+1)*(Nb*CPIb*Fa)/(Na*CPIa)));

        System.out.println("\nFb resulted:"+Fb);

        /*Find Nb*/
        System.out.println("\n\n========= Finding Nb With values:");
        System.out.println("========= Na:"+Na);
        System.out.println("========= CPIa:"+CPIa);
        System.out.println("========= Fb:"+Fb);
        System.out.println("========= CPIb:"+CPIb);
        System.out.println("========= Fa:"+Fb);
        System.out.println("========= n%a/b:"+nPercentAdividedB);

        Nb = Math.round(((Na*CPIa*Fb)/((nPercentAdividedB/100)+1*(CPIb*Fa))));

        System.out.println("\nNb resulted:"+Nb);

        /*Find CPIb*/
        System.out.println("\n\n========= Finding CPIb With values:");
        System.out.println("========= Na:"+Na);
        System.out.println("========= CPIa:"+CPIa);
        System.out.println("========= Fb:"+Fb);
        System.out.println("========= Nb:"+Nb);
        System.out.println("========= Fa:"+Fa);
        System.out.println("========= n%a/b:"+nPercentAdividedB);

        CPIb = Math.round(((Na*CPIa*Fb)/((nPercentAdividedB/100)+1*(Nb*Fa))));

        System.out.println("\nCPIb resulted:"+CPIb);

        /*Find Fa*/
        System.out.println("\n\n========= Finding CPIb With values:");
        System.out.println("========= Na:"+Na);
        System.out.println("========= CPIa:"+CPIa);
        System.out.println("========= Fb:"+Fb);
        System.out.println("========= Nb:"+Nb);
        System.out.println("========= CPIb:"+CPIb);
        System.out.println("========= n%a/b:"+nPercentAdividedB);

        Fa = Math.round(((Na*CPIa*Fb)/((nPercentAdividedB/100)+1*(Nb*CPIb))));

        System.out.println("\nFa resulted:"+Fa);

        /*Find n%a/b*/
        System.out.println("\n\n========= Finding n%a/b With values:");
        System.out.println("========= Na:"+Na);
        System.out.println("========= CPIa:"+CPIa);
        System.out.println("========= Fb:"+Fb);
        System.out.println("========= Nb:"+Nb);
        System.out.println("========= CPIb:"+CPIb);
        System.out.println("========= Fa:"+Fa);

        nPercentAdividedB = Math.round((((Na*CPIa*Fb)*100)/((Nb*CPIb*Fa)*100)));

        System.out.println("\nn%a/b resulted:"+nPercentAdividedB);


        long lEndTime = System.nanoTime();
        long output = lEndTime - lStartTime;
        System.out.println("Score (Milliseconds) on a single thread is: "+(output / 1000000));
    }
}
