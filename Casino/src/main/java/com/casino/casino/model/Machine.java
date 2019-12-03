package com.casino.casino.model;

public class Machine {

	private String Res1;
	private String Res2;
	private String Res3;
	private float Pari;
	
	private String Message = "";
	
	public void Jouer() {
	
		
		
		// On récupere la valeur du pari:
		//this.Pari = MachineForm.Pari();
		float Solde = 0/*= newUser.getSolde()*/;
		
		if (Pari > Solde) {
			
			this.setMessage("Pas assez de fonds");
			return;
		}
		
		
		Rouleau R1 = new Rouleau();
		
		Res1 = R1.Tirage();
		Res2 = R1.Tirage();
		Res3 = R1.Tirage();
		
		int Multi = 0;
		
		if(Res1 == Res2 && Res2 == Res3) {
			
			this.setMessage(" Vous avez gagné ! ") ;
			
			switch (Res1) {
				case "C":
					Multi = 5;
					break;
				case "CSS":
					Multi = 25;
					break;
				case "Js":
					Multi = 1000;
					break;
				case "Pyt":
					Multi = 10000;
					break;
				case "PHP":
					Multi = 15000;
					break;
				case "Java":
					Multi = 2000000;
					break;
			}
			
			float Gain = this.Pari * Multi;
			
			//newUser.setSolde(Solde + Gain);
			// SQL.Update();
			
		}else {
			
			this.setMessage(" Vous avez perdu ! ") ;
			
			//newUser.setSolde(Solde - this.Pari);
			// SQL.Update();
			
		}
	
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}
	
	
}
