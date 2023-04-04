package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
	public void setCd(CompactDisc cd) {
		this.cd = cd;
	}
	
	private CompactDisc cd;
	
	/**
	 * 依赖注入体现在这里
	 *
	 * @param cd cd
	 */
	@Autowired
	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}
	
	public void play() {
		cd.play();
	}
	
}
