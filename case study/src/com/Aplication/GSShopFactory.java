package com.Aplication;
import com.framework.ShopFactory;
public class GSShopFactory implements ShopFactory 
{
	@Override
	public GSPrimeAcc 
	getNewPrimeAcc(int accNO,String accName,float charges,boolean isPrime)
	{
		GSPrimeAcc gspa=new GSPrimeAcc(accNO,accName,charges,isPrime);
		return gspa;
	}
	@Override
	public GSNormalAcc getNormalAcc(int acc NO.String ac Name,float charges)
	{
		GSNormalAcc(accNO,accName,charges);
		return gsna;
	}

}
