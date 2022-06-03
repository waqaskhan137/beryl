package beryl;

import org.apache.log4j.Logger;

/**
 * Scan the project
 * Fetch the pom file
 * get dependencies
 * check dependency version vulnerabilities
 * Check latest version of the dependency
 * Generate a report
 * Suggest Changes
 * Make changes.
 */

public class App {
    static Logger log = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        log.debug("======== Starting beryl ========");
        log.info("Find pom.xml");
        // TODO: 6/3/2022 Write a file scanner
        log.info("parse pom.xml");
        // TODO: 6/3/2022 write a parser
        log.info("check dependencies latest versions");
        // TODO: 6/3/2022 integrate maven central lib
        // TODO: 6/3/2022 Write Dependencies Analysis Engine.
        log.info("find diff of the versions of the dependencies");
        log.info("Find the vulnerabilities of current versions");
        log.info("Find the vulnerabilities of latest versions");

    }
}