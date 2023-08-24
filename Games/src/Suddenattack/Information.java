package Suddenattack;

public class Information {
	String myGuns= "무기를 사용하여 일정 킬 수를 달성할 때마다 레벨업하고,\n"
				+"특정 레벨 도달 시 업그레이드된 무기로 교체\n";
	String gunName= "NobleAWP";
	String damage ="데미지:100%/(실공격력)175%";
	String rateOfFire="연사력:0%";
	String hitRate="명중률:100%"; 
	String firearmRecoil="총기반동:85%\n";
	String numberOfBullets="장탄수:5/무한\n";	
	
	public void print() {
	System.out.println("마이건 정보\n"+myGuns+gunName+damage+rateOfFire
						+hitRate+firearmRecoil+numberOfBullets);
	}


}
