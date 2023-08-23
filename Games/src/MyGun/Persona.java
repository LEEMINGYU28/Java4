package MyGun;

import MyGun.player.PersonaSkillInfo;

public class Persona {

		
		String name;
		int level;
		int exp;
		int knowledge;//지식
		int trick;//재주
		int gentleness;//상냥함
		int guts;//배짱
		int charm;//매력
		String currentPersona;
		String PossessedPersona[];//소지 페르소나
		String itemBox;
		String personaName[];
		String personaArcana[];
		int personaDefaultLevel[];
		boolean confirmedpersona[];

		static String arcana;//아르카나는 변화하지 않는다.
		String[] weak;//공격받을 때 공격속성이 일치하는게 있으면
		String[] resist; ////공격할 때 공격속성이 일치하는게 있으면
		String changeItem[];//통상인지 경보인지는 아이템화 시키는 곳에서
		static String summonSpeech;//생성할 때 호출
		String[] specificity;//효과를 불러올때는 0번으로 계승여부확인은 2번으로
		String[] nowSkill;//페르소나가 소지할 수 있는 스킬 8개
		String canLearnSkillname[];
		int canLearnSkillLevel[];
		String[] learnSkillInfo; 
	
	}

