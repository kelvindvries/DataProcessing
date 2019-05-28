package ovChipkaart;

import java.util.ArrayList;

public interface ReizigerDao {
	public ArrayList<Reiziger> findAll();
	public ArrayList<Reiziger> findByGBdatum();
	public Reiziger save();
	public Reiziger update();
	
	
}
