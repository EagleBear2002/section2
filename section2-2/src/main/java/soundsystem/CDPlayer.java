package soundsystem;

import org.springframework.beans.factory.BeanNameAware;

public class CDPlayer implements MediaPlayer, BeanNameAware {
	private CompactDisc cd;
	
	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}
	
	public void play() {
		cd.play();
	}
	
	@Override
	public void setBeanName(String name) {
		System.out.println("====" + name);
	}
}
