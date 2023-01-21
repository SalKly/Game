package engine;


public interface playerlistner {
	
	void build(Player player); 
	void recruitUnit(Player player);
	void upgradeBuilding(Player player);
	void initiateArmy(Player player);
	void laySiege(Player player);
	
}