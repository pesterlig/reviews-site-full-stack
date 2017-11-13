package reviewssitefullstack;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

// @ManyToOne and a @ManyToMany 

@Entity
public class Game {

	@Id
	@GeneratedValue
	private Long id;
	private String title;
	private String minutesToPlay;
	private String challengeLevel; 
	private String review;

	@ManyToOne
	private PlayerNum playerNum;

	// @ManyToMany
	// private Set<DescriptionTags> descriptionTags

	protected Game() {
		
	}

	public Game(String title, String minutesToPlay, String challengeLevel, String review, PlayerNum playerNum) {
		this.title = title;
		this.minutesToPlay = minutesToPlay;
		this.challengeLevel = challengeLevel;
		this.review = review;
		this.playerNum = playerNum;
	}

	@Override
	public String toString() {
		return title;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getMinutesToPlay() {
		return minutesToPlay;
	}

	public String getChallengeLevel() {
		return challengeLevel;
	}

	public String getReview() {
		return review;
	}

	public PlayerNum getPlayerNum() {
		return playerNum;
	}
	

}
