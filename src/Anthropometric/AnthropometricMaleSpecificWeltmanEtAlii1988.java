package Anthropometric;

public class AnthropometricMaleSpecificWeltmanEtAlii1988 extends AnthropometricMaleSpecific{
	
	private double density; //densidade
	
	public double Obese24A68years(){/*obesos de 24 a 68 anos*/
		
		double fatPercentage /* Percentual de gordura */ = 0.31457 * getPABD() - 0.10969 * getMC() + 10.8336;	
		
		return fatPercentage;
	}	
	
	public double UniversityStudents(){ /*estudantes universit�rios*/
		
		density /*densidade*/ = 1.10986 - 0.00083 * getTR() - 0.00087 * getSB() - 0.00098 * getAB() + 0.0021 * getPANT();
		
		return density;
	}
	
	public double YoungMen(){
		
		density /*densidade*/ = 1.05599 - 0.00068 * getTR() - 0.00043 * getAB() - 0.00049 * getPCIN() + 0.00144 * getPR() - 0.00274 * getPerimeterAnkle() + 0.00553 * getPerimeterFist() + 0.00133 * getBiacromialDiameter() - 0.00203 * getBitrocanterianoDiameter();
		
		return density;
	}
	
	public double MiddleAgedMen(){ /*homens de meia idade*/
		
		density = 1.1008 - 0.00067 * getChestMeasure() - 0.0005 * getAM() - 0.00046 * getAB() - 0.00072 * getPTU() + 0.00236 * getPerimeterArms();
		
		return density;
	}
	
	public double CalculateFatPercentage(double age, double gender) {

		double fatPercentage = 0; // percentual de gordura

		if (age >= 7 && age <= 8 && gender == 1) {

			fatPercentage = (538 / density) - 497;

		} else if (age >= 9 && age <= 10 && gender == 1) {

			fatPercentage = (530 / density) - 489;

		} else if (age >= 11 && age <= 12 && gender == 1) {

			fatPercentage = (523 / density) - 481;

		} else if (age >= 13 && age <= 14 && gender == 1) {

			fatPercentage = (507 / density) - 464;

		} else if (age >= 15 && age <= 16 && gender == 1) {

			fatPercentage = (503 / density) - 459;

		} else if (age >= 17 && age <= 19 && gender == 1) {

			fatPercentage = (498 / density) - 453;

		} else if (age >= 20 && age <= 50 && gender == 1) {

			fatPercentage = (495 / density) - 450;

		} else if (age >= 7 && age <= 8 && gender == 2) {

			fatPercentage = (543 / density) - 503;

		} else if (age >= 9 && age <= 10 && gender == 2) {

			fatPercentage = (535 / density) - 495;

		} else if (age >= 11 && age <= 12 && gender == 2) {

			fatPercentage = (525 / density) - 484;

		} else if (age >= 13 && age <= 14 && gender == 2) {

			fatPercentage = (512 / density) - 469;

		} else if (age >= 15 && age <= 16 && gender == 2) {

			fatPercentage = (507 / density) - 464;

		} else if (age >= 17 && age <= 19 && gender == 2) {

			fatPercentage = (505 / density) - 462;

		} else if (age >= 20 && age <= 50 && gender == 2) {

			fatPercentage = (503 / density) - 459;
		}

		return fatPercentage;
	}

}