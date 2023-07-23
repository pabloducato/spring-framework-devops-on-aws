package pl.kocan.springframeworkdevopsonaws.profilesysout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("qa")
public class QaProfileSysOut {

    @Autowired
    public QaProfileSysOut(@Value("${pl.kocan.springframeworkdevopsonaws.profile.message}") String msg) {

        System.out.println("#############################");
        System.out.println("#############################");
        System.out.println("#############################");
        System.out.println("#############################");
        System.out.println("#########    QA      ########");
        System.out.println(msg);
        System.out.println("#############################");
        System.out.println("#############################");
        System.out.println("#############################");
        System.out.println("#############################");
    }
}
