package com.soccerdb.oldschool.db.dao;

import com.soccerdb.oldschool.db.entity.Fieldplayer;
import com.soccerdb.oldschool.db.source.ImplAbstractDAO;

public class ImplFieldplayerDAO extends ImplAbstractDAO<Fieldplayer, Integer> implements FieldplayerDAO{

	public ImplFieldplayerDAO() {
		super();
		namespace = "com.soccerdb.oldschool.db.dao.FieldplayerDAO";
	}
}
