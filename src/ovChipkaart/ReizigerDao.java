package ovChipkaart;

import java.util.ArrayList;
import java.util.List;

public interface ReizigerDao {
	public ArrayList<Reiziger> findAll();
	public List<Reiziger> findByGBdatum(String GBdatum);
	public Reiziger save(Reiziger reiziger);
	public Reiziger update(Reiziger reiziger);
	public boolean delete(Reiziger reiziger);
	
	
}
