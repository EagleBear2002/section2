package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import soundsystem.CDPlayerConfig;
import soundsystem.MediaPlayer;

public class MyAnnotationApp {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
		MediaPlayer player = ctx.getBean(MediaPlayer.class);
//		整个运行过程中并没有人为 new 新的 SgtPeppers 对象，但输出了 SgtPeppers 的信息
		player.play();
	}
}
