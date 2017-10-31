/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da.platform.ariticmail.api;

/**
 *
 * @author Narasimha
 */

public class Version {

    /*
    TODO: Getting Messages, sending raw    
    */
        public Version() {

        }

        private final String buildNumber = "1.0.0.1";
        private final String buildName = "AriticMail Java Client";
        private final String author = "Narasimha";

        /**
         * @return the buildNumber
         */
        public String getBuildNumber() {
                return buildNumber;
        }

        /**
         * @return the buildName
         */
        public String getBuildName() {
                return buildName;
        }

        /**
         * @return the author
         */
        public String getAuthor() {
                return author;
        }

}