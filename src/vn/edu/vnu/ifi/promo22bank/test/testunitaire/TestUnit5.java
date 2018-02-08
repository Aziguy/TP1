/**
 * 
 */
package vn.edu.vnu.ifi.promo22bank.test.testunitaire;

import org.junit.Test;

import junit.framework.Assert;
import vn.edu.vnu.ifi.promo22bank.dao.Dao;
import vn.edu.vnu.ifi.promo22bank.dao.IDao;
import vn.edu.vnu.ifi.promo22bank.domaine.Comptes;
import vn.edu.vnu.ifi.promo22bank.service.IService;
import vn.edu.vnu.ifi.promo22bank.service.Service;

/**
 * @author KENGNI Hippolyte
 *
 */
public class TestUnit5 {
	private IDao dao;
	private IService service;

	/**
	 * 
	 */
	public TestUnit5() {
		dao = new Dao();
		service = new Service(dao);
	}

	@Test



	public void testEnregistrerCompteNonOk() {
		int varTest = 2;
		Comptes compteTest = new Comptes(002, 902, 100, "2", "2", "1");
		int monTest = service.enregistrerComptesService(compteTest);

		Assert.assertEquals(varTest, monTest);// ("Devrait être faux donc test non ok", var);
	}

}
