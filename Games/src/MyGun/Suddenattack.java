package MyGun;

public class Suddenattack {

	public String myGuns;
	public String gunName;
	public int myGunLevel=0;
	public int myGunKill=0;
	public String expUp;
	public String damage;  //데미지
	public String rateOfFire; //연사력
	public String hitRate;  //명중률
	public String firearmRecoil; //총기반동
	public String numberOfBullets; //장탄수
	public String swapSpeedUp;//교체속도증가
	public String reLoadSpeedUp;//장전속도 증가
	public String gunTransLucent;//총기반투명
	public String upGrade;//외형 업그레이드
	
	public Suddenattack(
			String myGuns,
			String gunName,
			int myGunLevel,
			int myGunKill,
			String expUp,
			String damage,
			String rateOfFire,
			String hitRate,
			String firearmRecoil,
			String numberOfBullets,
			String swapSpeedUp,
			String reLoadSpeedUp,
			String gunTransLucent,
			String upGrade) 
			{
			this.myGuns=myGuns;
			this.gunName=gunName ;
			this.myGunLevel= myGunLevel;
			this.myGunKill= myGunKill;
			this.expUp= expUp;
			this.damage= damage;
			this.rateOfFire=rateOfFire ;
			this.hitRate=hitRate ;
			this.firearmRecoil= firearmRecoil;
			this.numberOfBullets= numberOfBullets;
			this.swapSpeedUp= swapSpeedUp;
			this.reLoadSpeedUp= reLoadSpeedUp;
			this.gunTransLucent= gunTransLucent;
			this.upGrade= upGrade;
			}
	public class Level10
	{			
		int myGunKill=270;
		int myGunLevel=10;
		String upGrade;
	}
	public class Level20
	{			
		int myGunKill=1270;
		int myGunLevel=10;
		String upGrade;
	}
	
	
	
}
