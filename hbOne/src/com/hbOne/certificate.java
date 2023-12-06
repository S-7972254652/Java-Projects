package com.hbOne;

import jakarta.persistence.Embeddable;

@Embeddable
public class certificate {
		private String Course;
		private String duration;
		public certificate(String course, String duration) {
			super();
			Course = course;
			this.duration = duration;
		}
		public certificate() {
			super();
			// TODO Auto-generated constructor stub
		}
		public String getCourse() {
			return Course;
		}
		public void setCourse(String course) {
			Course = course;
		}
		public String getDuration() {
			return duration;
		}
		public void setDuration(String duration) {
			this.duration = duration;
		}
		

	

}
