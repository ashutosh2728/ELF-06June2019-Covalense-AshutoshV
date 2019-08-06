package com.covalense.hibernateapp.manytoone;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class HibernateImplTest {
	public static void main(String[] args) {
		EmployeeInfoBean empInf = new EmployeeInfoBean();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date dob = null;
		Date joiningDate = null;
		Date ejd1 = null;
		Date ejd2 = null;
		Date eld1 = null;
		Date eld2 = null;
		try {
			dob = format.parse("1995-02-28");
			joiningDate = format.parse("2019-05-29");
			ejd1 = format.parse("2014-05-29");
			ejd2 = format.parse("2017-05-19");
			eld1 = format.parse("2017-05-19");
			eld2 = format.parse("2019-05-29");
		} catch (ParseException e) {
			e.printStackTrace();
		}

		empInf.setId(121321);
		empInf.setName("Gangadhar");
		empInf.setAge(28);
		// empInf.setDepartmentId(20);
		empInf.setDesignation("Software Engineer");
		empInf.setDob(dob);
		empInf.setJoiningDate(joiningDate);
		empInf.setAccountNumber(5956945);
		empInf.setPhone(4564636);
		empInf.setSalary(465694);
		empInf.setEmail("aditya@gmail.com");
		empInf.setGender("Male");
		// empInf.setManagerId(451);

		EmployeeOtherInfoBean empOtherInf = new EmployeeOtherInfoBean();
		empOtherInf.setPan("ASVPV7200R");
		empOtherInf.setBloodGrp("AB-");
		empOtherInf.setChallenged(false);
		empOtherInf.setMarried(true);
		empOtherInf.setEmergencyContactName("Aakash");
		empOtherInf.setMotherName("Jaya");
		empOtherInf.setNationality("Indian");
		empOtherInf.setPassport("PWD297497");
		empOtherInf.setFatherName("Ramlal");
		empOtherInf.setRelegion("Hindu");
		empOtherInf.setSpouseName("Akansha" + "");
		empOtherInf.setAdhar(16362132);
		empOtherInf.setInfoBean(empInf);

		EmployeeAddressPKBean adressPKBean1 = new EmployeeAddressPKBean();
		adressPKBean1.setAddressType("Permanent");
		adressPKBean1.setBean(empInf);
		EmployeeAddressPKBean adressPKBean2 = new EmployeeAddressPKBean();
		adressPKBean2.setAddressType("Temporary");
		adressPKBean2.setBean(empInf);
		EmployeeAddressInfoBean addressInfoBean1 = new EmployeeAddressInfoBean();
		addressInfoBean1.setAddressPKBean(adressPKBean1);
		addressInfoBean1.setAddress1("J k  Electronics");
		addressInfoBean1.setAddress2("Chandametta");
		addressInfoBean1.setCity("Chhindwara");
		addressInfoBean1.setCountry("India");
		addressInfoBean1.setState("MP");
		addressInfoBean1.setLandmark("Main bus stand");
		addressInfoBean1.setPincode(480447);
		addressInfoBean1.setAddressPKBean(adressPKBean1);
		EmployeeAddressInfoBean addressInfoBean2 = new EmployeeAddressInfoBean();
		addressInfoBean2.setAddressPKBean(adressPKBean2);
		addressInfoBean2.setAddress1("Sai Star PG");
		addressInfoBean2.setAddress2("Bangalore");
		addressInfoBean2.setCity("Bangalore");
		addressInfoBean2.setCountry("India");
		addressInfoBean2.setState("Karnataka");
		addressInfoBean2.setLandmark("Behind mythri mart");
		addressInfoBean2.setPincode(560029);
		addressInfoBean2.setAddressPKBean(adressPKBean2);

		EmployeeEducationalInfoPKBean educationalInfoPKBean1 = new EmployeeEducationalInfoPKBean();
		educationalInfoPKBean1.setEducationType("Graduation");
		educationalInfoPKBean1.setBean(empInf);
		EmployeeEducationalInfoBean educationInfoBean1 = new EmployeeEducationalInfoBean();
		educationInfoBean1.setEducationalInfoPKBean(educationalInfoPKBean1);
		educationInfoBean1.setCollegeName("MITS Pune");
		educationInfoBean1.setDegreeType("BE");
		educationInfoBean1.setBranch("CT");
		educationInfoBean1.setLocation("Pune");
		educationInfoBean1.setUniversity("Pune University");
		educationInfoBean1.setPercentage(81.8);
		educationInfoBean1.setYop("2014");
		educationInfoBean1.setEducationalInfoPKBean(educationalInfoPKBean1);

		EmployeeEducationalInfoPKBean educationalInfoPKBean2 = new EmployeeEducationalInfoPKBean();
		educationalInfoPKBean2.setEducationType("Post Graduation");
		educationalInfoPKBean2.setBean(empInf);
		EmployeeEducationalInfoBean educationInfoBean2 = new EmployeeEducationalInfoBean();
		educationInfoBean2.setEducationalInfoPKBean(educationalInfoPKBean2);
		educationInfoBean2.setCollegeName("MITS Pune");
		educationInfoBean2.setDegreeType("MTech");
		educationInfoBean2.setBranch("CT");
		educationInfoBean2.setLocation("Pune");
		educationInfoBean2.setUniversity("Pune University");
		educationInfoBean2.setPercentage(71.8);
		educationInfoBean2.setYop("2018");
		educationInfoBean2.setEducationalInfoPKBean(educationalInfoPKBean2);

		EmployeeExperienceInfoPKBean experienceInfoPKBean1 = new EmployeeExperienceInfoPKBean();
		experienceInfoPKBean1.setCompanyName("TCS");
		experienceInfoPKBean1.setBean(empInf);
		EmployeeExperienceInfoBean experienceInfoBean1 = new EmployeeExperienceInfoBean();
		experienceInfoBean1.setEmployeeExperienceInfoPKBean(experienceInfoPKBean1);
		experienceInfoBean1.setDesignation("Software Engineer");
		experienceInfoBean1.setJoiningDate(ejd1);
		experienceInfoBean1.setLeavingDate(eld1);
		experienceInfoBean1.setEmployeeExperienceInfoPKBean(experienceInfoPKBean1);

		EmployeeExperienceInfoPKBean experienceInfoPKBean2 = new EmployeeExperienceInfoPKBean();
		experienceInfoPKBean2.setCompanyName("IBM");
		experienceInfoPKBean2.setBean(empInf);
		EmployeeExperienceInfoBean experienceInfoBean2 = new EmployeeExperienceInfoBean();
		experienceInfoBean2.setEmployeeExperienceInfoPKBean(experienceInfoPKBean2);
		experienceInfoBean2.setDesignation("Senior Software Engineer");
		experienceInfoBean2.setJoiningDate(ejd2);
		experienceInfoBean2.setLeavingDate(eld2);
		experienceInfoBean2.setEmployeeExperienceInfoPKBean(experienceInfoPKBean2);

		HibernateImpl hibernateImpl = new HibernateImpl();
		hibernateImpl.createEmployee(empInf, empOtherInf, Arrays.asList(addressInfoBean1, addressInfoBean2),
				Arrays.asList(educationInfoBean1, educationInfoBean2),
				Arrays.asList(experienceInfoBean1, experienceInfoBean2));

	}
}
