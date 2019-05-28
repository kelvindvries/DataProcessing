package ovChipkaart;

import java.util.ArrayList;

public abstract class ReizigerOracleDaolmpl implements ReizigerDao{
	
	private ArrayList<Reiziger> rzgr;
	
	public ArrayList<Reiziger> findAll(){
		
	}
	
	public ArrayList<Reiziger> findByGBdatum(String GBdatum) {
		
	}
	
	public Reiziger save(Reiziger reiziger) {

	}

	public Reiziger update(Reiziger reiziger) {
		
	}

	public boolean delete(Reiziger reiziger) {
		for(Reiziger re : rzgr) {
			if (rzgr.equals(re)) {
				return rzgr.remove(reiziger);
			}
		}
		return rzgr.remove(reiziger);
	}

}
