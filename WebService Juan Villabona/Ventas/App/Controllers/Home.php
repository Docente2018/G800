<?php

namespace App\Controllers;

use \Core\View;
use \App\Models;

class Home extends \Core\Controller
{
    public function index()
    {    	
        View::renderTemplate('Home','index');
    }
   
}
