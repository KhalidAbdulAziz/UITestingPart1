package org.softautomation;

import java.sql.Array;
import java.util.Arrays;

public class SplitAddress {
    public static void main(String[] args)
    {
        String str ="Building # 28-C، Jami Commercial Street 2، Phase VII D.H.A، Phase 2 Commercial Area Defence Housing Authority, Karachi, Karachi City, Sindh 75500";
        String res = str.replaceAll("Building","Plot");
        System.out.println(res);
        String abc = res.split("D.H.A")[0];
        System.out.println(abc);



       // String[] res2 = res.split("D.H.A");
       // System.out.println(res2);
        //String adds = parCode.toString();
      //  System.out.println(parCode);
        //
        //String[] parcod2= res
        //System.out.println(parCode[0]);

    }
}
