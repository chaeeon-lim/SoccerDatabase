package com.soccerdb.oldschool.db.dao;

import com.soccerdb.oldschool.db.entity.Player;
import com.soccerdb.oldschool.db.source.ImplAbstractDAO;

public class ImplPlayerDAO extends ImplAbstractDAO<Player, Integer> implements PlayerDAO{

	public ImplPlayerDAO() {
		super();
		namespace = "com.soccerdb.oldschool.db.dao.PlayerDAO";
	}
}
