package com.soccerdb.oldschool.db.dao;

import com.soccerdb.oldschool.db.entity.Game;
import com.soccerdb.oldschool.db.source.ImplAbstractDAO;

public class ImplGameDAO extends ImplAbstractDAO<Game, Integer> implements GameDAO{

	public ImplGameDAO() {
		super();
		namespace = "com.soccerdb.oldschool.db.dao.GameDAO";
	}
}
