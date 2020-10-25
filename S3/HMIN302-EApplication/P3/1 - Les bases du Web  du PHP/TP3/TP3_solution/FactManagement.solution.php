<?php
/**
 * Class who manage Chuck norris facts
 */
class FactManagement {

    /**
     * PDO connection
     */
    private $connection = false;

    /**
     * Constructor
     */
    public function __construct() {
        require ROOT_PATH . '/db_config.php';

        // DB connection
        try {
            $this->connection = new \PDO("$dbDriver:host=$dbHost;dbname=$dbName", $dbUser, $dbPwd);
        } catch(Exception $e) {
            var_dump($e);
        }
    }
 

    /**
     * Import fact from JSON
     */
    public function import() {
        	
        foreach (self::getFactsFromJSON() as $fact) {
            // Insertion dans la base de donnée
            $statement = $this->connection->prepare("INSERT INTO facts (fact, date, vote, points) VALUES (:fact, :date, :vote, :points)");
        	$statement->bindParam('fact', $fact->fact, PDO::PARAM_STR);
        	$statement->bindParam('date', $fact->date);
            $statement->bindParam('vote', $fact->vote);
            $statement->bindParam('points', $fact->points);
	    	$statement->execute();
        }
    }
    
    
    /**
     * Get top of fact
     *
     * @param integer $limit Limit to get
     * @return array Array of facts
     */
     public function getTop($limit = 10) {
        $sth = $this->connection->prepare('SELECT fact FROM facts ORDER BY points DESC LIMIT :limit');
        $sth->bindValue(':limit', (int)$limit, PDO::PARAM_INT); // /!\ $limit must be a int
        $sth->execute();
        $result = $sth->fetchAll(PDO::FETCH_OBJ);
        
        return $result;
    }

       
    /**
     * Get randum Chuck Norris fact from JSON file
     *
     * @param int $nb number of facts
     * @return array Array of string
     */
    private static function getFactsFromJSON() {
        $file = dirname(__FILE__) . '/chuck.json';
        
        return json_decode(file_get_contents($file));
    }

}
