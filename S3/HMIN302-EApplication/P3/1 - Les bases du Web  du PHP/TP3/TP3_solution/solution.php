<?php

// Define path
define('ROOT_PATH' , __DIR__);

$lang = 'fr';
$charset = 'utf-8';
$title = 'Solution du TP n°2';

// Get action from $_POST
$action = (empty($_POST['action'])) ? false : $_POST['action'];

// Define autoload
function __autoload($classname) {
    $filename = ROOT_PATH . '/' . $classname . '.solution.php';
    require_once($filename);
}

?>
<!DOCTYPE html>
<html lang="<?= $lang ?>">
<head>
  <meta charset="<?php echo $charset; ?>">
  <title><?= $title ?></title>
</head>
<body>
<h1><?= $title ?></h1>
    <article>
        <h2>Exercice n°1: PDO et objet</h2>
        <p>Ecrire une casse permettant de mettre en base les Chuck norris facts et de les lister. Pour celà, configurez les accès à la base de données (db_config.php) et complétez la classe FactManagement.</p>
    
        <?php if ($action === false) : ?>
        <form method="post" action="">
            <p>Que voulez vous faire ?</p>
            <ul>
                <li><input type="radio" name="action" checked="checked" value="list"/> Lister</li>
                <li><input type="radio" name="action" value="import" /> Importer</li>
            </ul>
            
            <input type="submit" value="Go !" />
        </form>
        <?php else :
            if ($action === 'import') {
                echo 'Import...';
                $factManagement = new FactManagement();
                $factManagement->import();
                echo "\n" . 'Done.';
            } else {
                $factManagement = new FactManagement();
                echo '<ul>';
                foreach ($factManagement->getTop() as $fact) {
                    echo '<li>' . $fact->fact . '</li>';
                }
                echo '</ul>';
            }
            
        endif ?>
    </article>
</body>
</html>
