
public class PrincipalMoto {

	public static void main(String[] args) {
		
		Moto motoDavidR = new Moto("3030hbd", "Aprilia", "rs aprilia", 125, true, 2008, true, true, 2, 40.5,'d');
		Moto motoArmanC = new Moto("2934dce", "Yamaha", "125turbo", 220, true, 2009, true, true, 3, 30.5,'g');
		Moto motoJoseL = new Moto("2280ddr", "BMW", "325 silent", 600, true, 2005, true, true, 2, 50.3,'d');
		
		System.out.println(motoDavidR.getDeposito());
		System.out.println(motoArmanC.getMatricula());
		System.out.println(motoJoseL.getAno());
		
		motoJoseL.setAno(2010);
		System.out.println(motoDavidR.getAno());
		
		motoDavidR.setDeposito(25.2);
		System.out.println(motoDavidR.getDeposito());

		System.out.println(motoDavidR.toString());
		System.out.println(motoArmanC.toString());
		System.out.println(motoJoseL.toString());
	}

}
