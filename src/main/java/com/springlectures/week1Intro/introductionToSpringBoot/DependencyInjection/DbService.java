package com.springlectures.week1Intro.introductionToSpringBoot.DependencyInjection;
import org.springframework.stereotype.Service;

@Service
public class DbService {

//    @Autowired
//    DevDb devDb;
//    @Autowired
//    ProdDb prodDb;

    private final DB db; // this should be made final here since no new instance is needed

    // this is how constructor injection is done
    public DbService(DB db) {
        this.db = db;
    }

    public String getData() {
        return db.getDataFromDb();
    }
}