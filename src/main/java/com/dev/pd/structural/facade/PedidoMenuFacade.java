package com.dev.pd.structural.facade;

public class PedidoMenuFacade {
	
	Sopa sopa;
	Fondo fondo;
	Refresco refresco;
	Postre postre;
	
	public PedidoMenuFacade() {
		sopa = new Sopa();
		fondo = new Fondo();
		refresco = new Refresco();
		postre = new Postre();
	}

	public void servirOnlySopa() {
		Sopa.prepareSopa();
		sopa.serverSopa();
	}
	
	public void servirOnlyFondo() {
		Fondo.prepareFondo();
		fondo.serverFondo();
	}
	
	public void servirRefrescoYPostre() {
		Refresco.prepareRefresco();
		Postre.preparePostre();
		
		refresco.serverRefresco();
		postre.serverPostre();
	}

}
