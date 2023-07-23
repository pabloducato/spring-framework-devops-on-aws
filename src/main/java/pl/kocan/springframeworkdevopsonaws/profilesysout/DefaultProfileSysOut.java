package pl.kocan.springframeworkdevopsonaws.profilesysout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("default")
public class DefaultProfileSysOut {

    @Autowired
    public DefaultProfileSysOut(@Value("${pl.kocan.springframeworkdevopsonaws.profile.message}") String msg) {

        System.out.println("#############################");
        System.out.println("#############################");
        System.out.println("#############################");
        System.out.println("#############################");
        System.out.println("#########    DEV     ########");
        System.out.println(msg);
        System.out.println("#############################");
        System.out.println("#############################");
        System.out.println("#############################");
        System.out.println("#############################");
    }
}