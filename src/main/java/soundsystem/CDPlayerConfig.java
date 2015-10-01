package soundsystem;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
//@ComponentScan
public class CDPlayerConfig {

    @Bean
    public CDPlayer cdPlayer() {
        return new CDPlayer(getRandomCD());
    }
    
    //@Bean
    public CompactDisc SgtPeppers() {
        return new SgtPeppers();
    }
    
    //@Bean
    public CompactDisc Revolver() {
        return new Revolver();
    }
    
    @Bean
    public CompactDisc getRandomCD() {
        switch((int)(Math.random() * 4.0)) {
            case 0 :
                return new SgtPeppers();
            case 1:
                return new Revolver();
            case 2:
                return new WhiteAlbum();
            case 3:
                return new HardDaysNight();
            default:
                return new SgtPeppers();
        }
    }
}
