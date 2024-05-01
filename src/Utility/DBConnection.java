package Utility;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DBConnection {

    private static final Logger logger = Logger.getLogger(DBConnection.class.getName());
    private static final String FICHIER_PROPERTIES = "Utility/DatabaseConfig.properties";
    private static final String PROPERTY_URL = "SGBD.URL";
    private static final String PROPERTY_DRIVER = "SGBD.DRIVER";
    private static final String PROPERTY_NOM_USER = "SGBD.USER";
    private static final String PROPERTY_PASSWORD = "SGBD.PASSWORD";

    /**
     * Méthode chargée de récupérer les informations de connexion à la base de
     * données, charger le driver JDBC et retourner une instance connexion à la
     * base de données
     *
     * @return
     * @throws SQLException
     * @throws BibalExceptions
     */
    public static Connection getConnection() throws SQLException, BibalExceptions {

        String url;
        String driver;
        String nomUtilisateur;
        String motDePasse;

        Properties properties = new Properties();
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream fichierProperties = classLoader.getResourceAsStream(FICHIER_PROPERTIES);

        if (null == fichierProperties) {
            String errorMessage = "Le fichier properties '" + FICHIER_PROPERTIES.toUpperCase() + "' est introuvable";
            logger.log(Level.SEVERE, errorMessage);
            throw new BibalExceptions(errorMessage);
        }

        try {
            properties.load(fichierProperties);
            url = properties.getProperty(PROPERTY_URL);
            driver = properties.getProperty(PROPERTY_DRIVER);
            nomUtilisateur = properties.getProperty(PROPERTY_NOM_USER);
            motDePasse = properties.getProperty(PROPERTY_PASSWORD);
        } catch (IOException ex) {
            String errorMessage = "Impossible de charger le fichier properties '" + FICHIER_PROPERTIES.toUpperCase() + "'";
            logger.log(Level.SEVERE, errorMessage, ex);
            throw new BibalExceptions(errorMessage, ex);
        }

        try {
            Class.forName(driver);
        } catch (Exception e) {
            String errorMessage = "Le driver " + PROPERTY_DRIVER.toUpperCase() + " est introuvable";
            logger.log(Level.SEVERE, errorMessage, e);
            throw new BibalExceptions(errorMessage, e);
        }

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, nomUtilisateur, motDePasse);

            logger.log(Level.INFO, "Connexion à la base de données établie avec succès");
        } catch (SQLException e) {
            String errorMessage = "Impossible de se connecter à la base de données";
            logger.log(Level.SEVERE, errorMessage, e);
            throw new BibalExceptions(errorMessage, e);
        }

        return connection;
    }
}
