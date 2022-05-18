package com.framework;
import com.Application.GSNormalAcc;
import com.Application.SSPrimeAcc;
public interface ShopFactory {
public GSPrimeAcc
getNewPrimeAcc(int accNO,String accName,float charges,boolean isPrime);
public GSNormalAcc getNormalAcc(int accNO,String accName,float charges);
}
