package com.soccerdb.oldschool.control;

import java.util.Iterator;
import java.util.List;

import com.soccerdb.oldschool.db.dao.ContractDAO;
import com.soccerdb.oldschool.db.dao.ImplContractDAO;
import com.soccerdb.oldschool.db.entity.Contract;

public class ContractController implements ControllerInterface<Contract>{
	
	private static ContractController controller;

	static {
		try {
			if(controller == null) {
				controller = new ContractController();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
	Contract contract; 
	ContractDAO contractDAO = new ImplContractDAO(); 
	List<Contract> contractList;
	Iterator<Contract> itr;
	int count;
	String temp = "";
	
	String column_name = "player_id\t" + "club_id\t" + "season_id\t"+"salary\t" +"duration" + "\n"
						+ "----\t--------\t-----\t--------"+"\n";

	@Override
	public void init() {
		temp = "";
		
	}
	
	@Override
	public String selectAll() {
		init();
		try {
			contractList = contractDAO.selectAll();
			getData();
		} catch (Exception e) {
			// TODO Auto-generated catch block
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
					case "player_id":
						contract.setPlayer_id(Integer.parseInt(condition));
						contractList = contractDAO.selectByPlayerId(contract.getPlayer_id());
						getData();
						break;
					case "club_id":
						contract.setClub_id(Integer.parseInt(condition));
						contractList = contractDAO.selectByClubId(contract.getPlayer_id());
						getData();
						break; 
					case "season_id":
						contract.setSeason_id(Integer.parseInt(condition));
						contractList = contractDAO.selectBySeasonId(contract.getSeason_id());
						getData();
						break; 
					case "salary":
						contract.setSalary(Float.parseFloat(condition));
						contractList = contractDAO.selectBySalaryOverThan(contract.getSalary()); 
						getData();
						break; 
					case "duration":
						contract.setDuration_contract(Integer.parseInt(condition));
						contractList = contractDAO.selectByDurationContractOverThan(contract.getDuration_contract());
						getData();
						break;

					default:
						temp += "\n\n\n\t\t\tIllegal Attribute... is it " + attribute +"?";
						break;
				}
			
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

		if(temp.equals(column_name) || temp.isEmpty()) temp += "\n\n\n\t\t\t There is no data for " + condition + " at " + attribute + "in Player Table"  + " \n";
		return temp;
		
	}
	@Override
	public String order(String attribute, String condition) {
		
		init();
		
		return temp;
	}
	
	@Override
	public int count(String attribute, String condition) {

		init();
		
		return count;
	}

	public static ContractController getController() {
		return controller;
	}
	
	void getData() {
		itr = contractList.iterator();
		temp += column_name;
		while(itr.hasNext()) {
			contract = itr.next();
			temp += contract.getPlayer_id()+ "\t" + contract.getClub_id() + "\t" + 
			contract.getSeason_id() + "\t" + contract.getSalary() + "\t" +  +contract.getDuration_contract() +"\n";
		}
	}
}
