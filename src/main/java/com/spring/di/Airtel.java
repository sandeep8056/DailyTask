package com.spring.di;

public class Airtel {
	
			Serviceable service;
			
			
			
			public Serviceable getService() {
				return service;
			}



			public void setService(Serviceable service) {
				this.service = service;
			}



			public void Service() {
				service.service();
			}

}
