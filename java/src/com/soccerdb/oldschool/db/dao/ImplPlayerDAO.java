package com.soccerdb.oldschool.db.dao;

import java.util.Date;
import java.util.List;

import com.soccerdb.oldschool.db.entity.Player;
import com.soccerdb.oldschool.db.source.ImplAbstractDAO;

public class ImplPlayerDAO extends ImplAbstractDAO<Player, Integer> implements PlayerDAO{

	public ImplPlayerDAO() {
		super();
		namespace = "com.soccerdb.oldschool.db.dao.PlayerDAO";
	}

	@Override
	public List<Player> selectByNationality(String nationality) throws Exception {
		//session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByNationality", nationality);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player> selectByLetterForName(String name) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByLetterForName", name);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player> selectByBirthday(String birthday) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByBirthday", birthday);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player> searchPlayerDebutAtThisYear(int player_debut) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPlayerDebutAtThisYear", player_debut);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player> searchPlayerDebutAfterThisYear(int player_debut) throws Exception {
		// session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPlayerDebutAfterThisYear", player_debut);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player> searchPlayerDebutBeforeThisYear(int player_debut) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPlayerDebutBeforeThisYear", player_debut);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player> searchPlayersOrderByName() throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPlayersOrderByName");
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player> searchPlayersOrderByNationality() throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPlayersOrderByNationality");
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player> searchPlayersOrderByDebut() throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPlayersOrderByDebut");
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player> searchPlayersOrderByBirthday() throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPlayersOrderByBirthday");
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player> searchPlayersOrderByNameDesc() throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPlayersOrderByNameDesc");
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player> searchPlayersOrderByNationalityDesc() throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPlayersOrderByNationalityDesc");
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player> searchPlayersOrderByDebutDesc() throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPlayersOrderByDebutDesc");
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player> searchPlayersOrderByBirthdayDesc() throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchPlayersOrderByBirthdayDesc");
		}finally {
			session.close();
		}
	}

	@Override
	public int calculatePlayerAge(int player_id) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".calculatePlayerAge", player_id);
		}finally {
			session.close();
		}
	}

	@Override
	public int countAllPlayers() throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countAllPlayers");
		}finally {
			session.close();
		}
	}

	@Override
	public int countAllPlayerWithCountry(String player_nationality) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countAllPlayersWithCountry", player_nationality);
		}finally {
			session.close();
		}
	}

	@Override
	public int countAllPlayerWithDebutYear(int player_debut) {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countAllPlayersWithDebutYear", player_debut);
		}finally {
			session.close();
		}
	}

	@Override
	public int countAllPlayerWithBirthday(String player_birthday) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countAllPlayersWithBirthday", player_birthday);
		}finally {
			session.close();
		}
	}

	@Override
	public int countAllPlayersSameAge(int player_debut) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countAllPlayersSameAge", player_debut);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player> searchAllPlayersSameAge(int player_debut) throws Exception {
		//session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchAllPlayersSameAge", player_debut);
		}finally {
			session.close();
		}
	}

	@Override
	public int countAllPlayersUnderAge(int player_debut) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countAllPlayersUnderAge", player_debut);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player> searchAllPlayersUnderAge(int player_debut) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchAllPlayersUnderAge", player_debut);
		}finally {
			session.close();
		}
	}

	@Override
	public int countAllPlayersOverAge(int player_debut) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countAllPlayersOverAge", player_debut);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player> searchAllPlayersOverAge(int player_debut) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchAllPlayersOverAge", player_debut);
		}finally {
			session.close();
		}
	}

}
