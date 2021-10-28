/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author Osadolor Ebhuoma
 */
public class TestUserprofile {
    
    private String userName;//the user name
    private String genre;// the user's preferred genre of movie
    private String[] genres = {"Comedy", "Drama", "Action", "Mystery"};//available genres of movies
    
    /**
     * A constructor that takes in the user name and the favourite genre
     * @param givenGenre
     */
    public TestUserprofile (givenName, String givenGenre)
    {
        String givenName = null;
        userName = givenName;
        genre= givenGenre;
    }

    /**
     * A getter for the userName
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * A getter for the genre
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    private static class givenName {

        public givenName() {
        }
    }
    
    
    
    
}
