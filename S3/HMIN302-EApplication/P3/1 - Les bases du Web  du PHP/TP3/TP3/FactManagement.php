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
            // @TODO
        } catch(Exception $e) {
            var_dump($e);
        }
    }
 

    /**
     * Import fact from JSON
     */
    public function import() {
        	
        foreach (self::getFactsFromJSON() as $fact) {
            // @TODO
        }
    }
    
    
    /**
     * Get top of fact
     *
     * @param integer $limit Limit to get
     * @return array Array of facts
     */
     public function getTop($limit = 10) {
        // @TODO
        
        return array();
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
