# HMIN306 Evolution 2020 - 2021
## Rapport de TP Moose 
**Binôme :**

NGUYEN Huu Khang (21506865)

TRAN Thi Tra My (21511002)

**S'échauffer**

    viewClassDiagram: model
	| view node |
	
	view := RTMondrian new.
	node := model allModelClasses.
	view nodes: node.
	view edgesFrom: #superclass.
	view layout tree.
	view build.
	^view view.

    godClassesByLines: model 
	| orderedCollection | 
	orderedCollection := OrderedCollection new.
	orderedCollection := model allModelClasses select:
		[ :class | (class numberOfLinesOfCode > 500) ].
	^orderedCollection .

    deadCodeByMethods: model 
	| orderedCollectionMethods |
	orderedCollectionMethods := OrderedCollection new.
	orderedCollectionMethods := model allModelMethods select: [ :method |
		  method isDead].
	^ orderedCollectionMethods.

    cyclomaticComplexityOfMethods: model 
	^model allModelMethods sum: #cyclomaticComplexity.

    deprecatedMethods: model
	| orderedCollectionMethods |
	orderedCollectionMethods := OrderedCollection new.
	orderedCollectionMethods := model allModelMethods select: [ :method |
		method annotationInstances isNotEmpty 
		and: [ method annotationTypes anySatisfy:
			[ :type | type name = 'Deprecated' ] ] ].
	^ orderedCollectionMethods.

1. Question 1 : Hiérarchie de paquetage avec les classes à l’intérieur des paquetages dans la visualisation. La taille de chaque classe correspondra à son nombre de ligne de code.

    Réponse : Les solutions sont dans les méthodes **hierarchicalPackage:**, **hierarchicalPackageWithClasses:**. 
    ```Smalltalk
    hierarchicalPackage: model 
	| p | 
	p := RTMondrian new.
	p shape rectangle;
		width: [ :namespace | namespace classes size ];
		height: [ :namespace | namespace methods size ].
	p nodes: model allModelNamespaces.
	p edgesFrom: #parentScope.
	p layout tree.
	p build.
	^p view.
    ```
    
    ```Smalltalk
    hierarchicalPackageWithClasses: model 
	| p | 
	p := RTMondrian new.
	p shape rectangle;
		width: [ :namespace | namespace classes size ];
		height: [ :namespace | namespace methods size ].
	p nodes: model allModelNamespaces forEach: [ :c | 
		p shape rectangle;
			size: [ :class | class numberOfLinesOfCode  ].
		p nodes: c classes.
		p edges connectFrom: #superclass.
		p layout tree ].
	p edgesFrom: #parentScope.
	p layout tree.
	p build.
	^p view.
    ```

2. Question 2 : Quelles sont les classes les plus importantes (en termes de ligne de code ? de complexité ?) ? Est-ce que l’on si attend ? 

    Réponse : Les solutions sont dans les méthodes **mostImportantClassesByLinesOfCode:**, **mostImportantClassesByComplexity:**. Nous avons comparé pour chaque classe sa complexité/le nombre lignes de code avec la moyenne de la complexité/des lignes de code du modèle RCA. Il nous semble d'avoir beaucoup de classes qui est supérieure à la moyenne du modèle. 
    ```Smalltalk
    mostImportantClassesByLinesOfCode: model
	| averageLinesOfCode orderedCollectionClasses |
	averageLinesOfCode := (self totalLinesOfCode: model) / model allModelClasses size.
	orderedCollectionClasses := model allModelClasses select: [ :class |
		(class numberOfLinesOfCode > averageLinesOfCode) ].
	^orderedCollectionClasses.
    ```

    ```Smalltalk
    mostImportantClassesByComplexity: model
	| averageComplexity orderedCollectionClasses |
	averageComplexity := self averageComplexityOfMethods: model.
	orderedCollectionClasses := model allModelClasses select: [ :class |
		((class methods sum: #cyclomaticComplexity) > averageComplexity) ].
	^orderedCollectionClasses.
    ```
    Les méthodes complémentaires : 

    ```Smalltalk
    averageComplexityOfMethods: model
	^((model allModelMethods sum: #cyclomaticComplexity) / model allModelClasses size) ceiling .
    ```

    ```Smalltalk
    totalLinesOfCode: model
	^model allModelClasses sum: #numberOfLinesOfCode.
    ```


3. Question 3 : Si demain (imaginons) les développeurs décident d’abandonner colt, pouvez-vous leurs indiquer où le framework est utilisé, et la complexité de supprimer colt pour chacun des endroits détectés ?

    Afin de détecter où le framework est utilisé, nous pouvons parcourir pour chaque ligne de code, on va vérifier s'il y a un type du framework colt. Ensuite, on va supprimer ou remplacer cet type par un nouveau.   

