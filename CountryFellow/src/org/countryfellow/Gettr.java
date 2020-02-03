package org.countryfellow;

public class Gettr {
	public static void main(String[] args) {
		Orange n=new Orange();
		n.setAccno(8960);
		n.setName("gomathi");
		n.setEmail("gomathim606@gmail.com");
		n.setAmount(490000);
		System.out.println(n.getAccno());
		System.out.println(n.getName());
		System.out.println(n.getEmail());
		System.out.println(n.getAmount());
	
	}

}
