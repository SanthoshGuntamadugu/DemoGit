package com.example.demo.entity;

import java.util.Arrays;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class EmployeeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	@Column
	private String address;
	@Column
	private int pincode;
	@Column
	private Long mobilenumber;
	@Lob
	@Column(name = "pdf_document", columnDefinition = "LONGBLOB")
	private byte[] pdfDocument;
	public EmployeeEntity(){
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public Long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(Long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public byte[] getPdfDocument() {
		return pdfDocument;
	}
	public void setPdfDocument(byte[] pdfDocument) {
		this.pdfDocument = pdfDocument;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", pincode=" + pincode
				+ ", mobilenumber=" + mobilenumber + ", pdfDocument=" + Arrays.toString(pdfDocument) + "]";
	}
	public EmployeeEntity(int id, String name, String address, int pincode, Long mobilenumber, byte[] pdfDocument) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.pincode = pincode;
		this.mobilenumber = mobilenumber;
		this.pdfDocument = pdfDocument;
	}
	
	
}
