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
    /* Get actual class name to be printed on */
    static Logger log = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        log.info("Find pom.xml");


    }
}