package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * cdplayer配置
 * 配置类的用途就是生成并注入 Bean
 *
 * @author EagleBear2002
 * @date 2023/04/04
 */
@Configuration
public class CDPlayerConfig {
	
	@Bean
	public CompactDisc compactDisc() {
		return new SgtPeppers();
	}
	
	/**
	 * cd播放器
	 * 因为使用了 @Configuration 和 @Bean 注解，多次调用该方法也不会多次 new
	 *
	 * @param cd cd
	 * @return {@link CDPlayer}
	 */
	@Bean
	public CDPlayer cdPlayer(CompactDisc cd) {
		return new CDPlayer(cd);
	}
	
}
