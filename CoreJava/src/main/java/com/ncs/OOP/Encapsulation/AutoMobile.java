package com.ncs.OOP.Encapsulation;

public class AutoMobile {

	private String color;
	private int speed;
	private int gear;
	private String make;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void changeGear() {

		if (getSpeed() == 10) {

			System.out.println("gear =" + 1);

		}

		if (getSpeed() == 20) {

			System.out.println("gear =" + 2);

		}

		if (getSpeed() == 30) {

			System.out.println("gear =" + 3);

		}

		if (getSpeed() == 40) {

			System.out.println("gear =" + 4);

		}

		if (getSpeed() == 60) {

			System.out.println("gear =" + 6);

		}

	}

	public void breakk() {
		if (getSpeed() > 80) {
			System.out.println("break");
		}
	}
}
