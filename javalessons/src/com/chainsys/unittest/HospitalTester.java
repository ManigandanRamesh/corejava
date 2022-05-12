package com.chainsys.unittest;

import com.chainsys.classandmethods.Hospital;

public class HospitalTester {
	public static void testhospital()
	{
		Hospital BigHospital= new Hospital();
		BigHospital.setHospitalName("ABCDEF");
		BigHospital.setPatientName("Mani");
		BigHospital.setWard(55);
		BigHospital.setDisease("Fever");
		System.out.println(BigHospital.getHospitalName());
		System.out.println(BigHospital.getPatientName());
		System.out.println(BigHospital.getWard());
		System.out.println(BigHospital.getDisease());
		
		
	}

}
