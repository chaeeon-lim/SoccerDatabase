package com.soccerdb.oldschool.db.dao;

import java.util.List;

import com.soccerdb.oldschool.db.entity.Player_per_Season;
import com.soccerdb.oldschool.db.source.ImplAbstractDAO;

public class ImplPPSDAO extends ImplAbstractDAO<Player_per_Season, Integer> implements PPSDAO{

	public ImplPPSDAO() {
		super();
		namespace = "com.soccerdb.oldschool.db.dao.PPSDAO";
	}

	@Override
	public Player_per_Season selectByPPS(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".selectByPPS", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public void deleteByPPS(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			session.delete(namespace + ".deleteByPPS", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player_per_Season> searchPPSWhoseHeightIs(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPPSWhoseHeightIs", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player_per_Season> searchPPSWhoseShorterThan(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPPSWhoseShorterThan", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player_per_Season> searchPPSWhoseTallerThan(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPPSWhoseTallerThan", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player_per_Season> searchPPSWhoseWeightIs(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPPSWhoseWeightIs", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player_per_Season> searchPPSWhoseLighterThan(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPPSWhoseLighterThan", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player_per_Season> searchPPSWhoseHeavierThan(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPPSWhoseHeavierThan", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player_per_Season> searchPPSWhosePositionIs(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPPSWhosePositionIs", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player_per_Season> searchPPSWhoseGoalsAre(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPPSWhoseGoalsAre", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player_per_Season> searchPPSWhoseGoalsLessThan(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPPSWhoseGoalsLessThan", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player_per_Season> searchPPSWhoseGoalsMoreThan(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPPSWhoseGoalsMoreThan", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player_per_Season> searchPPSWhoseAssistsAre(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPPSWhoseAssistsAre", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player_per_Season> searchPPSWhoseAssistsLessThan(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPPSWhoseAssistsLessThan", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player_per_Season> searchPPSWhoseAssistsMoreThan(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPPSWhoseAssistsMoreThan", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player_per_Season> searchPPSWhoseSavesAre(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPPSWhoseSavesAre", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player_per_Season> searchPPSWhoseSavesLessThan(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPPSWhoseSavesLessThan", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player_per_Season> searchPPSWhoseSavesMoreThan(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPPSWhoseSavesMoreThan", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player_per_Season> searchPPSWhoseGamesAre(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPPSWhoseGamesAre", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player_per_Season> searchPPSWhoseGamesLessThan(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPPSWhoseGamesLessThan", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player_per_Season> searchPPSWhoseGamesMoreThan(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPPSWhoseGamesMoreThan", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player_per_Season> searchPPSWhoseCardsAre(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPPSWhoseCardsAre", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player_per_Season> searchPPSWhoseCardsLessThan(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPPSWhoseCardsLessThan", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player_per_Season> searchPPSWhoseCardsMoreThan(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPPSWhoseCardsMoreThan", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player_per_Season> searchPPSWhoseFoulsAre(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPPSWhoseFoulsAre", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player_per_Season> searchPPSWhoseFoulsLessThan(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPPSWhoseFoulsLessThan", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player_per_Season> searchPPSWhoseFoulsMoreThan(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPPSWhoseFoulsMoreThan", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player_per_Season> searchPPSOrderBySeason(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPPSOrderBySeason", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player_per_Season> searchPPSOrderByPosition(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPPSOrderByPosition", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player_per_Season> searchPPSOrderByHeight(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPPSOrderByHeight", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player_per_Season> searchPPSOrderByWeight(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPPSOrderByWeight", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player_per_Season> searchPPSOrderByGoals(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPPSOrderByGoals", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player_per_Season> searchPPSOrderByAssists(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPPSOrderByAssists", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player_per_Season> searchPPSOrderBySaves(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPPSOrderBySaves", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player_per_Season> searchPPSOrderByGames(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPPSOrderByGames", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player_per_Season> searchPPSOrderByCards(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPPSOrderByCards", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player_per_Season> searchPPSOrderByFouls(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPPSOrderByFouls", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player_per_Season> searchPPSOrderBySeasonDesc(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPPSOrderBySeasonDesc", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player_per_Season> searchPPSOrderByPositionDesc(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPPSOrderByPositionDesc", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player_per_Season> searchPPSOrderByHeightDesc(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPPSOrderByHeightDesc", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player_per_Season> searchPPSOrderByWeightDesc(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPPSOrderByWeightDesc", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player_per_Season> searchPPSOrderByGoalsDesc(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPPSOrderByGoalsDesc", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player_per_Season> searchPPSOrderByAssistsDesc(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPPSOrderByAssistsDesc", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player_per_Season> searchPPSOrderBySavesDesc(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPPSOrderBySavesDesc", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player_per_Season> searchPPSOrderByGamesDesc(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPPSOrderByGamesDesc", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player_per_Season> searchPPSOrderByCardsDesc(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPPSOrderByCardsDesc", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player_per_Season> searchPPSOrderByFoulsDesc(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPPSOrderByFoulsDesc", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public int countAllPPS(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countAllPPS", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public int sumOfPlayerGoals(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".sumOfPlayerGoals", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public int sumOfPlayerAssists(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".sumOfPlayerAssists", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public int sumOfPlayerSaves(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".sumOfPlayerSaves", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public int sumOfPlayerGames(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".sumOfPlayerGames", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public int sumOfPlayerCards(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".sumOfPlayerCards", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public int sumOfPlayerFouls(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".sumOfPlayerFouls", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public int countPPSWhoseHeightIs(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countPPSWhoseHeightIs", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public int countPPSWhoseShorterThan(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countPPSWhoseShorterThan", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public int countPPSWhoseTallerThan(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countPPSWhoseTallerThan", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public int countPPSWhoseWeightIs(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countPPSWhoseWeightIs", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public int countPPSWhoseLighterThan(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countPPSWhoseLighterThan", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public int countPPSWhoseHeavierThan(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countPPSWhoseHeavierThan", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public int countPPSWhosePositionIs(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countPPSWhosePositionIs", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public int countPPSWhoseGoalsAre(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countPPSWhoseGoalsAre", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public int countPPSWhoseGoalsLessThan(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countPPSWhoseGoalsLessThan", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public int countPPSWhoseGoalsMoreThan(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countPPSWhoseGoalsMoreThan", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public int countPPSWhoseAssistsAre(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countPPSWhoseAssistsAre", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public int countPPSWhoseAssistsLessThan(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countPPSWhoseAssistsLessThan", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public int countPPSWhoseAssistsMoreThan(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countPPSWhoseAssistsMoreThan", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public int countPPSWhoseSavesAre(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countPPSWhoseSavesAre", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public int countPPSWhoseSavesLessThan(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countPPSWhoseSavesLessThan", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public int countPPSWhoseSavesMoreThan(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countPPSWhoseSavesMoreThan", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public int countPPSWhoseGamesAre(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countPPSWhoseGamesAre", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public int countPPSWhoseGamesLessThan(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countPPSWhoseGamesLessThan", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public int countPPSWhoseGamesMoreThan(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countPPSWhoseGamesMoreThan", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public int countPPSWhoseCardsAre(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countPPSWhoseCardsAre", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public int countPPSWhoseCardsLessThan(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countPPSWhoseCardsLessThan", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public int countPPSWhoseCardsMoreThan(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countPPSWhoseCardsMoreThan", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public int countPPSWhoseFoulsAre(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countPPSWhoseFoulsAre", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public int countPPSWhoseFoulsLessThan(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countPPSWhoseFoulsLessThan", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public int countPPSWhoseFoulsMoreThan(Player_per_Season pps) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countPPSWhoseFoulsMoreThan", pps);
		}finally {
			session.close();
		}
	}
}
