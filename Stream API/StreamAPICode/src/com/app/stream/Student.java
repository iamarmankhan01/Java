package com.app.stream;

public class Student {
	    private long id;
		private String name;
		private int fee;
		public Student(long id, String name, int fee) {
			super();
			this.id = id;
			this.name = name;
			this.fee = fee;
		}
		public long getId() {
			return id;
		}
		public String getName() {
			return name;
		}
		public int getFee() {
			return fee;
		}
		
}
