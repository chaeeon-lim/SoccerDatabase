package com.soccerdb.oldschool.db.dao;

import java.util.Date;
import java.util.List;

import com.soccerdb.oldschool.db.entity.Game;
import com.soccerdb.oldschool.db.entity.Match;
import com.soccerdb.oldschool.db.source.ImplAbstractDAO;

public class ImplGameDAO extends ImplAbstractDAO<Game, Integer> implements GameDAO{

	public ImplGameDAO() {
		super();
		namespace = "com.soccerdb.oldschool.db.dao.GameDAO";
	}
	@Override
	public List<Game> selectAll() throws Exception{
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectAll");
		}finally {
			session.close();
		}
	}

	@Override
	public List<Game> selectByGameTime(Date game_time) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByTime", game_time);
		}finally {
			session.close();
		}
	}
	@Override
	public List<Game> selectByPlace(String place) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByPlace", place);
		}finally {
			session.close();
		}
	}
	@Override
	public List<Game> selectByWeather(String weather) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByWeather", weather);
		}finally {
			session.close();
		}
	}
	@Override
	public List<Game> selectByExtended(boolean is_extended) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByExtended", is_extended);
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Game> selectByShootOut(boolean is_shoot_out) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByShootOut", is_shoot_out);
		}finally {
			session.close();
		}
	}
	@Override
	public List<Game> selectByGameType(String type) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			
			return session.selectList(namespace + ".selectByType", type);
		}finally {
			session.close();
		}
	}
	@Override
	public void updateGame(Game game) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			session.update(namespace + ".updateGame", game);
		}finally {
			session.close();
		}
		
	}
	@Override
	public void deleteGame(Game game) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			session.delete(namespace + ".deleteGame", game);
		}finally {
			session.close();
		}
	}
	@Override
	public List<Game> selectByThrowingUpper(int game_throwing) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByThrowingUpper", game_throwing);
		}finally {
			session.close();
		}
	}
	@Override
	public List<Game> selectByThrowingLower(int game_throwing) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByThrowingLower", game_throwing);
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Game> selectByScoreUpper(int game_score) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByScoreUpper", game_score);
		}finally {
			session.close();
		}
	}
	@Override
	public List<Game> selectByScoreLower(int game_score) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByScoreLower", game_score);
		}finally {
			session.close();
		}
	}
	@Override
	public List<Game> selectByFoulUpper(int game_foul) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByFoulLower", game_foul);
		}finally {
			session.close();
		}
	}
	@Override
	public List<Game> selectByFoulLower(int game_foul) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByFoulLower", game_foul);
		}finally {
			session.close();
		}
	}
	@Override
	public List<Game> selectByCardUpper(int game_card) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByCardLower", game_card);
		}finally {
			session.close();
		}
	}
	@Override
	public List<Game> selectByCardLower(int game_card) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByCardLower", game_card);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Game> selectByCornerKickUpper(int game_corner_kick) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByCornerKickLower", game_corner_kick);
		}finally {
			session.close();
		}
	}
	@Override
	public List<Game> selectByCornerKickLower(int game_corner_kick) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByCornerKickLower", game_corner_kick);
		}finally {
			session.close();
		}
	}
	@Override
	public List<Game> selectByFreekickUpper(int game_freekick) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByFreekickLower", game_freekick);
		}finally {
			session.close();
		}
	}
	@Override
	public List<Game> selectByFreekickLower(int game_freekick) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByFreekickLower", game_freekick);
		}finally {
			session.close();
		}
	}
	@Override
	public List<Game> selectByPenaltykickUpper(int game_penalty_kick) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByPenaltykickLower", game_penalty_kick);
		}finally {
			session.close();
		}
	}
	@Override
	public List<Game> selectByPenaltykickLower(int game_penalty_kick) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByPenaltykickLower", game_penalty_kick);
		}finally {
			session.close();
		}
	}
	@Override
	public List<Game> selectByBallOccupationUpper(int game_ball_occupation) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByBallOccupationUpper", game_ball_occupation);
		}finally {
			session.close();
		}
	}
	@Override
	public List<Game> selectByBallOccupationLower(int game_ball_occupation) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByBallOccupationLower", game_ball_occupation);
		}finally {
			session.close();
		}
	}
	@Override
	public List<Game> selectByUniformColor(String game_uniform_color) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByUniformColorLower", game_uniform_color);
		}finally {
			session.close();
		}
	}
	
	
	
	
	
	@Override
	public List<Game> selectOrderByScore() throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectOrderByScore");
		}finally {
			session.close();
		}
	}
	@Override
	public List<Game> selectOrderByBonus() throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectOrderByBonus");
		}finally {
			session.close();
		}
	}
	@Override
	public List<Game> selectOrderByBallOccupation() throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectOrderByBallOccupation");
		}finally {
			session.close();
		}
	}
	@Override
	public List<Game> selectOrderByCard() throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectOrderByCard");
		}finally {
			session.close();
		}
	}
	@Override
	public List<Game> selectOrderByCornerkick() throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectOrderByCornerkick");
		}finally {
			session.close();
		}
	}
	@Override
	public List<Game> selectOrderByPenaltykick() throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectOrderByPenaltykick");
		}finally {
			session.close();
		}
	}
	@Override
	public List<Game> selectOrderByThrowing() throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectOrderByThrowing");
		}finally {
			session.close();
		}
	}
	@Override
	public int countAll() throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countAll");
		}finally {
			session.close();
		}
	}
	@Override
	public int countByGameTime(Date game_time) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countByGameTime", game_time);
		}finally {
			session.close();
		}
	}
	@Override
	public int countByPlace(String place) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countByPlace", place);
		}finally {
			session.close();
		}
	}@Override
	public int countByWeather(String weather) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countByWeather", weather);
		}finally {
			session.close();
		}
	}@Override
	public int countByExtended(boolean is_extended) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countByExtended", is_extended);
		}finally {
			session.close();
		}
	}@Override
	public int countByShootOut(boolean is_shoot_out) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countByShootOut", is_shoot_out);
		}finally {
			session.close();
		}
	}@Override
	public int countByGameType(String type) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countByGameType", type);
		}finally {
			session.close();
		}
	}@Override
	public int countByScoreUpper(int game_score) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countByScoreUpper", game_score);
		}finally {
			session.close();
		}
	}@Override
	public int countByScoreLower(int game_score) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countByScoreLower", game_score);
		}finally {
			session.close();
		}
	}@Override
	public int countByThrowingUpper(int game_throwing) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countByThrowingUpper", game_throwing);
		}finally {
			session.close();
		}
	}@Override
	public int countByThrowingLower(int game_Throwing) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countByThrowingLower", game_Throwing);
		}finally {
			session.close();
		}
	}@Override
	public int countByFoulUpper(int game_foul) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countByFoulUpper", game_foul);
		}finally {
			session.close();
		}
	}@Override
	public int countByFoulLower(int game_foul) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countByFoulLower", game_foul);
		}finally {
			session.close();
		}
	}@Override
	public int countByCardUpper(int game_card) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countByCardUpper", game_card);
		}finally {
			session.close();
		}
	}@Override
	public int countByCardLower(int game_card) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countByCardLower", game_card);
		}finally {
			session.close();
		}
	}@Override
	public int countByCornerKickUpper(int game_corner_kick) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countByCornerKickUpper", game_corner_kick);
		}finally {
			session.close();
		}
	}@Override
	public int countByCornerKickLower(int game_corner_kick) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countByCornerKickLower", game_corner_kick);
		}finally {
			session.close();
		}
	}@Override
	public int countByFreekickUpper(int game_freekick) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countByFreekickUpper", game_freekick);
		}finally {
			session.close();
		}
	}@Override
	public int countByFreekickLower(int game_freekick) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countByFreekickLower", game_freekick);
		}finally {
			session.close();
		}
	}@Override
	public int countByPenaltykickUpper(int game_penalty_kick) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countByPenaltykickLower", game_penalty_kick);
		}finally {
			session.close();
		}
	}@Override
	public int countByPenaltykickLower(int game_penalty_kick) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countByPenaltykickLower", game_penalty_kick);
		}finally {
			session.close();
		}
	}@Override
	public int countByBallOccupationUpper(int game_ball_occupation) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countByBallOccupationLower", game_ball_occupation);
		}finally {
			session.close();
		}
	}@Override
	public int countByBallOccupationLower(int game_ball_occupation) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countByBallOccupationLower", game_ball_occupation);
		}finally {
			session.close();
		}
	}@Override
	public int countByUniformColor(String game_uniform_color) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countByUniformColor", game_uniform_color);
		}finally {
			session.close();
		}
	}
}
