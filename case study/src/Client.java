import com.Aplication.GSShopFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//step 1 - step a
		GSShopFactory gssfactory=new GSShopFactory();
		gssfactory.getNewPrimeAccount(123,"vikas",0,true);
		gssfactory.getNewNormalAccount(111,"vikas",0,true);
		//step 2
		GSPrimeAcc gsprime = new GSPrimeAcc();
		gsprime.getAccNm();
		gsprime.getAccNo();
		gsprime.getCharges();
		//step 4 /step d.
		gsprime.bookProduct(1000);
		//step 5 / step e.
		gsprime.toString();
		
		//step3
		GSNormalAcc gsnormal=new GSNormalAcc();
		gsnormal.getAccNm();
		gsnormal.getAccNo();
		gsnormal.getCharges();
		gsnormal.getDeliveryCharge();
		
		//step 4 /step d.
		gsnormal.bookProduct(1000);
		// step 5 /step e.
		gsnormal.toString();
		
	}

}
