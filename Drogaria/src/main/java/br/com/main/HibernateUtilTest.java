package br.com.main;

import org.hibernate.Session;

import br.com.util.HibernateUtil;

public class HibernateUtilTest {
	
	public static void main(String[] args) {
		Session sessao = HibernateUtil.getFabricaSessoes().openSession();
		
		sessao.close();
		HibernateUtil.getFabricaSessoes().close();
	}

}
