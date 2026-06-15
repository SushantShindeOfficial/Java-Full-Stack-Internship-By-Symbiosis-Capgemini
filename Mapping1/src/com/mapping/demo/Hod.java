package com.mapping.demo;

public class Hod {
	 private int id;
	    private String name;
	    private String city;
	    public Hod() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Hod(int id, String name, String city, double salary) {
			super();
			this.id = id;
			this.name = name;
			this.city = city;
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Hod [id=" + id + ", name=" + name + ", city=" + city + ", salary=" + salary + "]";
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
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		private double salary;
}
