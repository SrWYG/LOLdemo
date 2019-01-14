package mvcDemo.mapper;

import mvcDemo.bean.Player;

public interface PlayerMapper 
{	
	void insertPlayer(Player player);
	
	void updatePlayer(Player player);
	
	void selectPlayer(Player player);
	
	void deletePlayer(Player player);
}
