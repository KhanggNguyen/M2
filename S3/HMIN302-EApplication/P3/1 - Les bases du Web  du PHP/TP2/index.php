<?php

$lang = 'fr';
$charset = 'utf-8';
$title = 'TP n°1';

/**
 * Get accronym from string
 *
 * @param string $string String to transform
 * @return string
 */
function accronym(String $string) : String {
    // @TODO
   
    return 'TODO';
}


/**
 * Get Syracuse conjecture from int
 *
 * @param int $int Int value to conjectured
 * @return string
 */
function syracuse(Int $int) : String {
    // @TODO
   
    return 'TODO';
}


/**
 * Get randum Chuck Norris fact from JSON file
 *
 * @param int $nb number of facts
 * @return array Array of string
 */
function getFacts(Int $nb) : Array {
    // @TODO
   
    return array('TODO');
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
        <h2>Exercice n°1: Acronyme</h2>
        <p>Créez une fonction qui prend en argument une string et qui retourne les initiales de chaque mot en majuscule.</p>
        <p><?= accronym('PHP: Hypertext Preprocessor') ?>
    </article>
    
    <article>
        <h2>Exercice n°2: Conjecture de Syracuse</h2>
        <p> Créez une fonction qui prend comme argument n'importe quel nombre entier supérieur à zéro, si le nombre est pair divisez-le par 2, si le nombre est impair multipliez-le par 3 et ajoutez 1. Au final votre fonction doit retourner une série de nombre, le dernier de ces nombres doit être le chiffre 1.</p>
        <ul>
            <li><?= syracuse(-1) ?></li>
            <li><b>25</b> <?= syracuse(25) ?></li>
            <li><b>51</b> <?= syracuse(51) ?></li>
        </ul>
    </article>
    
    <article>
        <h2>Exercice n°3: Lecture de fichier</h2>
        <p>Ouvrir le ficher "chuck.json", et sortir aléatoirement 5 Chuck Norris facts.</p>
        
        <ul>
        <?php foreach(getFacts(5) as $fact): ?>
            <li><?= $fact ?></li>
        <?php endforeach ?>
        </ul>
    </article>
</body>
</html>
