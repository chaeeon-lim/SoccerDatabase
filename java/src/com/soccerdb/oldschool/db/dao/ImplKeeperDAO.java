package com.soccerdb.oldschool.db.dao;

import com.soccerdb.oldschool.db.entity.Keeper;
import com.soccerdb.oldschool.db.source.ImplAbstractDAO;

public class ImplKeeperDAO extends ImplAbstractDAO<Keeper, Integer> implements KeeperDAO{

	public ImplKeeperDAO() {
		super();
		namespace = "com.soccerdb.oldschool.db.dao.KeeperDAO";
	}
}
