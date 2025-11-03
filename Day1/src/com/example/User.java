package com.example;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name=JOptionPane.showInputDialog("Enter the name ");
JOptionPane.showMessageDialog(null, "Hi "+name+" ,Welcome to UST");
String s1=JOptionPane.showInputDialog("Enter the number");
JOptionPane.showConfirmDialog(null, s1);
String s2=JOptionPane.showInputDialog("Enter second number");
JOptionPane.showConfirmDialog(null, s2);
int a=Integer.parseInt(s1);
int b=Integer.parseInt(s2);
JOptionPane.showMessageDialog(null, "The concatenation of s1 and s2 "+(s1+s2));
JOptionPane.showMessageDialog(null, "The addtion is "+(a+b));

	}

}
