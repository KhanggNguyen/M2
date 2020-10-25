<?php

class Hello {

    function __construct(String $name) {
        $this->name = $name;
    }
    
    function hello2Me() : String {
        return 'Hello ' . $this->name;
    }
}

$hello = new Hello('Guillaume');
echo $hello->hello2Me();
