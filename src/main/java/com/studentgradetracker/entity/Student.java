package com.studentgradetracker.entity;

public class Student {

	private String collegeName;
	private String studentName;
	private double englishMark;
	private double odiaMark;
	private double physicsMark;
	private double chemistryMark;
	private double mathematicsMark;
	private double itMark;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String collegeName, String studentName, double englishMark, double odiaMark, double physicsMark,
			double chemistryMark, double mathematicsMark, double itMark) {
		super();
		this.collegeName = collegeName;
		this.studentName = studentName;
		this.englishMark = englishMark;
		this.odiaMark = odiaMark;
		this.physicsMark = physicsMark;
		this.chemistryMark = chemistryMark;
		this.mathematicsMark = mathematicsMark;
		this.itMark = itMark;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getEnglishMark() {
		return englishMark;
	}

	public void setEnglishMark(double englishMark) {
		this.englishMark = englishMark;
	}

	public double getOdiaMark() {
		return odiaMark;
	}

	public void setOdiaMark(double odiaMark) {
		this.odiaMark = odiaMark;
	}

	public double getPhysicsMark() {
		return physicsMark;
	}

	public void setPhysicsMark(double physicsMark) {
		this.physicsMark = physicsMark;
	}

	public double getChemistryMark() {
		return chemistryMark;
	}

	public void setChemistryMark(double chemistryMark) {
		this.chemistryMark = chemistryMark;
	}

	public double getMathematicsMark() {
		return mathematicsMark;
	}

	public void setMathematicsMark(double mathematicsMark) {
		this.mathematicsMark = mathematicsMark;
	}

	public double getItMark() {
		return itMark;
	}

	public void setItMark(double itMark) {
		this.itMark = itMark;
	}

	@Override
	public String toString() {
		return "Student [collegeName=" + collegeName + ", studentName=" + studentName + ", englishMark=" + englishMark
				+ ", odiaMark=" + odiaMark + ", physicsMark=" + physicsMark + ", chemistryMark=" + chemistryMark
				+ ", mathematicsMark=" + mathematicsMark + ", itMark=" + itMark + "]";
	}

}
