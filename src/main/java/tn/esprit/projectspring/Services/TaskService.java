package tn.esprit.projectspring.Services;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    @Scheduled(fixedRate = 30000)
    public void fixedRateMethod() {
        System.out.println("Fixed Rate every 60 seconds");
    }
//run kol 30 sc hata kn methode t5dm
@Scheduled(fixedRate = 30000)
    public void task1() {
        System.out.println("Runs every 60 seconds");
    }

    //yestene 30 sc baed maykaml
    @Scheduled(fixedDelay = 30000)
    public void task2() {
        System.out.println("60 seconds after finishing last execution");
    }

    @Scheduled(cron = "*/10 * * * * *")
    public void cronTask() {
        System.out.println("Every 10 seconds");
    }
 //with timezone
    @Scheduled(cron = "*/10 * * * * *", zone = "Europe/Istanbul")
    public void cronTaskZone() {
        System.out.println("Cron with timezone");
    }
}
