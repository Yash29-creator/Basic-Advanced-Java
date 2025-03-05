package Practicals;

class MedicalStaff {
	String name;
	int age;
	public MedicalStaff(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
	public void treatPatient() {
		System.out.println("Treating patient...");
	}
}
class Doctor extends MedicalStaff {
	String specialization;
	public Doctor(String name, int age, String specialization) {
		super(name, age); 
		this.specialization = specialization;
	}
	@Override
	public void treatPatient() {
		System.out.println("Diagnosing and treating patient with " + specialization 
				+ " expertise...");
	}
	public void prescribeMedicine() {
		System.out.println("Prescribing medicine...");
	}
}
class Nurse extends MedicalStaff {
	String department;
	Nurse(String name, int age, String department) {
		super(name, age); 
		this.department = department;
	}
	@Override
	public void treatPatient() {
		System.out.println("Providing basic care to patient in " + department 
				+ " department...");
	}
	public void takeVitalSigns() {
		System.out.println("Taking vital signs...");
	}
}
public class SixSigmaHospital {
	public static void main(String[] args) {
		Doctor doctor = new Doctor("Dr. Atul Ahirrao", 35, "Cardiology");
		Nurse nurse = new Nurse("Mithali Kulkarni", 28, "ICU");
		doctor.displayInfo();
		doctor.treatPatient();
		doctor.prescribeMedicine();
		System.out.println();
		nurse.displayInfo();
		nurse.treatPatient();
		nurse.takeVitalSigns();
	}
}
