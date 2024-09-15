package com.springlectures.week1Intro.introductionToSpringBoot;
import com.springlectures.week1Intro.introductionToSpringBoot.AliceAndBakery.CakeBakerService;
import com.springlectures.week1Intro.introductionToSpringBoot.AliceAndBakery.ChocolateCakeBaker;
import com.springlectures.week1Intro.introductionToSpringBoot.AliceAndBakery.StrawberryCakeBaker;
import com.springlectures.week1Intro.introductionToSpringBoot.DependencyInjection.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductionToSpringBootApplication implements CommandLineRunner {
	@Autowired // this is how field injection is done
	Apple myApple1;

	@Autowired
	Apple myApple2;

	@Autowired
	Orange myOrange1;

	@Autowired
	Orange myOrange2;

	@Autowired
    DbService dBs;

	@Autowired
	CakeBakerService cakeBakerService;

	public static void main(String[] args) {
		SpringApplication.run(IntroductionToSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		myApple1.eatApple();
		myApple2.eatApple();

		myOrange1.eatOrange();
		myOrange2.eatOrange();

		// hash codes for myApple1 and myApple2 are same (singleton scope)
		System.out.println("Apple 1 hashCode: " + myApple1.hashCode());
		System.out.println("Apple 1 hashCode: " + myApple2.hashCode());

		// hash codes for myOrange1 and myOrange2 are different (prototype scope)
		System.out.println("Orange 1 hashCode: " + myOrange1.hashCode());
		System.out.println("Orange 2 hashCode: " + myOrange2.hashCode());

		System.out.println("Dev Data is: " + dBs.getData());

		cakeBakerService.bakeChocolateCake();
		cakeBakerService.bakeStrawberryCake();
	}
}