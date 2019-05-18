package com.soccerdb.oldschool.control;

import java.util.Iterator;
import java.util.List;

import com.soccerdb.oldschool.db.dao.ImplPPSDAO;
import com.soccerdb.oldschool.db.dao.PPSDAO;
import com.soccerdb.oldschool.db.entity.Player_per_Season;

public class PPSController implements ControllerInterface<Player_per_Season>{

	private static PPSController controller;
	
	static {
		try {
			if(controller == null) {
				controller = new PPSController();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	PlayerController c_player;
	SeasonController c_season;
	
	Player_per_Season pps;
	PPSDAO ppsDAO = new ImplPPSDAO();
	List<Player_per_Season> ppsList;
	Iterator<Player_per_Season> itr;
	int count;
	String temp = "";
	String more_condition;
	String column_name = "Name\t" + "Season\t" + "Position\t" +"Height" + "Weight" + "Goals" + "Assists" + "Saves" + "Game" + "Card" + "Foul" + "\n"
						+"----\t-----\t------\t-----\t----\t----\t-----\t----\t----\t----\t----\t" +"\n";
	
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		temp = "";
		if(c_player == null) c_player = PlayerController.getController();
		if(c_season == null) c_season = SeasonController.getController();
	}

	@Override
	public String selectAll() {
		init();
		try {
			System.out.println("selectAll");
			ppsList = ppsDAO.selectAll();
			getData();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return temp;
	}

	@Override
	public String search(String attribute, String condition) {
		init();
		if(!attribute.isEmpty() && !condition.isEmpty()) {
			try {
				switch(attribute) {
				case "height":
					pps.setPps_height(Integer.parseInt(condition));
					ppsList = ppsDAO.searchPPSWhoseHeightIs(pps);
					getData();
					break;
				case "heigth shorter":
					pps.setPps_height(Integer.parseInt(condition));
					ppsList = ppsDAO.searchPPSWhoseShorterThan(pps);
					getData();
					break;
				case "height taller":
					pps.setPps_height(Integer.parseInt(condition));
					ppsList = ppsDAO.searchPPSWhoseTallerThan(pps);
					getData();
					break;
				case "weight":
					pps.setPps_weight(Integer.parseInt(condition));
					ppsList = ppsDAO.searchPPSWhoseWeightIs(pps);
					getData();
					break;
				case "weight lighter":
					pps.setPps_weight(Integer.parseInt(condition));
					ppsList = ppsDAO.searchPPSWhoseLighterThan(pps);
					getData();
					break;
				case "weight heavier":
					pps.setPps_weight(Integer.parseInt(condition));
					ppsList = ppsDAO.searchPPSWhoseHeightIs(pps);
					getData();
					break;
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return temp;
	}

	@Override
	public String order(String attribute, String condition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count(String attribute, String condition) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	void getData() {
		itr = ppsList.iterator();
		temp += column_name;
		while(itr.hasNext()) {
			pps = itr.next();
			temp += c_player.search("id", ""+pps.getPlayer_id()) + "\t" + c_season.search("id", ""+pps.getSeason_id()) + "\t" + pps.getPps_position() +"\t" + pps.getPps_height() + "\t" + pps.getPps_weight() + "\t" + pps.getPps_season_goal() + "\t" + pps.getPps_season_assist() + "\t" + pps.getPps_season_save() + "\t" + pps.getPps_season_game() + "\t" + pps.getPps_season_card() + "\t" +pps.getPps_season_foul() + "\n";
			System.out.println(temp);
		}
	}
	
	void atChecker(String target) {
		int index_at;
		if(target.contentEquals("at")) {
			index_at = target.indexOf(',');
			target = target.substring(0, index_at-1);
			
		}
	}
	
	
	public static PPSController getController() {
		// TODO Auto-generated method stub
		return controller;
	}

}
