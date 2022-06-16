package com.qa.constructors;

public class Artist {

	//Attributes
	public String artistName;
	public String album;
	public int releaseDate;
	
	//Methods
	public Artist(String name, String album, int releaseDate) {
		this.artistName = name;
		this.album = album;
		this.releaseDate = releaseDate;
	}
}
