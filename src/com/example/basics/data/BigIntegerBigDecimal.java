package com.example.basics.data;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerBigDecimal {
    public static void main(String[] args) {
        BigInteger bigInt = new BigInteger("6483435468431668764654");
        bigInt = bigInt.add(new BigInteger("6463365746846468456846"));
        System.out.println(bigInt);
        System.out.println(bigInt.toString());
        System.out.println("wynik to:" + bigInt);

        BigDecimal bigDec = new BigDecimal("163546354135.135654654");
        bigDec = bigDec.pow(3);
        System.out.println(bigDec);
        bigDec = bigDec.subtract(new BigDecimal("1312321313213215635.46854654684986"));
        System.out.println(bigDec);
    }
}
